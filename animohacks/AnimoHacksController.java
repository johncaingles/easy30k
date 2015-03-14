/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animohacks;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Kingston
 */
public class AnimoHacksController
{
   private AnimoHacksModel ahm;
   private String imageLocation;
   private String selectedOrg;
   private String name1;
   private String pass1;
   private ArrayList<Post> postlist;

    public AnimoHacksController(AnimoHacksModel ahm)
    {
        this.ahm = ahm;
    }

   
    public void SelectOrg() throws SQLException
    {
       ArrayList<String> orgs = new ArrayList<>();
       ResultSet rs = ahm.getCompanyName();
         while (rs.next()) {
            String orgName = rs.getString("name");
            orgs.add(orgName);
        }
         String organizations[]=orgs.toArray(new String[orgs.size()]);
       JFrame frame = new JFrame("Selecting Organization");
        selectedOrg = (String) JOptionPane.showInputDialog(frame, 
        "Which organization will you donate to","Selecting an Organizatin",JOptionPane.QUESTION_MESSAGE, null,
         organizations, 
        organizations[0]);
    
       ResultSet fileLocation = ahm.getFileLocation(selectedOrg);
           while (fileLocation.next()) {
            String logo = fileLocation.getString("logo");
            this.imageLocation = logo;
   
        }

       
     }
       public String getImageLocation()
       {
       return imageLocation;
       }
       
       public String getSelectedOrg()
       {
       return selectedOrg;
       }



    public boolean checkAccount(String text, String string) throws SQLException
    {
        ResultSet rs = null; 
        rs = ahm.checkAccount(text,string);
         while (rs.next()) {
            String name = rs.getString("username");
            String pass = rs.getString("password");

            name1=name;
            pass1=pass;
        }
         
       if(name1== null)
           return false;
       else{
           name1=null;
           pass1=null;
           return true;
           }
      
      
       
    }

    public void CreateMain() throws SQLException
    {
       //Post postarr = new Post();
       postlist = new ArrayList<Post>();
       ResultSet rs = ahm.getPost();
       
       while (rs.next()) {
            String companyid = rs.getString("companyid");
            String message = rs.getString("message");
            String item1 = rs.getString("item1");
            String item2 = rs.getString("item2");       
            String item3 = rs.getString("item3");
            String item4 = rs.getString("item4");
            String item5 = rs.getString("item5");
            String quan1 = rs.getString("item1quantity");
            String quan2 = rs.getString("item2quantity");
            String quan3 = rs.getString("item3quantity");
            String quan4 = rs.getString("item4quantity");
            String quan5 = rs.getString("item5quantity");
            String donated = rs.getString("donated");
            String target = rs.getString("target");
            
            postlist.add( new Post(companyid,message,item1,item2,item3,item4,item5,quan1,quan2,quan3,quan4,quan5,donated,target) );
        }
    }
    
    public ArrayList<Post> getPost()
    {
       return postlist;
    
    }
}
