/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animohacks;

import guis.LoginView;
import guis.MainView;
import java.io.IOException;

/**
 *
 * @author Kingston
 */
public class AnimoHacks
{

private DBConnection dbc;
    public static void main(String[] args) throws IOException
    {
      DBConnection dbc = new DBConnection();
      AnimoHacksModel ahm = new AnimoHacksModel(dbc.getConnection());  
      AnimoHacksController ahc = new AnimoHacksController(ahm);
      LoginView gui = new LoginView(ahc);
      gui.go();
      //MainView mainview = new MainView();
      //mainview.setController(ahc);
      //mainview.setVisible(true);
    }
    
}
