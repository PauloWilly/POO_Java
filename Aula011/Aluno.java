public class Aluno extends Pessoa {
    private int matricula;
    private String curso;

    public void pagarMensalidade() { // se eu usar: "public final void pagarMensalidade()" "final" será um método final e não poderá ser sobrescrito, ou seja, tudo que for "extends" dessa minha classe final não poderá ser usado para herdar
        System.out.println("Pagando mensalidade do aluno " + this.getNome());
    }

    public int getMatricula() {
        return matricula;
    }
    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
    public String getCurso() {
        return curso;
    }
    public void setCurso(String curso) {
        this.curso = curso;
    }
}
