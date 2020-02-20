package app;

import java.sql.Connection;
import java.sql.DriverManager;
//import java.sql.PreparedStatement;
import java.sql.ResultSet;
//import java.sql.SQLException;
import java.sql.Statement;
//import java.util.logging.Level;
//import java.util.logging.Logger;

public class Cerca implements java.io.Serializable{
	private String termine;
	private String risposta;
	public Cerca(){
		
	}
	public String getRisultato(){
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/dizionario","root", "");
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT parola, significato FROM indice WHERE parola='"+termine+"'");
			while(rs.next()){
				risposta= rs.getString("significato");
			}
			return risposta;
		}catch(Exception e){
			return "errore";
		}
	}
	public void setRisultato(String val){
		termine=val;
	}
	
}