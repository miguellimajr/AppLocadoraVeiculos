package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import conexao.Conexao;
import negocio.Passeio;



public class PasseioDao {
	
	public static Passeio obterPorId(int id) {
		String sql = "SELECT * FROM TPasseio WHERE id = ?";
		
		PreparedStatement ps = null;
		
		try {			
			ps = Conexao.obterConexao().prepareStatement(sql);
			ps.setInt(1, id);
			
			ResultSet rs = null;
			
			rs = ps.executeQuery();
			
			if(rs.next()){
				Passeio p = new Passeio();
				
				p.setId(rs.getInt("id"));
				p.setNome(rs.getString("nome"));
				p.setPlaca(rs.getString("placa"));
				p.setMarca(rs.getString("marca"));
				p.setModelo(rs.getString("modelo"));
				p.setAno(rs.getInt("ano"));
				p.setValorCarro(rs.getFloat("valorcarro"));
				p.setSeguro(rs.getFloat("seguro"));	
				p.setTipoDeTeto(rs.getString("teto"));
				p.setTipoDeBanco(rs.getString("banco"));	
				p.setRadio(rs.getString("radio"));
				
				return p;
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return null;		
	}
	
	public static boolean excluir(int id){
		String sql = "DELETE FROM TPasseio WHERE id = ?";
		
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
	
	public static List<Passeio> obterLista(){
		String sql = "SELECT * FROM TPasseio ORDER BY nome";		
		List<Passeio> lista = null;		
		PreparedStatement ps = null;		
		try {
			lista = new ArrayList<Passeio>();			
			ps = Conexao.obterConexao().prepareStatement(sql);			
			ResultSet rs = null;			
			rs = ps.executeQuery();			
			while(rs.next()){
				lista.add(
					new Passeio(
							rs.getInt("id"),
							rs.getString("nome"), 
							rs.getString("placa"),
							rs.getString("marca"), 
							rs.getString("modelo"), 							
							rs.getInt("ano"),
							rs.getFloat("valorcarro"),
							rs.getFloat("seguro"),
							rs.getString("teto"),
							rs.getString("banco"),
							rs.getString("radio")
					
					)
				);
			}			
			return lista;			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return lista;		
	}
	
	public static boolean incluir(Passeio passeio) {
		String sql = "INSERT INTO TPasseio(nome, placa, marca, modelo, ano, valorcarro, seguro, teto, banco, radio ) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?,?)";
		
		PreparedStatement ps = null;
		
		try {			
			ps = Conexao.obterConexao().prepareStatement(sql);
			ps.setString(1, passeio.getNome());
			ps.setString(2, passeio.getPlaca());
			ps.setString(3, passeio.getMarca());
			ps.setString(4, passeio.getModelo());
			ps.setInt(5, passeio.getAno());
			ps.setFloat(6, passeio.getValorCarro());
			ps.setFloat(7, passeio.getSeguro());
			ps.setString(8, passeio.getTipoDeTeto());
			ps.setString(9, passeio.getTipoDeBanco());
			ps.setString(10, passeio.getRadio());
			
						
			ps.execute();
			
			return true;
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return false;
	}
	

}

