/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.DAO;

import Model.Usuario;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Tales
 */
public class UsuarioDAO {
    private List<Usuario> listaUsuarios;
    
    public UsuarioDAO(){
        listaUsuarios = new ArrayList<>();
        
        // Credenciais fixas para acessar a interface da ofiicna, se quiser adicionar outro só seguir o mesmo padrao
        listaUsuarios.add(new Usuario("admin", "admin"));
    }
    
    public boolean autenticar(String usuario, String senha){
        for (Usuario u : listaUsuarios) {
            if (u.getUsuario().equals(usuario) && u.getSenha().equals(senha)){
                return true;
            }
        }
        return false;
    }
}
