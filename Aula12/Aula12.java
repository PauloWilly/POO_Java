public class Aula12 {
    public static void main(String[] args) {
        // Animal n = new Animal(); // Não pode ser instanciado, pois é abstrato
        Mamifero m = new Mamifero();
        Reptil r = new Reptil();
        Peixe p = new Peixe();
        Ave a =  new Ave();
        Canguru c = new Canguru();
        Cachorro k = new Cachorro();
        Cobra j = new Cobra();
        Tartaruga t = new Tartaruga();
        Goldfish g = new Goldfish();
        Arara e = new Arara();

        // m.setPeso(35.3f);
        // m.setCorPelo("Marrom");
        // m.alimentar();
        // m.locomover();
        // m.emitirSom();

        // polimorfirmo é quando se chama um mesmo método mas com ações diferentes
        // a.locomover();
        // p.locomover();
        // r.locomover();
        c.locomover();
        k.locomover();
        c.emitirSom();
        k.emitirSom();
    }
    
}
