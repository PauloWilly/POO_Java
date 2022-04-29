// utiliza a "herança" atraves do "extends"
public class Gafanhoto extends Pessoa {
    private String login;
    private int totAssistido;

    public Gafanhoto(String nome, int idade, String sexo, String login) {
        super(nome, idade, sexo); // "super" é a superclasse Pessoa
        this.login = login;
        this.totAssistido = 0;
    }
    public String getLogin() {
        return login;
    }
    public void setLogin(String login) {
        this.login = login;
    }
    public int getTotAssistido() {
        return totAssistido;
    }
    public void setTotAssistido(int totAssistido) {
        this.totAssistido = totAssistido;
    }
    @Override
    public String toString() {
        return "Gafanhoto{" + super.toString() + // "super.toString"chama dos dados do "Gafanhoto"
                "\nlogin='" + login + '\'' + 
                ", totAssistido=" + totAssistido +
                '}';
    }
}
