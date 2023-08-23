package controller;

import View.TelaLogin;
import View.menu;
import java.sql.SQLException;
import model.*;
import model.DAO.*;
import view.*;
import java.util.*;

import javax.swing.JOptionPane;

public class UsuarioController {

	public boolean  cadastrarUsuario (String nome, String senha, String cpf) {
		
		if(nome.length() > 0 && senha.length() > 0 && cpf.length() >0) {
			UsuarioModel usuario = new UsuarioModel(nome, senha, cpf);
			usuario.cadastrarUsuario(usuario);
			return true;
		}// fim if 
		else {
			return false;
		}// fim else 
		
		
	
	}// fim metodo 
        
       /* view = new TelaLogin();
        
        public void fazerLogin() throws SQLException{
            String usuario = view.getUSUARIO().getText();
            String senha = view.getSENHA().getText();
            
            UsuarioModel usuarioAutenticar = new UsuarioModel(usuario,senha);
            
            UsuarioDAO usuariodao = new UsuarioDAO();
            
           boolean existe = usuariodao.fazerLogin(usuarioAutenticar);
            
            if(existe){
 
             new menu().setVisible(true);
         new TelaLogin().setVisible(false);
            }// fim if
            else {
                JOptionPane.showMessageDialog(null, "Usuario ou senha inválidos!");
            }// fim else
         
         
        }// fi metodo

  */
        
        public void Autenticar(String nome, String senha) throws SQLException{
            
            UsuarioModel usuarioAFazerLogin = new UsuarioModel(nome,senha);
           
            UsuarioDAO usuarioDAO = new UsuarioDAO();

 usuarioDAO.ExisteAutenticacao(usuarioAFazerLogin);
               
         boolean sucessoNaAutenticacao = (usuarioDAO.ExisteAutenticacao(usuarioAFazerLogin));
             
             if(sucessoNaAutenticacao){
                new menu().setVisible(true); 
               
             }// fim if
             
             else {
                 new TelaLogin().setVisible(true);
                 JOptionPane.showMessageDialog(null, "Usuario ou senha inválidos!");
             }
         
             
        }// fim metodo
	
}// fim classe 
