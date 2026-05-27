package Controllers;

import Model.Usuario;
import Service.UsuarioService;

import java.util.List;

public class UsuarioController {

    private final UsuarioService usuarioService = new UsuarioService();

    public void cadastrar(Usuario usuario) {
        usuarioService.cadastrar(usuario);
    }

    public List<Usuario> listar() {
        return usuarioService.listar();
    }

    public void atualizar(int id, Usuario usuario) {
        usuarioService.atualizar(id, usuario);
    }

    public void excluir(int id) {
        usuarioService.excluir(String.valueOf(id));
    }

    public boolean login(String usuario, String senha) {
        return usuarioService.login(usuario, senha);
    }
}