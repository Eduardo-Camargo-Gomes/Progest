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
        UsuarioDAO usuarioDAO = new UsuarioDAO();
        UsuarioModel usuarioACadastrar = new UsuarioModel(nome, senha, cpf);
        sim = usuarioDAO.verificarSeExisteUsuario(usuarioACadastrar);
 
        // Verifique se os campos obrigatórios não estão vazios
        if (nome.length() > 0 && senha.length() > 0 && cpf.length() > 0) {
            if (sim == true) {
                JOptionPane.showMessageDialog(null, "Nome de usuário já existente!");
            } else {
                
                if (!nome.matches("[A-Za-z]+")) {
                    JOptionPane.showMessageDialog(null, "O campo nome deve conter apenas letras.");
                } 
             
                else if (!cpf.matches("[0-9]+")) {
                    JOptionPane.showMessageDialog(null, "O campo CPF deve conter apenas números.");
                } else {
                    usuarioDAO.cadastrarUsuario(usuarioACadastrar);
                    JOptionPane.showMessageDialog(null, "Usuário cadastrado com sucesso!");
                    return true;
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "Campos não preenchidos corretamente!");
        }
        return false;
    }
    
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
    }
}
