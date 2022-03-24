package midia;

public class Boy extends Pessoa{
    private String login;
    private int totAssistindo;

    public void viuMaisUm(){}

    public Boy(String nome, int idade, String sexo, String login) {
        super(nome, idade, sexo);
        this.login = login;
    }


    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getTotAssistindo() {
        return totAssistindo;
    }

    public void setTotAssistindo(int totAssistindo) {
        this.totAssistindo = totAssistindo;
    }

    @Override
    public String toString() {
        return "Boy{" +
                "login='" + login + '\'' +
                ", totAssistindo=" + totAssistindo +
                ", nome='" + nome + '\'' +
                ", idade=" + idade +
                ", sexo='" + sexo + '\'' +
                ", experiencia=" + experiencia +
                '}';
    }
}
