
package model.DAO;

import model.*;
import model.DAO.*;
import controller.*;
import View.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class FichaAtendimentoDAO {
    
    List<FichaAtendimentoModel> listaFichas = new ArrayList<>();
    
    public void salvarFicha(FichaAtendimentoModel fichaASalvar, String estadoCivil, String moraCom){
  
        
        String sql = "INSERT INTO fichaatendimento(nome_aluno, data_nascimento, "
                + "telefone, rg, endereco, bairro, nome_pai, nome_mae, email_pai, email_mae,"
                + " estado_civil,"
                + "mora_com, telefone_pai, telefone_mae, escola_concluida, tipo_escola, ano_conclusao, concluido) "
                + "  VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?,  ?)";
	
	PreparedStatement ps = null;
	Connection connection = null;
  
	try {
		connection = new Conexao().getConexao();
		
		ps = connection.prepareStatement(sql);  
		ps.setString(1,fichaASalvar.getNome() );
		
                ps.setDate(2, new java.sql.Date(
                        fichaASalvar.getDataNascimento().getTime()));
                ps.setString(3, fichaASalvar.getTelefone());
                ps.setString(4, fichaASalvar.getRg());
                ps.setString(5, fichaASalvar.getEndereco());
                ps.setString(6, fichaASalvar.getBairro());
                ps.setString(7, fichaASalvar.getNomePai());
                 ps.setString(8, fichaASalvar.getNomeMae());
                ps.setString(9, fichaASalvar.getEmailPai());
                ps.setString(10, fichaASalvar.getEmailMae());
                
                if(estadoCivil.equals("Casados")){
                ps.setString(11, "Casados");
                 ps.setString(12, "Ambos os pais");
                }// fim if 
                
                 else if(estadoCivil.equals("Separados")){
                ps.setString(11, "Separados");
                  }// fim if 
                  
                 else  if(estadoCivil.equals("Outros")){
                               ps.setString(11, "Outros");
                    }// fim if
                 
               
                             
                if(estadoCivil.equals("Separados") || estadoCivil.equals(("Outros"))){
                if(moraCom.equals("Pai")){
                   ps.setString(12, "Pai");
                }// fi if
                
                else if(moraCom.equals("Mae")){
                   ps.setString(12, "Mae");
                }// fim else 
                
                 else if(moraCom.equals("Avos")){
                   ps.setString(12, "Avos");
                }// fim else
                
                 else if(moraCom.equals("Outros")){
                   ps.setString(12, "Outros");
                }// fim else 
                
                }// fim if 
               
                
                    
                
                ps.setString(13, fichaASalvar.getTelefonePai());
                 ps.setString(14, fichaASalvar.getTelefoneMae());
                
                ps.setString(15, fichaASalvar.getEscolaConcluida());
                
                if(fichaASalvar.getTipoEscola().equals("Publica")){
                    ps.setString(16, "Pública");
                }// fim if 
                
                else if (fichaASalvar.getTipoEscola().equals("Particular")){
                    ps.setString(16, "Particular");
                }// fim else if
                
                  ps.setInt(17, fichaASalvar.getAnoConclusao());
                
                   ps.setBoolean(18,fichaASalvar.getConcluido());
                    
                  ps.execute();
	
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();  
	}// fim catch	
        
    }// fim metodo
    
   public void excluirFicha(FichaAtendimentoModel fichaADeletar) {
        
          String sql = "delete from fichaatendimento where numero_ficha = ? ";
	
	PreparedStatement ps = null;
	Connection connection = null;
	
	try {
		connection = new Conexao().getConexao();
		
		ps = connection.prepareStatement(sql);  
                ps.setInt(1, fichaADeletar.getNumeroFicha());
		ps.executeUpdate();
	
	} catch (SQLException e) {
		
		e.printStackTrace();  
	}// fim catch	
        
        
    }// fim metodo
   
   public FichaAtendimentoModel mostrarNumeroFicha() throws SQLException {
        
	FichaAtendimentoModel ficha=new FichaAtendimentoModel();
   
              String sql = "select * from fichaatendimento where numero_ficha ="
                      + " (select max(numero_ficha) from fichaatendimento)";
	 
	PreparedStatement ps = null;
	Connection connection = null;
            
		connection = new Conexao().getConexao();
		
		ps = connection.prepareStatement(sql);  
                
                 ResultSet resultSet = ps.executeQuery();  
                 
                 if(resultSet.next()){
                  ficha.setNumeroFicha(resultSet.getInt("numero_ficha"));
                 }// fim if

        return ficha;
    }// fim metodo
   
   public boolean existeNumeroFicha(FichaAtendimentoModel fichaAVerificar){
        
          try {

        String sql = "select * from fichaatendimento where numero_ficha like ?";
        
        PreparedStatement ps = null;
	Connection connection = null;
	
		connection = new Conexao().getConexao();
		ps = connection.prepareStatement(sql);
		
                ps.setInt(1, fichaAVerificar.getNumeroFicha());
                
                ResultSet resultSet = ps.executeQuery();
                return resultSet.next();
             
    } catch(SQLException e) {
        e.printStackTrace();       
    }// fim catch
    return false;
}// fim metodo
    
    public FichaAtendimentoModel acessarFicha(int numeroFicha) throws SQLException{
        
        FichaAtendimentoModel ficha = new FichaAtendimentoModel(numeroFicha);
        
        String sql = "select * from fichaatendimento where numero_ficha = ?";
	
	PreparedStatement ps = null;
	Connection connection = null;
            
		connection = new Conexao().getConexao();
		
		ps = connection.prepareStatement(sql);  
                 
                 ps.setInt(1, numeroFicha);
                 
                 ResultSet resultSet = ps.executeQuery();
                 
              if(resultSet.next()){
                  ficha.setNumeroFicha(resultSet.getInt("numero_ficha"));
                  ficha.setNome(resultSet.getString("nome_aluno"));
                  ficha.setDataNascimento(resultSet.getDate("data_nascimento"));
                  ficha.setTelefone(resultSet.getString("telefone"));
                  ficha.setRg(resultSet.getString("rg"));
                  ficha.setEndereco(resultSet.getString("endereco"));
                  ficha.setBairro(resultSet.getString("bairro"));
                  ficha.setEstadoCivil(resultSet.getString("estado_civil"));
                  ficha.setMoraCom(resultSet.getString("mora_com"));
                  ficha.setAnoConclusao(resultSet.getInt("ano_conclusao"));
                  ficha.setEscolaConcluida(resultSet.getString("escola_concluida"));
                  ficha.setNomePai(resultSet.getString("nome_pai"));
                  ficha.setNomeMae(resultSet.getString("nome_mae"));
                  ficha.setEmailPai(resultSet.getString("email_pai"));
                  ficha.setEmailMae(resultSet.getString("email_mae"));
                  ficha.setTelefonePai(resultSet.getString("telefone_pai"));
                    ficha.setTelefoneMae(resultSet.getString("telefone_mae"));
                    ficha.setTipoEscola(resultSet.getString("tipo_escola"));
                    ficha.setConcluido(resultSet.getBoolean("concluido"));
         return ficha;
         
         // guarda os valores no objeto "ficha"
                 }// fim if
                 else {
                     return null;
                 }// fim else             
        
    }// fim metodo
    
    public void alterarFicha(FichaAtendimentoModel fichaAAlterar, String estadoCivil,String moraCom){
        
          String sql = "update fichaatendimento set nome_aluno = ?, data_nascimento = ?, "
                + "telefone = ?, rg = ?, endereco = ?, bairro = ?, nome_pai = ?, nome_mae = ?,"
                  + " email_pai = ?, email_mae = ?,"
                + " estado_civil = ?,"
                + "mora_com = ?, telefone_pai = ?, telefone_mae = ?, escola_concluida = ?,"
                  + " tipo_escola = ?, ano_conclusao = ?, concluido = ? where numero_ficha = ?";
               
	
	PreparedStatement ps = null;
	Connection connection = null;
  
	try {
		connection = new Conexao().getConexao();
		
		ps = connection.prepareStatement(sql);  
		ps.setString(1,fichaAAlterar.getNome() );
		
                ps.setDate(2, new java.sql.Date(
                        fichaAAlterar.getDataNascimento().getTime()));
                ps.setString(3, fichaAAlterar.getTelefone());
                ps.setString(4, fichaAAlterar.getRg());
                ps.setString(5, fichaAAlterar.getEndereco());
                ps.setString(6, fichaAAlterar.getBairro());
                ps.setString(7, fichaAAlterar.getNomePai());
                 ps.setString(8, fichaAAlterar.getNomeMae());
                ps.setString(9, fichaAAlterar.getEmailPai());
                ps.setString(10, fichaAAlterar.getEmailMae());
                
                 if(estadoCivil.equals("Casados")){
                ps.setString(11, "Casados");
                 ps.setString(12, "Ambos os pais");
                }// fim if 
                
                 else if(estadoCivil.equals("Separados")){
                ps.setString(11, "Separados");
                  }// fim if 
                  
                 else  if(estadoCivil.equals("Outros")){
                               ps.setString(11, "Outros");
                    }// fim if
                 
               
                             
                if(estadoCivil.equals("Separados") || estadoCivil.equals(("Outros"))){
                if(moraCom.equals("Pai")){
                   ps.setString(12, "Pai");
                }// fi if
                
                else if(moraCom.equals("Mae")){
                   ps.setString(12, "Mae");
                }// fim else 
                
                 else if(moraCom.equals("Avos")){
                   ps.setString(12, "Avos");
                }// fim else
                
                 else if(moraCom.equals("Outros")){
                   ps.setString(12, "Outros");
                }// fim else 
                
                }// fim if 
                
                    
                
                ps.setString(13, fichaAAlterar.getTelefonePai());
                 ps.setString(14, fichaAAlterar.getTelefoneMae());
                
                ps.setString(15, fichaAAlterar.getEscolaConcluida());
                
                if(fichaAAlterar.getTipoEscola().equals("Publica")){
                    ps.setString(16, "Pública");
                }// fim if 
                
                else if (fichaAAlterar.getTipoEscola().equals("Particular")){
                    ps.setString(16, "Particular");
                }// fim else if
                
                  ps.setInt(17, fichaAAlterar.getAnoConclusao());
                  
                  ps.setBoolean(18, fichaAAlterar.getConcluido());
                
                  ps.setInt(19, fichaAAlterar.getNumeroFicha());
                    
                  ps.execute();
	
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();  
	}// fim catch	
  
        
    }// fim metodo
    
    public List<FichaAtendimentoModel> listaFichas(String tipoOrdenacao) throws SQLException{
        
        FichaAtendimentoModel ficha= new FichaAtendimentoModel();
        // cria a lista com as fichas de Atendimento disponiveis 
        
        String sql = null;
        if(tipoOrdenacao.equals("concluidos")){ 
         sql = "select * from fichaatendimento where concluido = true";
        }// fim if 
        
        else if (tipoOrdenacao.equals("todasFichas")){
            sql = "select * from fichaatendimento";
        }// fim else if
 
	PreparedStatement ps = null;
	Connection connection = null;
            
		connection = new Conexao().getConexao();
		
		ps = connection.prepareStatement(sql); 
             
                 ResultSet resultSet = ps.executeQuery();
        
                 while(resultSet.next()){
   ficha.setNumeroFicha(resultSet.getInt("numero_ficha"));
                  ficha.setNome(resultSet.getString("nome_aluno"));
                  ficha.setDataNascimento(resultSet.getDate("data_nascimento"));
                  ficha.setTelefone(resultSet.getString("telefone"));
                  ficha.setRg(resultSet.getString("rg"));
                  ficha.setEndereco(resultSet.getString("endereco"));
                  ficha.setBairro(resultSet.getString("bairro"));
                  ficha.setEstadoCivil(resultSet.getString("estado_civil"));
                  ficha.setMoraCom(resultSet.getString("mora_com"));
                  ficha.setAnoConclusao(resultSet.getInt("ano_conclusao"));
                  ficha.setEscolaConcluida(resultSet.getString("escola_concluida"));
                  ficha.setNomePai(resultSet.getString("nome_pai"));
                  ficha.setNomeMae(resultSet.getString("nome_mae"));
                  ficha.setEmailPai(resultSet.getString("email_pai"));
                  ficha.setEmailMae(resultSet.getString("email_mae"));
                  ficha.setTelefonePai(resultSet.getString("telefone_pai"));
                    ficha.setTelefoneMae(resultSet.getString("telefone_mae"));
                    ficha.setTipoEscola(resultSet.getString("tipo_escola"));
                    ficha.setConcluido(resultSet.getBoolean("concluido"));
                    
listaFichas.add(ficha);
                 }// fim while
        
                 return listaFichas;
    }// fim metodo
        

    }// fim classe 
    
   

