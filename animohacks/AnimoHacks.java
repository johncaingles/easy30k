/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animohacks;

import guis.MainView;

/**
 *
 * @author Kingston
 */
public class AnimoHacks
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
      DBConnection dbc = new DBConnection();
      AnimoHacksModel ahm = new AnimoHacksModel(dbc.getConnection());  
      AnimoHacksController ahc = new AnimoHacksController(ahm);
      
      MainView mainview = new MainView();
      mainview.setController(ahc);
      
      
      
      mainview.setVisible(true);
    }
    
}
