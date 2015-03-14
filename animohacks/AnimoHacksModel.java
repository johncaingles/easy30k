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
		{
			//con = db.getConnection();
			statement = con.createStatement();
			String sql = "SELECT name FROM company";
			rs = statement.executeQuery(sql);
                        
		} catch (Exception e)
		{
			e.getMessage();
		}
		return rs;
    }

    public ResultSet getFileLocation(String name)
    {
         ResultSet rs = null;
		try
		{
			//con = db.getConnection();
			statement = con.createStatement();
			String sql = "SELECT logo FROM company WHERE name = '"+name+"'";
			rs = statement.executeQuery(sql);
                        
		} catch (Exception e)
		{
			e.getMessage();
		}
		return rs;
    }

    public ResultSet checkAccount(String user, String pass)
    {
        ResultSet rs = null;
		try
		{
			//con = db.getConnection();
			statement = con.createStatement();
			String sql = "SELECT username, password FROM accounts WHERE username = '"+user+"' AND password = '"+pass+"'";
			rs = statement.executeQuery(sql);
                        
		} catch (Exception e)
		{
			e.getMessage();
		}
		return rs;
        
    }

    public ResultSet getPost()
    {
        ResultSet rs = null;
		try
		{
			//con = db.getConnection();
			statement = con.createStatement();
			String sql = "SELECT companyid,message,item1,item2,item3,item4,item5,item1quantity,item2quantity,item3quantity,item4quantity,item5quantity,donated,target FROM request";
			rs = statement.executeQuery(sql);
                        
		} catch (Exception e)
		{
			e.getMessage();
		}
		return rs;
    }
    
}
