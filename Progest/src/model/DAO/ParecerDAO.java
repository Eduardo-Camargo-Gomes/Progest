/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.DAO;

import java.util.List;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.ArrayList;
import static model.DAO.Conexao.getConexao;
import model.FichaAtendimentoModel;
import model.ParecerModel;
import model.RelatorioAtendimentoModel;


public class ParecerDAO {
    
    List<Integer> listaIdsParecer = new ArrayList<>();
    LocalDateTime dataHoraAtual = LocalDateTime.now();
    Timestamp timestamp = Timestamp.valueOf(dataHoraAtual);
    List<Integer> passarAnterior = new ArrayList<>();
    List<Integer> passarProximo = new ArrayList<>();
    
     public void salvarParecer(ParecerModel parecerASalvar){
        
    String sql = "INSERT INTO parecer (assunto_parecer, interessado_parecer, "
                + "matricula_aluno, texto, locall, data_ocorrido, concluido, dataAcesso, dataModificacao) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
                
	
	PreparedStatement ps = null;
	Connection connection = null;
	
	try {
		connection = new Conexao().getConexao();
		
		ps = connection.prepareStatement(sql);  
		ps.setString(1,parecerASalvar.getAssuntoParecer() );
		
                 ps.setString (2, parecerASalvar.getInteressadoParecer());
                 ps.setString(3, parecerASalvar.getMatriculaAluno());
                 ps.setString(4, parecerASalvar.getTexto())
;                  ps.setString(5, parecerASalvar.getLocal());
                 ps.setDate(6, new java.sql.Date(
                         parecerASalvar.getDataOcorrido().getTime()));  
    ps.setBoolean(7, parecerASalvar.getConcluido());
     ps.setTimestamp(8, timestamp);
            ps.setTimestamp(9, timestamp);
                    
                  ps.execute();
	
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();  
	}// fim catch	
        
    }// fim metodo
    
    public void excluirParecer(ParecerModel parecerADeletar) {
        
          String sql = "delete from parecer where numero_parecer = ? ";
	
	PreparedStatement ps = null;
	Connection connection = null;
	
	try {
		connection = new Conexao().getConexao();
		
		ps = connection.prepareStatement(sql);  
                ps.setInt(1, parecerADeletar.getNumParecer());
                listaIdsParecer.remove(parecerADeletar);
		ps.executeUpdate();
                 
	
	} catch (SQLException e) {
		
		e.printStackTrace();  
	}// fim catch	
     
    }// fim metodo
    
     public ParecerModel mostrarNumeroParecer() throws SQLException {
        
	ParecerModel parecer = new ParecerModel();
   
              String sql = "select * from parecer where numero_parecer ="
                      + " (select max(numero_parecer) from parecer)";
	 	PreparedStatement ps = null;
	Connection connection = null;
            
		connection = new Conexao().getConexao();
		
		ps = connection.prepareStatement(sql);  
                
                 ResultSet resultSet = ps.executeQuery();  
                 
                 if(resultSet.next()){
                  parecer.setNumParecer(resultSet.getInt("numero_parecer"));
                 }// fim if

        return parecer;
    }// fim metodo
     
     
       public boolean existeNumeroParecer(ParecerModel parecerAVerificar){
        
          try {

        String sql = "select * from parecer where numero_parecer like ?";
        
        PreparedStatement ps = null;
	Connection connection = null;
	
		connection = new Conexao().getConexao();
		ps = connection.prepareStatement(sql);
		
                ps.setInt(1, parecerAVerificar.getNumParecer());
                
                ResultSet resultSet = ps.executeQuery();
                return resultSet.next();
             
    } catch(SQLException e) {
        e.printStackTrace();       
    }// fim catch
    return false;
}// fim metodo
       
        public void alterarParecer (ParecerModel parecerAAlterar){
        
            try {
                
        String sql = "update parecer set assunto_parecer = ? , interessado_parecer = ?, "
                + "matricula_aluno = ?, locall= ?, data_ocorrido = ? , texto = ?,"
                + "concluido = ?, dataModificacao = ? where numero_parecer = ?";
                       
        PreparedStatement ps = null;
	Connection connection = null;
	
		connection = new Conexao().getConexao();
		ps = connection.prepareStatement(sql);
		
                ps.setString(1,parecerAAlterar.getAssuntoParecer());     
                  ps.setString(2, parecerAAlterar.getInteressadoParecer());
                  ps.setString(3, parecerAAlterar.getMatriculaAluno());
                  ps.setString(4, parecerAAlterar.getLocal());
                  ps.setDate(5,  new java.sql.Date(
                         parecerAAlterar.getDataOcorrido().getTime()));              
                  ps.setString(6, parecerAAlterar.getTexto());
                   ps.setBoolean(7, parecerAAlterar.getConcluido());
                   ps.setTimestamp(8, timestamp);
               
                  ps.setInt(9, parecerAAlterar.getNumParecer());
                 
                  ps.execute();
                
                
    } catch(SQLException e) {
        e.printStackTrace();       
    }// fim catch
        
    }// fim metodo
        
          public ParecerModel acessarParecer(int numeroParecer) throws SQLException{

       ParecerModel parecer = new ParecerModel(numeroParecer);
// instancia um objeto model e passa por parametro o id para consultar
              String sql = "select * from parecer where numero_parecer = ?";
	
	PreparedStatement ps = null;
	Connection connection = null;
            
		connection = new Conexao().getConexao();
		
		ps = connection.prepareStatement(sql);  
                 
                 ps.setInt(1, numeroParecer);
                 
                 ResultSet resultSet = ps.executeQuery();
                 
       String sql2 = "update parecer set dataAcesso = ? where numero_parecer = ?;"; 
       
       PreparedStatement ps2 = null;
	Connection connection2 = null;
            
		connection2 = new Conexao().getConexao();
		
		ps2 = connection2.prepareStatement(sql2);  
                 
                 ps2.setTimestamp(1, timestamp);
                 ps2.setInt(2, numeroParecer);

                 ps2.execute();
                 
              if(resultSet.next()){

                  parecer.setNumParecer(resultSet.getInt("numero_parecer"));
                  parecer.setAssuntoParecer(resultSet.getString("assunto_parecer"));
                  parecer.setInteressadoParecer(resultSet.getString("interessado_parecer"));
                  parecer.setMatriculaAluno(resultSet.getString("matricula_aluno"));
                  parecer.setTexto(resultSet.getString("texto"));
                  parecer.setDataOcorrido(resultSet.getDate("data_ocorrido"));
                  parecer.setLocal(resultSet.getString("locall"));
                  parecer.setConcluido(resultSet.getBoolean("concluido"));
         return parecer;
         
         // guarda os valores no objeto "relatorio"
                 }// fim if
                 else {
                     return null;
                 }// fim else             
    }// fim metodo
          
          public List<Integer> listaIdsParecer(String tipoOrdenacao) throws SQLException {

        ParecerModel parecer = new ParecerModel();

        String sql = null;
        if (tipoOrdenacao.equals("Mais recentes primeiro")) {
            listaIdsParecer.clear();
            sql = "select numero_parecer from parecer order by numero_parecer desc";
        }// fim if 
        else if (tipoOrdenacao.equals("Já concluídos")) {
            listaIdsParecer.clear();
            sql = "select numero_parecer from parecer where concluido = true order by numero_parecer desc";
        }// fim else if
        else if (tipoOrdenacao.equals("Últimos acessados")) {
            listaIdsParecer.clear();
            sql = "select numero_parecer from parecer order by dataAcesso desc;";
        }// fim else if
        else if (tipoOrdenacao.equals("Última modificação")) {
            listaIdsParecer.clear();
            sql = "select numero_parecer from parecer order by dataModificacao desc;";
        }// fim else if
        
         else if(tipoOrdenacao.equals("Mais antigos primeiro")){
             listaIdsParecer.clear();
            sql = "select numero_parecer from parecer order by numero_parecer";
        }// fim else if

        PreparedStatement ps = null;
        Connection connection = null;

        connection = new Conexao().getConexao();

        ps = connection.prepareStatement(sql);

        ResultSet resultSet = ps.executeQuery();

        while (resultSet.next()) {

            parecer.setNumParecer(resultSet.getInt("numero_parecer"));

            listaIdsParecer.add(parecer.getNumParecer());
        }// fim while

        return listaIdsParecer;
    }// fim metodo
          
           public List<Integer> listaIdsParecerPorInteressado(String interessadoParecer) throws SQLException {
    List<Integer> listaIdsParecer = new ArrayList<>();

    try {
        String sql = "SELECT numero_parecer FROM parecer WHERE interessado_parecer LIKE ?";
        
        try (PreparedStatement ps = getConexao().prepareStatement(sql)) {
            ps.setString(1, "%" + interessadoParecer + "%");

            ResultSet resultSet = ps.executeQuery();

            while (resultSet.next()) {
                int numeroParecer = resultSet.getInt("numero_parecer");
                listaIdsParecer.add(numeroParecer);
            }
        }
    } catch (SQLException e) {
        e.printStackTrace();
    }

    return listaIdsParecer;
}// fim metodo
           
           public List<Integer> passarProximo() throws SQLException {
        ParecerModel parecer = new ParecerModel();

        String sql = " select numero_parecer from parecer order by numero_parecer;";

        PreparedStatement ps = null;
        Connection connection = null;

        connection = new Conexao().getConexao();

        ps = connection.prepareStatement(sql);

        ResultSet resultSet = ps.executeQuery();

        while (resultSet.next()) {
           parecer.setNumParecer(resultSet.getInt("numero_parecer"));

            passarProximo.add(parecer.getNumParecer());
        }// fim while

        return passarProximo;
    }// fim metodo

    public List<Integer> passarAnterior() throws SQLException {
     ParecerModel parecer = new ParecerModel();

        String sql = "  select numero_parecer from parecer order by numero_parecer desc;";

        PreparedStatement ps = null;
        Connection connection = null;

        connection = new Conexao().getConexao();

        ps = connection.prepareStatement(sql);

        ResultSet resultSet = ps.executeQuery();

        while (resultSet.next()) {
         parecer.setNumParecer(resultSet.getInt("numero_parecer"));

            passarAnterior.add(parecer.getNumParecer());
        }// fim while

        return passarAnterior;
    }// fim metodo
    
    
}// fim classe 
