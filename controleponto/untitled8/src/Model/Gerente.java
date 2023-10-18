package Model;

public class Gerente extends Funcionario{
    private String login;
    private String senha;

    public Gerente(String gerente, int i) {
        super();
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}
