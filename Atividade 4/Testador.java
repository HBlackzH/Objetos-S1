public class Testador extends Funcionario {
    private String tipoTeste;

    public Testador(String nome, int id, double salario, String tipoTeste) {
        super(nome, id, salario);
        this.tipoTeste = tipoTeste;
    }

    public String getTipoTeste() {
        return tipoTeste;
    }

    public void setTipoTeste(String tipoTeste) {
        this.tipoTeste = tipoTeste;
    }
}
