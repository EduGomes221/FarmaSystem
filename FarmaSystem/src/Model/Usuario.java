package Model;

public class Usuario {
    private String login;
    private String senha;
    private String nivel;

    public Usuario(String login, String senha, String nivel) {
        this.login = login;
        this.senha = senha;
        this.nivel = nivel;
    }

    public boolean autenticar(String login, String senha) {
        return this.login.equals(login) && this.senha.equals(senha);
    }

    public String getLogin() {
        return login;
    }

    public String getSenha() {
        return senha;
    }

    public String getNivel() {
        return nivel;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

    @Override
    public String toString() {
        return "Login: " + login + " | Nível: " + nivel;
    }
}