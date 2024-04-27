public class Gerente extends Funcionario {
    private String departamento;

    public Gerente(String nome, int id, double salario, String departamento) {
        super(nome, id, salario);
        this.departamento = departamento;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
}
