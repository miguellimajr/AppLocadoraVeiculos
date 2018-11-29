package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import conexao.Conexao;
import negocio.Caminhao;;



public class CaminhaoDao {
	
	public static Caminhao obterPorId(int id) {
		String sql = "SELECT * FROM TCaminhao WHERE id = ?";
		
		PreparedStatement ps = null;
		
		try {			
			ps = Conexao.obterConexao().prepareStatement(sql);
			ps.setInt(1, id);
			
			ResultSet rs = null;
			
			rs = ps.executeQuery();
			
			if(rs.next()){
				Caminhao c = new Caminhao();
				
				c.setId(rs.getInt("id"));
				c.setNome(rs.getString("nome"));
				c.setPlaca(rs.getString("placa"));
				c.setMarca(rs.getString("marca"));
				c.setModelo(rs.getString("modelo"));
				c.setAno(rs.getInt("ano"));
				c.setValorCarro(rs.getFloat("valorcarro"));
				c.setSeguro(rs.getFloat("seguro"));	
				c.setEixos(rs.getInt("eixos"));
				c.setTipoCacamba(rs.getString("cacamba"));											
				
				return c;
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return null;		
	}
	
	public static boolean excluir(int id){
		String sql = "DELETE FROM TCaminhao WHERE id = ?";
		
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
	
	public static List<Caminhao> obterLista(){
		String sql = "SELECT * FROM TCaminhao ORDER BY nome";		
		List<Caminhao> lista = null;		
		PreparedStatement ps = null;		
		try {
			lista = new ArrayList<Caminhao>();			
			ps = Conexao.obterConexao().prepareStatement(sql);			
			ResultSet rs = null;			
			rs = ps.executeQuery();			
			while(rs.next()){
				lista.add(
					new Caminhao(
							rs.getInt("id"),
							rs.getString("nome"), 
							rs.getString("placa"),
							rs.getString("marca"), 
							rs.getString("modelo"), 							
							rs.getInt("ano"),
							rs.getFloat("valorcarro"),
							rs.getFloat("seguro"),
							rs.getInt("eixos"),
							rs.getString("cacamba")
					
					)
				);
			}			
			return lista;			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return lista;		
	}
	
	public static boolean incluir(Caminhao caminhao){
		String sql = "INSERT INTO TCaminhao(nome, placa, marca, modelo, ano, valorcarro, seguro, eixos, cacamba ) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
		
		PreparedStatement ps = null;
		
		try {			
			ps = Conexao.obterConexao().prepareStatement(sql);
			ps.setString(1, caminhao.getNome());
			ps.setString(2, caminhao.getPlaca());
			ps.setString(3, caminhao.getMarca());
			ps.setString(4, caminhao.getModelo());
			ps.setInt(5, caminhao.getAno());
			ps.setFloat(6, caminhao.getValorCarro());
			ps.setFloat(7, caminhao.getSeguro());
			ps.setInt(8, caminhao.getEixos());
			ps.setString(9, caminhao.getTipoCacamba());
			
						
			ps.execute();
			
			return true;
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return false;
	}
	

}

