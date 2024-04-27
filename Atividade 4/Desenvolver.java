public class Desenvolvedor extends Funcionario {
    private String linguagem;

    public Desenvolvedor(String nome, int id, double salario, String linguagem) {
        super(nome, id, salario);
        this.linguagem = linguagem;
    }

    public String getLinguagem() {
        return linguagem;
    }

    public void setLinguagem(String linguagem) {
        this.linguagem = linguagem;
    }
}
