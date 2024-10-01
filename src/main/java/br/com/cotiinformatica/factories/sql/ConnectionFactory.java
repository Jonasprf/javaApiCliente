package br.com.cotiinformatica.factories.sql;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionFactory {
	/*
	 * método para criar e retornar um conexão
	 * com o banco de dados do mysql
	 * 
	 * */
	
	public Connection getConnection() {
		
		try {
			
			var host = "JDBC:mysql://localhost:3306/bdApiCliente";
			var user = "root";
			var pass = "coti";
			
			return DriverManager.getConnection(host, user ,pass);
			
			
		}
		catch(Exception e) {
			//imprimir o log do erro no console do servidor
			e.printStackTrace();
			return null;
		}
	}

}
