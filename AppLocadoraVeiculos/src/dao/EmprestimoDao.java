package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import conexao.Conexao;
import negocio.Emprestimo;


// ADICIONAR DATA
public class EmprestimoDao {
	
	public static Emprestimo obterPorId(int id) {
		String sql = "SELECT * FROM TEmprestimo WHERE id = ?";
		
		PreparedStatement ps = null;
		
		try {			
			ps = Conexao.obterConexao().prepareStatement(sql);
			ps.setInt(1, id);
			
			ResultSet rs = null;
			
			rs = ps.executeQuery();
			
			if(rs.next()){
				Emprestimo e = new Emprestimo();
				
				e.setId(rs.getInt("id"));
				e.setFormaDePagamento(rs.getString("pagamento"));											
				
				return e;
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return null;		
	}
	
	public static boolean excluir(int id){
		String sql = "DELETE FROM TEmprestimo WHERE id = ?";
		
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
	
	public static List<Emprestimo> obterLista(){
		String sql = "SELECT * FROM TCaminhao ORDER BY nome";		
		List<Emprestimo> lista = null;		
		PreparedStatement ps = null;		
		try {
			lista = new ArrayList<Emprestimo>();			
			ps = Conexao.obterConexao().prepareStatement(sql);			
			ResultSet rs = null;			
			rs = ps.executeQuery();			
			while(rs.next()){
				lista.add(
					new Emprestimo(
							rs.getInt("id"),
							rs.getString("pagamento")					
					
					)
				);
			}			
			return lista;			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return lista;		
	}
	
	public static boolean incluir(Emprestimo emprestimo){
		String sql = "INSERT INTO TEmprestimo(pagamento) VALUES (?)";
		
		PreparedStatement ps = null;
		
		try {			
			ps = Conexao.obterConexao().prepareStatement(sql);
			ps.setString(1, emprestimo.getFormaDePagamento());			
						
			ps.execute();
			
			return true;
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return false;
	}
	

}

