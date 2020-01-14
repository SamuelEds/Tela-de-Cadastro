package model;

import javax.swing.JOptionPane;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.io.PrintWriter;

public class SalvarDados {
    String nome;
    String senha;
    String email;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    public boolean SalvarDados(){
        
        try {
            FileWriter fw = new FileWriter("../TelaDeCadastro/Usuarios/usuario "+this.nome,false);
            PrintWriter pw = new PrintWriter(fw);
            
            pw.println(this.nome);
            pw.println(this.email);
            pw.println(this.senha);
            
            pw.flush();
            pw.close();
            fw.close();
        } catch (IOException ex) {
            Logger.getLogger(SalvarDados.class.getName()).log(Level.SEVERE, null, ex);
        }
        
       return true;
    }
}
