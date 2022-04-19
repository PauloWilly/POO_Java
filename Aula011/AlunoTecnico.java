public class AlunoTecnico extends Aluno {
    private String registroProfissional;

    public void praticar() {
        System.out.println("Praticando por " + this.getNome());
    }

    public String getRegistroProfissional() {
        return registroProfissional;
    }
    public void setRegistroProfissional(String registroProfissional) {
        this.registroProfissional = registroProfissional;
    }
}
