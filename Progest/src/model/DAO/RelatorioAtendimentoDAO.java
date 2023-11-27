package model.DAO;

import model.*;
import view.*;
import controller.*;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import static model.DAO.Conexao.getConexao;

public class RelatorioAtendimentoDAO {

    List<RelatorioAtendimentoModel> listaIdsRelatorios = new ArrayList<>();
    LocalDateTime dataHoraAtual = LocalDateTime.now();
    Timestamp timestamp = Timestamp.valueOf(dataHoraAtual);
    List<Integer> passarProximo = new ArrayList<>();
     List<Integer> passarAnterior = new ArrayList<>();
     List<Integer> listaIdsNome = new ArrayList<>();
     List<String> listaDescricoes = new ArrayList<>();

    public void salvarRelatorio(RelatorioAtendimentoModel relatorioASalvar) {
       
        String sql = "INSERT INTO relatorio_atendimento(nome_aluno, turma_aluno, "
                + "nome_responsavel, data_ocorrido, horario, locall, situacao, encaminhamento, conclusao,"
                + "concluido, dataAcesso, dataModificacao, descricao) "
                + "  VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

        PreparedStatement ps = null;
        Connection connection = null;

        try {
            connection = new Conexao().getConexao();

            ps = connection.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);
            ps.setString(1, relatorioASalvar.getNomeAluno());

            ps.setString(2, relatorioASalvar.getTurmaAluno());
            ps.setString(3, relatorioASalvar.getNomeResponsavel());
            ps.setDate(4, new java.sql.Date(
                    relatorioASalvar.getDataOcorrido().getTime()));
            ps.setTime(5, relatorioASalvar.getHorarioOcorrido());
            ps.setString(6, relatorioASalvar.getLocalOcorrido());
            ps.setString(7, relatorioASalvar.getSituacao());
            ps.setString(8, relatorioASalvar.getEncaminhamentos());
            ps.setString(9, relatorioASalvar.getConclusao());
            ps.setBoolean(10, relatorioASalvar.getConcluido());
            ps.setTimestamp(11, timestamp);
            ps.setTimestamp(12, timestamp); 
            ps.setString(13, "Relatorio N°: " );
           
            int linhasAfetadas = ps.executeUpdate();

            if(linhasAfetadas > 0){
            ResultSet rs = ps.getGeneratedKeys();
            if(rs.next()){
                int id = rs.getInt(1);
                
                String nome = "Relatorio N°: " +id;
  
                 alterarDescricao(nome, id);
            }
            
            }// fim if

        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }// fim catch	

    }// fim metodo

    public void excluirRelatorio(RelatorioAtendimentoModel relatorioADeletar) {

        String sql = "delete from relatorio_atendimento where numero_relatorio = ? ";

        PreparedStatement ps = null;
        Connection connection = null;

        try {
            connection = new Conexao().getConexao();

            ps = connection.prepareStatement(sql);
            ps.setInt(1, relatorioADeletar.getNumRelatorio());
            listaIdsRelatorios.remove(relatorioADeletar);
            ps.executeUpdate();

        } catch (SQLException e) {

            e.printStackTrace();
        }// fim catch	

    }// fim metodo

    public RelatorioAtendimentoModel mostrarNumeroRelatorio() throws SQLException {

        RelatorioAtendimentoModel relatorio = new RelatorioAtendimentoModel();

        String sql = "select * from relatorio_atendimento where numero_relatorio ="
                + " (select max(numero_relatorio) from relatorio_atendimento)";

        PreparedStatement ps = null;
        Connection connection = null;

        connection = new Conexao().getConexao();

        ps = connection.prepareStatement(sql);

        ResultSet resultSet = ps.executeQuery();

        if (resultSet.next()) {
            relatorio.setNumRelatorio(resultSet.getInt("numero_relatorio"));
        }// fim if

        return relatorio;
    }// fim metodo

    public boolean existeNumeroRelatorio(RelatorioAtendimentoModel relatorioAVerificar) {

        try {

            String sql = "select * from relatorio_atendimento where numero_relatorio like ?";

            PreparedStatement ps = null;
            Connection connection = null;

            connection = new Conexao().getConexao();
            ps = connection.prepareStatement(sql);

            ps.setInt(1, relatorioAVerificar.getNumRelatorio());

            ResultSet resultSet = ps.executeQuery();
            return resultSet.next();

        } catch (SQLException e) {
            e.printStackTrace();
        }// fim catch
        return false;
    }// fim metodo

    public void alterarRelatorio(RelatorioAtendimentoModel relatorioAAlterar) {

        try {

            String sql = "update relatorio_atendimento set nome_aluno = ? , turma_aluno= ?, "
                    + "nome_responsavel = ?, data_ocorrido= ?, horario = ? , locall= ? ,"
                    + "situacao = ?, encaminhamento = ?, conclusao= ?, concluido = ?,  dataModificacao = ? where numero_relatorio = ?";

            PreparedStatement ps = null;
            Connection connection = null;

            connection = new Conexao().getConexao();
            ps = connection.prepareStatement(sql);

            ps.setString(1, relatorioAAlterar.getNomeAluno());
            ps.setString(2, relatorioAAlterar.getTurmaAluno());
            ps.setString(3, relatorioAAlterar.getNomeResponsavel());
            ps.setDate(4, new java.sql.Date(
                    relatorioAAlterar.getDataOcorrido().getTime()));
            ps.setTime(5, relatorioAAlterar.getHorarioOcorrido());
            ps.setString(6, relatorioAAlterar.getLocalOcorrido());
            ps.setString(7, relatorioAAlterar.getSituacao());
            ps.setString(8, relatorioAAlterar.getEncaminhamentos());
            ps.setString(9, relatorioAAlterar.getConclusao());
            ps.setBoolean(10, relatorioAAlterar.getConcluido());
            ps.setTimestamp(11, timestamp);
            ps.setInt(12, relatorioAAlterar.getNumRelatorio());

            ps.execute();

        } catch (SQLException e) {
            e.printStackTrace();
        }// fim catch

    }// fim metodo

    public RelatorioAtendimentoModel acessarRelatorio(int numeroRelatorio) throws SQLException {

        RelatorioAtendimentoModel relatorio = new RelatorioAtendimentoModel(numeroRelatorio);
// instancia um objeto model e passa por parametro o id para consultar
        String sql = "select * from relatorio_atendimento where numero_relatorio = ?";

        PreparedStatement ps = null;
        Connection connection = null;

        connection = new Conexao().getConexao();

        ps = connection.prepareStatement(sql);

        ps.setInt(1, numeroRelatorio);

        ResultSet resultSet = ps.executeQuery();

        String sql2 = "update relatorio_atendimento set dataAcesso = ? where numero_relatorio = ?;";

        PreparedStatement ps2 = null;
        Connection connection2 = null;

        connection2 = new Conexao().getConexao();

        ps2 = connection2.prepareStatement(sql2);

        ps2.setTimestamp(1, timestamp);
        ps2.setInt(2, numeroRelatorio);

        ps2.execute();

        if (resultSet.next()) {
            relatorio.setNumRelatorio(resultSet.getInt("numero_relatorio"));
            relatorio.setDataOcorrido(resultSet.getDate("data_ocorrido"));
            relatorio.setHorarioOcorrido(resultSet.getTime("horario"));
            relatorio.setLocalOcorrido(resultSet.getString("locall"));
            relatorio.setNomeAluno(resultSet.getString("nome_aluno"));
            relatorio.setTurmaAluno(resultSet.getString("turma_aluno"));
            relatorio.setNomeResponsavel(resultSet.getString("nome_responsavel"));
            relatorio.setSituacao(resultSet.getString("situacao"));
            relatorio.setEncaminhamentos(resultSet.getString("encaminhamento"));
            relatorio.setConclusao(resultSet.getString("conclusao"));
            relatorio.setConcluido(resultSet.getBoolean("concluido"));
            return relatorio;

            // guarda os valores no objeto "relatorio"
        }// fim if
        else {
            return null;
        }// fim else  

    }// fim metodo

    public List<RelatorioAtendimentoModel> listaIdsRelatorios(String tipoOrdenacao) throws SQLException {

        //RelatorioAtendimentoModel relatorio = new RelatorioAtendimentoModel();
        String sql = null;
        if (tipoOrdenacao.equals("Mais recentes primeiro")) {
            listaIdsRelatorios.clear();
            sql = "select numero_relatorio, descricao from relatorio_atendimento order by numero_relatorio desc;";
        }// fim if 
        else if (tipoOrdenacao.equals("Já concluídos")) {
            listaIdsRelatorios.clear();
            sql = "select numero_relatorio , descricao from relatorio_atendimento where concluido = true order by numero_relatorio desc;";

        }// fim else if
        else if (tipoOrdenacao.equals("Últimos acessados")) {
            listaIdsRelatorios.clear();
            sql = "select numero_relatorio, descricao from relatorio_atendimento order by dataAcesso desc;";
        }// fim else if
        else if (tipoOrdenacao.equals("Última modificação")) {
            listaIdsRelatorios.clear();
            sql = "select numero_relatorio, descricao from relatorio_atendimento order by dataModificacao desc;";
        }// fim else if
        
        else if(tipoOrdenacao.equals("Mais antigos primeiro")){
             listaIdsRelatorios.clear();
            sql = "select numero_relatorio, descricao from relatorio_atendimento order by numero_relatorio";
        }// fim else if

        PreparedStatement ps = null;
        Connection connection = null;

        connection = new Conexao().getConexao();

        ps = connection.prepareStatement(sql);

        ResultSet resultSet = ps.executeQuery();

        while (resultSet.next()) {
           //relatorio.setNumRelatorio(resultSet.getInt("numero_relatorio"));
           // relatorio.setDescricao(resultSet.getString("descricao"));

           int numRelatorio = resultSet.getInt("numero_relatorio");
           String descricao = resultSet.getString("descricao");
            //listaIdsRelatorios.add(relatorio.getNumRelatorio());
          //  listaDescricoes.add(relatorio.getDescricao());
                   
        RelatorioAtendimentoModel relatorio = new RelatorioAtendimentoModel(descricao, numRelatorio);
          listaIdsRelatorios.add(relatorio);
            
        }// fim while

        return listaIdsRelatorios;
       
    }// fim metodo

    public List<Integer> listaIdsRelatoriosPorNome(String nomeAluno) throws SQLException {
       

        try {
            String sql = "SELECT numero_relatorio FROM relatorio_atendimento WHERE nome_aluno LIKE ?";

            try ( PreparedStatement ps = getConexao().prepareStatement(sql)) {
                ps.setString(1, "%" + nomeAluno + "%"); // Use o operador LIKE para pesquisa parcial

                ResultSet resultSet = ps.executeQuery();

                while (resultSet.next()) {
                    int numeroRelatorio = resultSet.getInt("numero_relatorio");
                    listaIdsNome.add(numeroRelatorio);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return listaIdsNome;
    }

    public List<Integer> passarProximo() throws SQLException {
        RelatorioAtendimentoModel relatorio = new RelatorioAtendimentoModel();

        String sql = " select numero_relatorio from  relatorio_atendimento order by numero_relatorio;";

        PreparedStatement ps = null;
        Connection connection = null;

        connection = new Conexao().getConexao();

        ps = connection.prepareStatement(sql);

        ResultSet resultSet = ps.executeQuery();

        while (resultSet.next()) {
            relatorio.setNumRelatorio(resultSet.getInt("numero_relatorio"));

            passarProximo.add(relatorio.getNumRelatorio());
        }// fim while

        return passarProximo;
    }// fim metodo
    
     public List<Integer> passarAnterior() throws SQLException {
        RelatorioAtendimentoModel relatorio = new RelatorioAtendimentoModel();

        String sql = " select numero_relatorio from  relatorio_atendimento order by numero_relatorio desc;";

        PreparedStatement ps = null;
        Connection connection = null;

        connection = new Conexao().getConexao();

        ps = connection.prepareStatement(sql);

        ResultSet resultSet = ps.executeQuery();

        while (resultSet.next()) {
            relatorio.setNumRelatorio(resultSet.getInt("numero_relatorio"));

            passarAnterior.add(relatorio.getNumRelatorio());
        }// fim while

        return passarAnterior;
    }// fim metodo
     
     public String alterarDescricao(String descricao, int numRelatorio){
         
          try {

            String sql = "update relatorio_atendimento set descricao = ?  where numero_relatorio = ?";

            PreparedStatement ps = null;
            Connection connection = null;

            connection = new Conexao().getConexao();
            ps = connection.prepareStatement(sql);

            ps.setString(1, descricao); 
            ps.setInt(2, numRelatorio);

            ps.execute();

        } catch (SQLException e) {
            e.printStackTrace();
        }// fim catch

         return descricao;
     }// fim metodo

}// fim classe

