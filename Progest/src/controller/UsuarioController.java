package controller;

import View.TelaCadastro;
import View.TelaLogin;

import java.sql.SQLException;
import model.*;
import model.DAO.*;
import view.*;
import java.util.*;
import javax.swing.JOptionPane;

public class UsuarioController {
    public boolean cadastrarUsuario(String nome, String senha, String cpf) throws SQLException {
        boolean sim;
        UsuarioDAO usuarioDAO = new UsuarioDAO();
        UsuarioModel usuarioACadastrar = new UsuarioModel(nome, senha, cpf);
        
        sim = usuarioDAO.verificarSeExisteUsuario(usuarioACadastrar);
        
        
      boolean jaExisteCPF = usuarioDAO.verificarSeExisteCpf(usuarioACadastrar);
 
        // Verifique se os campos obrigatórios não estão vazios
         if(nome.length() > 0 && senha.length() > 0 && cpf.length() > 0 ){
          
          if(sim == true && jaExisteCPF == true ){
              JOptionPane.showMessageDialog(null, "Nome de usuario e CPF já existentes!");
          }// fim  if
          
           if (!nome.matches("[A-Za-z ]+")) {
                    JOptionPane.showMessageDialog(null, "O campo nome deve conter apenas letras.");
                }// fim if 
           
            if (!cpf.matches("[0-9]+")) {
                    JOptionPane.showMessageDialog(null, "O campo CPF deve conter apenas números.");
                }
          
         else if(sim == true ){
              
              JOptionPane.showMessageDialog(null, "Nome de usuario já existente!");
          }// fim else  if
          
         else if(jaExisteCPF == true){
              
              JOptionPane.showMessageDialog(null, "CPF já cadastrado!");
              
          }// fim else if verificar se existe CPF
          

          else if (sim == false && jaExisteCPF == false && nome.matches("[A-Za-z ]+") && cpf.matches("[0-9]+") ){
          usuarioDAO.cadastrarUsuario(usuarioACadastrar);
          
          JOptionPane.showMessageDialog(null,"Usuário cadastrado com sucesso!" );
          return true;
          }// fim else de nome ja existente 
          
      } // fim if 
      else {

          JOptionPane.showMessageDialog(null, "Campos não preenchidos corretamente!");
          
      }// fim else de os campos nao forem preenchidos
 
	return false;
        
        
    }// fim metodo
    
    public boolean Autenticar(String nome, String senha) throws SQLException {
        UsuarioModel usuarioAFazerLogin = new UsuarioModel(nome, senha);
        UsuarioDAO usuarioDAO = new UsuarioDAO();
        
        usuarioDAO.ExisteAutenticacao(usuarioAFazerLogin);
        
        boolean sucessoNaAutenticacao = usuarioDAO.ExisteAutenticacao(usuarioAFazerLogin);
        
        if (sucessoNaAutenticacao) {
            return true;
        } else {
            return false;
        }
    }// fim metodo
    
     public boolean AutenticarSenha(String nome, String cpf) throws SQLException {
        UsuarioModel usuarioAFazerLogin = new UsuarioModel(nome, cpf);
        UsuarioDAO usuarioDAO = new UsuarioDAO();
        
        usuarioDAO.VerificadorParaSenha(usuarioAFazerLogin);
        
        boolean sucessoNaAutenticacao = usuarioDAO.VerificadorParaSenha(usuarioAFazerLogin);
        
        if (sucessoNaAutenticacao) {
            return true;
        } else {
            return false;
        }
    }// fim metodo
    
    public void alterarSenha(String nome, String senha, String cpf) throws SQLException{
         UsuarioDAO usuario = new UsuarioDAO();
         UsuarioModel usuarioLeso = new UsuarioModel(nome, senha, cpf);
                 
        if(usuario.VerificadorParaSenha(usuarioLeso) == true){
            usuario.alterarSenha(usuarioLeso);

            JOptionPane.showMessageDialog(null, "Senha alterada com sucesso!");
        }// fim if
        else{
             JOptionPane.showMessageDialog(null, "Não foi possível alterar a senha!");
        }// fim else 
        
    }// fim metodo
    
    
    
}// fim classe

 