package app;

import java.sql.Connection;
import java.sql.DriverManager;
//import java.sql.PreparedStatement;
import java.sql.ResultSet;
//import java.sql.SQLException;
import java.sql.Statement;
//import java.util.logging.Level;
//import java.util.logging.Logger;

public class Delete implements java.io.Serializable{
	private String parola;
    private String significato;
    //private String risposta;
	public Delete(){
		
	}
	public void setParola(String par){
		parola=par;
	}
	
	public String getRisultato(){
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/dizionario","root", "");
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