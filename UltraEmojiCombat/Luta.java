// Classe para os lutadores lutarem entre si
// Relacionamento de Agregação
import java.util.Random;
public class Luta {
    // Atributos
    private Lutador desafiado; // desafiado será uma instância da classe Lutador, ou seja, será um objeto de lutador; tipo abstrato de dados
    private Lutador desafiante; // desafiante será uma instância da classe Lutador, ou seja, será um objeto de lutador; tipo abstrato de dados
    //private int rounds;
    private boolean aprovada;
    // Métodos
    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }
    public Lutador getDesafiado() {
        return desafiado;
    }
    // Métodos Públicos
    public void marcarLuta(Lutador l1, Lutador l2) {
        if (l1.getCategoria().equals(l2.getCategoria()) && l1 != l2) {
            this.aprovada = true;
            this.desafiado = l1;
            this.desafiante = l2;
        } else {
            this.aprovada = false;
            this.desafiante = null;
            this.desafiado = null;
        }
    }
    public void lutar() {
        if (this.aprovada) {
            System.out.println(this.desafiado.getNome() + " x " + this.desafiante.getNome());
            System.out.println("******* DESAFIADO *******");
            this.desafiado.apresentar();
            System.out.println("******* DESAFIANTE *******");
            this.desafiante.apresentar();

            Random aleatorio = new Random();
            int vencedor = aleatorio.nextInt(3);
            System.out.println("======== RESULTADO DA LUTA ========");
            switch (vencedor) {
                case 0:
                    System.out.println("Empate!");
                    this.desafiado.empatarLuta();
                    this.desafiante.empatarLuta();
                    break;
                case 1:
                    System.out.println(this.desafiado.getNome() + " venceu!");
                    this.desafiado.ganharLuta();
                    this.desafiante.perderLuta();
                    break;
                case 2:
                    System.out.println(this.desafiante.getNome() + " venceu!");
                    this.desafiado.perderLuta();
                    this.desafiante.ganharLuta();
                    break;
            }
            System.out.println("============================");
        } else {
            System.out.println("Luta não pode acontecer!");
        }
    }    
}
