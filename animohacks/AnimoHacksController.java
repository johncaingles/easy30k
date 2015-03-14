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
}
