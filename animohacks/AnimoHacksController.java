/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animohacks;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Kingston
 */
public class AnimoHacksController
{
public static final String[] pizzas = { "Cheese", "Pepperoni", "Sausage", "Veggie" };
    public void SelectOrg()
    {
       JFrame frame = new JFrame("Input Dialog Example 3");
    String favoritePizza = (String) JOptionPane.showInputDialog(frame, 
        "What is your favorite pizza?",
        "Favorite Pizza",
        JOptionPane.QUESTION_MESSAGE, 
        null,
         pizzas, 
        pizzas[0]);
       
     }
    
}
