package app;

import java.sql.Connection;
import java.sql.DriverManager;
//import java.sql.PreparedStatement;
import java.sql.ResultSet;
//import java.sql.SQLException;
import java.sql.Statement;
//import java.util.logging.Level;
//import java.util.logging.Logger;

public class Aggiorna implements java.io.Serializable{
	private String parola;
    private String significato;
    //private String risposta;
	public Aggiorna(){
		
	}
	public void setParola(String par){
		parola=par;
	}
	public void setSignificato(String sig){
		significato=sig;
	}		
	public String getRisultato(){
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/dizionario","root", "");
            Statement stmt = con.createStatement();
            if(stmt.executeUpdate("UPDATE indice SET significato='" + significato + "' WHERE parola='" + parola + "'")==0){
                return "Termine non trovato";
            }
            else{
                return "termine modificato";
            }
		}catch(Exception e){
			return "errore";
		}
	}

	
}