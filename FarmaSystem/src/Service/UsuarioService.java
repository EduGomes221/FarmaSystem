package Service;

import Model.Usuario;
import java.util.ArrayList;

public class UsuarioService {

    private ArrayList<Usuario> usuarios = new ArrayList<>();

    public void cadastrar(Usuario usuario) {
        usuarios.add(usuario);
    }

    public boolean login(String login, String senha) {
        for (Usuario u : usuarios) {
            if (u.autenticar(login, senha)) {
                return true;
            }
        }
        return false;
    }

    public void listar() {
        usuarios.forEach(System.out::println);
    }

    public void atualizar(String login, String senha, String nivel) {
        for (Usuario u : usuarios) {
            if (u.getLogin().equals(login)) {
                u.setSenha(senha);
                u.setNivel(nivel);
                return;
            }
        }
    }

    public void excluir(String login) {
        usuarios.removeIf(u -> u.getLogin().equals(login));
    }
}