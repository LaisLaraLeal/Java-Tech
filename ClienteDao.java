package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import Util.Conexao;

public class ClienteDao {
	
	Connection con;
	ResultSet rs;
	
	
	public void Salvar(Cliente cli) {
		try {
			
		con = new Conexao().conectar();
		
		String sql="insert into cliente(nome,telefone)values(?,?)";
		
		PreparedStatement stmt = con.prepareStatement(sql);
		stmt.setString(1,cli.getNome());
		stmt.setString(2,cli.getTelefone());
		stmt.executeUpdate();
		
		stmt.close();
		
	}
		
		catch(Exception erro) {
			
	}
	}
	
	public ArrayList<Cliente>Listar(){
    try {
    	
    	con = new Conexao().conectar();
    	ArrayList<Cliente>Clientes = new ArrayList<>();
    	String sql = "select * from cliente";
    	PreparedStatement stmt = con.prepareStatement(sql);
    	rs = stmt.executeQuery();
    	while (rs.next()) {
    		int idcliente = rs.getInt(1);
    		String nome = rs.getString(2);
    		String telefone = rs.getString(3);
    		Clientes.add(new Cliente(idcliente,nome,telefone));
    		
    	}
    	
    	return Clientes;
    	
  
    }
    catch (Exception erro) {
        System.out.println(erro);
        return null;
      
	}
		

}
}
