public class ControleRemoto implements Controlador {    
    // Atributos
    private int volume;
    private boolean ligado;
    private boolean tocando;

    // Métodos Especiais
    public ControleRemoto() {
        this.volume = 50;
        this.ligado = false;
        this.tocando = false;
    }
    private void setVolume(int volume) {
        this.volume = volume;
    }
    private int getVolume() {
        return volume;
    }
    private void setLigado(boolean ligado) {
        this.ligado = ligado;
    }
    private boolean getLigado() {
        return ligado;
    }
    private void setTocando(boolean tocando) {
        this.tocando = tocando;
    }
    private boolean getTocando() {
        return tocando;
    }

    // Métodos Abstratos
    @Override // sobrecreve o método abstrato (método "ligar" da interface Controlador), pois eu indiquei o "implements" 
    public void ligar() {
        setLigado(true);
    }
    @Override
    public void desligar() {
        setLigado(false);
    }
    @Override
    public void abrirMenu() {
        System.out.println("-----Menu-----");
        System.out.println("Está ligado? " + this.getLigado());
        System.out.println("Está tocando? " + this.getTocando());
        System.out.print("Volume: " + this.getVolume());
        for (int i = 0; i <= this.getVolume(); i+=10) { 
            System.out.print("|");
             
        }
        System.out.println();
        
    }
    @Override
    public void fecharMenu() {
        System.out.println("Fechando Menu...");
    }
    @Override
    public void maisVolume() {
        if (this.getLigado()) {
            this.setVolume(this.getVolume() + 5);
        } else {
            System.out.println("Impossível aumentar volume!");
        }
    }
    @Override
    public void menosVolume() {
        if (this.getLigado()){
            this.setVolume(this.getVolume() - 5);
        } else {
            System.out.println("Impossível diminuir volume!");
        }
    }
    @Override
    public void ligarMudo() {
        if (this.getLigado() && this.getVolume() > 0) {
            this.setVolume(0);
        }
    }
    @Override
    public void desligarMudo() {
        if (this.getLigado() && this.getVolume() == 0) {
            this.setVolume(50);
        }
    }
    @Override
    public void play() {
        if (this.getLigado() && !(this.getTocando())) { // "!" siginifica: não
            this.setTocando(true);
        } else {
            System.out.println("Não consegui reproduzir!");
        }
    }
    @Override
    public void pause() {
        if (this.getLigado() && this.getTocando()) {
            setTocando(false);
        } else {
            System.out.println("Não consegui pausar!");
        }
    }
}
