package controller;

import View.TelaCadastro;
import View.TelaLogin;
import View.menu;
import java.sql.SQLException;
import model.*;
import model.DAO.*;
import view.*;
import java.util.*;

import javax.swing.JOptionPane;

public class UsuarioController {
    

	public boolean cadastrarUsuario(String nome, String senha, String cpf) throws SQLException {

            boolean sim;
            
            boolean jaExisteCPF;
            
            
            UsuarioDAO usuarioDAO = new UsuarioDAO();

         UsuarioModel usuarioACadastrar = new UsuarioModel(nome, senha, cpf);
         
           sim = usuarioDAO.verificarSeExisteUsuario(usuarioACadastrar);
           
           jaExisteCPF = usuarioDAO.verificarSeExisteCpf(usuarioACadastrar);
 
      if(nome.length() > 0 && senha.length() > 0 && cpf.length() > 0 ){
          
          if(sim == true && jaExisteCPF == true ){
              JOptionPane.showMessageDialog(null, "Nome de usuario e CPF já existentes!");
          }// fim  if
          
         else if(sim == true ){
              
              JOptionPane.showMessageDialog(null, "Nome de usuario já existente!");
          }// fim else  if
          
         else if(jaExisteCPF == true){
              
              JOptionPane.showMessageDialog(null, "CPF já cadastrado!");
              
          }// fim else if verificar se existe CPF
          

          else if (sim == false && jaExisteCPF == false){
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
        
           
        public boolean Autenticar(String nome, String senha) throws SQLException{
            
            UsuarioModel usuarioAFazerLogin = new UsuarioModel(nome,senha);
           
            UsuarioDAO usuarioDAO = new UsuarioDAO();

 usuarioDAO.ExisteAutenticacao(usuarioAFazerLogin);
              
         boolean sucessoNaAutenticacao = (usuarioDAO.ExisteAutenticacao(usuarioAFazerLogin));
             
             if(sucessoNaAutenticacao){
             
               return true;
             }// fim if
             
             else {
                
                 return false;
             }// fim else 
 
        }// fim meto
        
        
        public boolean entrarSemSenha(String user, String cpf) throws SQLException{
            
            UsuarioModel usuarioAEntrarSemSenha = new UsuarioModel(user,cpf);
            
           UsuarioDAO usuarioDAO = new UsuarioDAO();
           boolean existeAutenticacao;
           
           existeAutenticacao = usuarioDAO.ExisteAutenticacao(usuarioAEntrarSemSenha);
           
           if(existeAutenticacao == true){
                usuarioDAO.alterarSenha(usuarioAEntrarSemSenha);
                return true;
               
           }// fim if
           else {
                 JOptionPane.showMessageDialog(null, "Usuario e senha incompatíveis");
                 return false;
           }// fim else
  
        }// fim metodo
	
}// fim classe 
 