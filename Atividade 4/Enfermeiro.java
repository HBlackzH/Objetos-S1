public class Enfermeiro extends Funcionario {
    private String setor;

    public Enfermeiro(String nome, int idade, double salario, String setor) {
        super(nome, idade, salario);
        this.setor = setor;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }
}
