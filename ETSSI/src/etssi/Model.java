package etssi; 

import java.sql.*;

public class Model 
{
    // VARIABLES
    private Connection connection; 
    private String querry;
    private ResultSet resultSet;
    private Statement statement;
    private PreparedStatement preparedStatement;
    
    // CONSTRUCTOR
    public Model()
    {
        try
	{
            Class.forName("com.mysql.jdbc.Driver");	
	    this.connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/CSV_DB?autoReconnect=true&useSSL=false","root","ymejbe47");     
        }
	catch(Exception e)
	{            
            e.printStackTrace();
	}   
    }
    
    // METHODS
    public ResultSet select(String jour)
    {
        try 
        {
            this.querry = "SELECT * FROM comptage WHERE jour = '" + jour + "'";
            this.statement = this.connection.createStatement();
            this.resultSet = this.statement.executeQuery(querry);
        } 
        catch (Exception e) 
        {
            e.printStackTrace();
        }
        return this.resultSet;
    }
}
