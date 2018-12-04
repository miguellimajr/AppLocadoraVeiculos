package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import conexao.Conexao;
import negocio.Cliente;

public class ClienteDao {
	
	public static Cliente obterPorId(int id) {
		String sql = "SELECT * FROM TCliente WHERE id = ?";
		
		PreparedStatement ps = null;
		
		try {			
			ps = Conexao.obterConexao().prepareStatement(sql);
			ps.setInt(1, id);
			
			ResultSet rs = null;
			
			rs = ps.executeQuery();
			
			if(rs.next()){
				Cliente c = new Cliente();
				
				c.setId(rs.getInt("id"));
				c.setNome(rs.getString("nome"));
				c.setCpf(rs.getString("cpf"));				
				c.setTelefone(rs.getString("telefone"));
			    c.setEndereco(rs.getString("endereco"));
			    c.setIdade(rs.getInt("idade"));
				c.setRendaMensal(rs.getFloat("renda"));											
				
				return c;
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return null;		
	}
	
	public static boolean excluir(int id){
		String sql = "DELETE FROM TCliente WHERE id = ?";
		
		PreparedStatement ps = null;
		
		try {
			
			ps = Conexao.obterConexao().prepareStatement(sql);
			ps.setInt(1, id);
			
			ps.execute();
			
			return true;
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return false;
	}
	
	public static List<Cliente> obterLista(){
		String sql = "SELECT * FROM TCliente ORDER BY nome";		
		List<Cliente> lista = null;		
		PreparedStatement ps = null;		
		try {
			lista = new ArrayList<Cliente>();			
			ps = Conexao.obterConexao().prepareStatement(sql);			
			ResultSet rs = null;			
			rs = ps.executeQuery();			
			while(rs.next()){
				lista.add(
					new Cliente(
							rs.getInt("id"),
							rs.getString("nome"), 
							rs.getString("cpf"),
							rs.getString("telefone"),
							rs.getString("endereco"),														
							rs.getInt("idade"),
							rs.getFloat("renda")							
					)
				);
			}			
			return lista;			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return lista;		
	}
	
	public static boolean incluir(Cliente cliente){
		String sql = "INSERT INTO TCliente(nome, cpf, telefone, endereco, idade, renda) VALUES (?, ?, ?, ?, ?, ?)";
		
		PreparedStatement ps = null;
		
		try {			
			ps = Conexao.obterConexao().prepareStatement(sql);
			ps.setString(1, cliente.getNome());
			ps.setString(2, cliente.getCpf());
			ps.setString(3, cliente.getTelefone());
			ps.setString(4, cliente.getEndereco());
			ps.setInt(5, cliente.getIdade());
			ps.setFloat(6, cliente.getRendaMensal());
						
			ps.execute();
			
			return true;
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return false;
	}
	

}

