/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animohacks;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author Kingston
 */
public class AnimoHacksModel
{
    private Connection con;
    private Statement statement;

    public AnimoHacksModel(Connection connection)
    {
       this.con = connection;
    }

    public ResultSet getCompanyName()
    {
        		ResultSet rs = null;
		try
		{   System.out.println("SEX");
                       
			statement = con.createStatement();
			String sql = "SELECT name FROM company";
			rs = statement.executeQuery(sql);
		} catch (Exception e)
		{
			e.getMessage();
		}
		return rs;
    }
    
}
