public class ProjetoYouTube {
    public static void main(String[] args) {
        Video v[] = new Video[3];
        v[0] = new Video("Aula 01 de POO");
        v[1] = new Video("Aula 12 de PHP");
        v[2] = new Video("Aula 10 de HTML5");

        Gafanhoto g[] = new Gafanhoto[2];
        g[0] = new Gafanhoto("João", 20, "M", "jb");
        g[1] = new Gafanhoto("Maria", 25, "F", "mm");

        // Tranformando V[0] em uma String
        System.out.println(v[0].toString());
        System.out.println(g[0].toString());
    }
}
