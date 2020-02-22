package servlet;

import java.sql.Connection;
import java.sql.DriverManager;
//import java.sql.PreparedStatement;
//import java.sql.ResultSet;
//import java.sql.SQLException;
import java.sql.Statement;
//import java.util.logging.Level;
//import java.util.logging.Logger;

public class Delete implements java.io.Serializable{
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;
	private String parola;
    //private String significato;
    //private String risposta;
	public Delete(){
		
	}
	public void setParola(String par){
		parola=par;
	}
	
	public String getRisultato(){
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://eu-cdbr-west-02.cleardb.net:3306/heroku_33da02306540a41","b3043c631fc184", "8259b3e4");
			Statement stmt = con.createStatement();
            if(stmt.executeUpdate("DELETE FROM indice WHERE  parola='" + parola + "'")==0){
                return "termine non trovato";
            }
            else{
                return "termine cancellato";
            }
            
			
		}catch(Exception e){
			return "erroreqqq";
		}
	}

	
}