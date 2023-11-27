package model.DAO;

import model.*;
import model.DAO.*;
import controller.*;
import View.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import static model.DAO.Conexao.getConexao;

public class FichaAtendimentoDAO {

    List<FichaAtendimentoModel> listaIdsFichas = new ArrayList<>();
    LocalDateTime dataHoraAtual = LocalDateTime.now();
    Timestamp timestamp = Timestamp.valueOf(dataHoraAtual);
    List<Integer> passarAnterior = new ArrayList<>();
    List<Integer> passarProximo = new ArrayList<>();

    public void salvarFicha(FichaAtendimentoModel fichaASalvar, String estadoCivil, String moraCom) {

        String sql = "INSERT INTO fichaatendimento(nome_aluno, data_nascimento, "
                + "telefone, rg, endereco, bairro, nome_pai, nome_mae, email_pai, email_mae,"
                + " estado_civil,"
                + "mora_com, telefone_pai, telefone_mae, escola_concluida, tipo_escola, ano_conclusao, concluido, dataAcesso, dataModificacao, descricao) "
                + "  VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?,  ?, ?, ?, ?)";

        PreparedStatement ps = null;
        Connection connection = null;

        try {
            connection = new Conexao().getConexao();

         
            
         ps = connection.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);
            ps.setString(1, fichaASalvar.getNome());

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

            if (estadoCivil.equals("Casados")) {
                ps.setString(11, "Casados");
                ps.setString(12, "Ambos os pais");
            }// fim if 
            else if (estadoCivil.equals("Separados")) {
                ps.setString(11, "Separados");
            }// fim if 
            else if (estadoCivil.equals("Outros")) {
                ps.setString(11, "Outros");
            }// fim if

            if (estadoCivil.equals("Separados") || estadoCivil.equals(("Outros"))) {
                if (moraCom.equals("Pai")) {
                    ps.setString(12, "Pai");
                }// fi if
                else if (moraCom.equals("Mae")) {
                    ps.setString(12, "Mae");
                }// fim else 
                else if (moraCom.equals("Avos")) {
                    ps.setString(12, "Avos");
                }// fim else
                else if (moraCom.equals("Outros")) {
                    ps.setString(12, "Outros");
                }// fim else 

            }// fim if 

            ps.setString(13, fichaASalvar.getTelefonePai());
            ps.setString(14, fichaASalvar.getTelefoneMae());

            ps.setString(15, fichaASalvar.getEscolaConcluida());

            if (fichaASalvar.getTipoEscola().equals("Publica")) {
                ps.setString(16, "Pública");
            }// fim if 
            else if (fichaASalvar.getTipoEscola().equals("Particular")) {
                ps.setString(16, "Particular");
            }// fim else if

            ps.setInt(17, fichaASalvar.getAnoConclusao());

            ps.setBoolean(18, fichaASalvar.getConcluido());
            ps.setTimestamp(19, timestamp);
            ps.setTimestamp(20, timestamp);
             ps.setString(21, "Ficha N°: " );
           
            int linhasAfetadas = ps.executeUpdate();

            if(linhasAfetadas > 0){
            ResultSet rs = ps.getGeneratedKeys();
            if(rs.next()){
                int id = rs.getInt(1);
                
                String nome = "Ficha N°: " +id;
  
                 alterarDescricao(nome, id);
            }// fim if 
            
            }// fim if

           

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

        FichaAtendimentoModel ficha = new FichaAtendimentoModel();

        String sql = "select * from fichaatendimento where numero_ficha ="
                + " (select max(numero_ficha) from fichaatendimento)";

        PreparedStatement ps = null;
        Connection connection = null;

        connection = new Conexao().getConexao();

        ps = connection.prepareStatement(sql);

        ResultSet resultSet = ps.executeQuery();

        if (resultSet.next()) {
            ficha.setNumeroFicha(resultSet.getInt("numero_ficha"));
        }// fim if

        return ficha;
    }// fim metodo

    public boolean existeNumeroFicha(FichaAtendimentoModel fichaAVerificar) {

        try {

            String sql = "select * from fichaatendimento where numero_ficha like ?";

            PreparedStatement ps = null;
            Connection connection = null;

            connection = new Conexao().getConexao();
            ps = connection.prepareStatement(sql);

            ps.setInt(1, fichaAVerificar.getNumeroFicha());

            ResultSet resultSet = ps.executeQuery();
            return resultSet.next();

        } catch (SQLException e) {
            e.printStackTrace();
        }// fim catch
        return false;
    }// fim metodo

    public FichaAtendimentoModel acessarFicha(int numeroFicha) throws SQLException {

        FichaAtendimentoModel ficha = new FichaAtendimentoModel(numeroFicha);

        String sql = "select * from fichaatendimento where numero_ficha = ?";

        PreparedStatement ps = null;
        Connection connection = null;

        connection = new Conexao().getConexao();

        ps = connection.prepareStatement(sql);

        ps.setInt(1, numeroFicha);

        ResultSet resultSet = ps.executeQuery();

        String sql2 = "update fichaatendimento set dataAcesso = ? where numero_ficha = ?;";

        PreparedStatement ps2 = null;
        Connection connection2 = null;

        connection2 = new Conexao().getConexao();

        ps2 = connection2.prepareStatement(sql2);

        ps2.setTimestamp(1, timestamp);
        ps2.setInt(2, numeroFicha);

        ps2.execute();

        if (resultSet.next()) {
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

    public void alterarFicha(FichaAtendimentoModel fichaAAlterar, String estadoCivil, String moraCom) {

        String sql = "update fichaatendimento set nome_aluno = ?, data_nascimento = ?, "
                + "telefone = ?, rg = ?, endereco = ?, bairro = ?, nome_pai = ?, nome_mae = ?,"
                + " email_pai = ?, email_mae = ?,"
                + " estado_civil = ?,"
                + "mora_com = ?, telefone_pai = ?, telefone_mae = ?, escola_concluida = ?,"
                + " tipo_escola = ?, ano_conclusao = ?, concluido = ?, dataModificacao = ? where numero_ficha = ?";

        PreparedStatement ps = null;
        Connection connection = null;

        try {
            connection = new Conexao().getConexao();

            ps = connection.prepareStatement(sql);
            ps.setString(1, fichaAAlterar.getNome());

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

            if (estadoCivil.equals("Casados")) {
                ps.setString(11, "Casados");
                ps.setString(12, "Ambos os pais");
            }// fim if 
            else if (estadoCivil.equals("Separados")) {
                ps.setString(11, "Separados");
            }// fim if 
            else if (estadoCivil.equals("Outros")) {
                ps.setString(11, "Outros");
            }// fim if

            if (estadoCivil.equals("Separados") || estadoCivil.equals(("Outros"))) {
                if (moraCom.equals("Pai")) {
                    ps.setString(12, "Pai");
                }// fi if
                else if (moraCom.equals("Mae")) {
                    ps.setString(12, "Mae");
                }// fim else 
                else if (moraCom.equals("Avos")) {
                    ps.setString(12, "Avos");
                }// fim else
                else if (moraCom.equals("Outros")) {
                    ps.setString(12, "Outros");
                }// fim else 

            }// fim if 

            ps.setString(13, fichaAAlterar.getTelefonePai());
            ps.setString(14, fichaAAlterar.getTelefoneMae());

            ps.setString(15, fichaAAlterar.getEscolaConcluida());

            if (fichaAAlterar.getTipoEscola().equals("Publica")) {
                ps.setString(16, "Pública");
            }// fim if 
            else if (fichaAAlterar.getTipoEscola().equals("Particular")) {
                ps.setString(16, "Particular");
            }// fim else if

            ps.setInt(17, fichaAAlterar.getAnoConclusao());

            ps.setBoolean(18, fichaAAlterar.getConcluido());

            ps.setTimestamp(19, timestamp);

            ps.setInt(20, fichaAAlterar.getNumeroFicha());

            ps.execute();

        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }// fim catch	

    }// fim metodo

    public List<FichaAtendimentoModel> listaIdsFichas(String tipoOrdenacao) throws SQLException {

       

        String sql = null;
        if (tipoOrdenacao.equals("Mais recentes primeiro")) {
            listaIdsFichas.clear();
            sql = "select numero_ficha, descricao from fichaatendimento order by numero_ficha desc";
        }// fim if 
        else if (tipoOrdenacao.equals("Já concluídos")) {
            listaIdsFichas.clear();
            sql = "select numero_ficha, descricao from fichaatendimento where concluido = true order by numero_ficha desc";
        }// fim else if,
        else if (tipoOrdenacao.equals("Últimos acessados")) {
            listaIdsFichas.clear();
            sql = "select numero_ficha, descricao from fichaatendimento order by dataAcesso desc;";
        }// fim else if
        else if (tipoOrdenacao.equals("Última modificação")) {
            listaIdsFichas.clear();
            sql = "select numero_ficha, descricao from fichaatendimento order by dataModificacao desc;";
        }// fim else if
        else if (tipoOrdenacao.equals("Mais antigos primeiro")) {
            listaIdsFichas.clear();
            sql = "select numero_ficha, descricao from fichaatendimento order by numero_ficha";
        }// fim else if

        PreparedStatement ps = null;
        Connection connection = null;

        connection = new Conexao().getConexao();

        ps = connection.prepareStatement(sql);

        ResultSet resultSet = ps.executeQuery();

        while (resultSet.next()) {

            
           int numFicha = resultSet.getInt("numero_ficha");
            String descricao  = resultSet.getString("descricao");

             FichaAtendimentoModel ficha = new FichaAtendimentoModel(numFicha, descricao);
            listaIdsFichas.add(ficha);
        }// fim while

        return listaIdsFichas;
    }// fim metodo

    public List<Integer> listaIdsFichasPorNome(String nomeAluno) throws SQLException {
        List<Integer> listaIdsFichas = new ArrayList<>();

        try {
            String sql = "SELECT numero_ficha FROM fichaatendimento WHERE nome_aluno LIKE ?";

            try ( PreparedStatement ps = getConexao().prepareStatement(sql)) {
                ps.setString(1, "%" + nomeAluno + "%");

                ResultSet resultSet = ps.executeQuery();

                while (resultSet.next()) {
                    int numeroFicha = resultSet.getInt("numero_ficha");
                    listaIdsFichas.add(numeroFicha);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return listaIdsFichas;
    }// fim meotodo

    public List<Integer> passarProximo() throws SQLException {
        FichaAtendimentoModel ficha = new FichaAtendimentoModel();

        String sql = " select numero_ficha from fichaatendimento order by numero_ficha;";

        PreparedStatement ps = null;
        Connection connection = null;

        connection = new Conexao().getConexao();

        ps = connection.prepareStatement(sql);

        ResultSet resultSet = ps.executeQuery();

        while (resultSet.next()) {
           ficha.setNumeroFicha(resultSet.getInt("numero_ficha"));

            passarProximo.add(ficha.getNumeroFicha());
        }// fim while

        return passarProximo;
    }// fim metodo

    public List<Integer> passarAnterior() throws SQLException {
       FichaAtendimentoModel ficha = new FichaAtendimentoModel();

        String sql = " select numero_ficha from fichaatendimento order by numero_ficha desc;";

        PreparedStatement ps = null;
        Connection connection = null;

        connection = new Conexao().getConexao();

        ps = connection.prepareStatement(sql);

        ResultSet resultSet = ps.executeQuery();

        while (resultSet.next()) {
           ficha.setNumeroFicha(resultSet.getInt("numero_ficha"));

            passarAnterior.add(ficha.getNumeroFicha());
        }// fim while

        return passarAnterior;
    }// fim metodo
    
    public String alterarDescricao(String descricao, int numFicha){
        
         try {

            String sql = "update fichaatendimento set descricao = ?  where numero_ficha = ?";

            PreparedStatement ps = null;
            Connection connection = null;

            connection = new Conexao().getConexao();
            ps = connection.prepareStatement(sql);

            ps.setString(1, descricao); 
            ps.setInt(2, numFicha);

            ps.execute();

        } catch (SQLException e) {
            e.printStackTrace();
        }// fim catch

         return descricao;
        
    }// fim metodo

}// fim classe 

