public class Livro implements Publicacao {
    // Atributos
    private String titulo;
    private String autor;
    private int totPaginas;
    private int pagAtual; 
    private boolean aberto; 
    private Pessoa leitor; // atributo do tipo Pessoa; uma classe de "Pessoa"; foi feita uma agregação

    public String detalhes() {
        return "Livro{" + "título=" + titulo + "\n, autor=" + autor + "\n, totPaginas=" + totPaginas + "\n, pagAtual="
        + pagAtual + "\n, aberto=" + aberto + "\n, leitor=" + leitor.getNome() + "\n, idade=" + leitor.getIdade()
        + "\n, sexo=" + leitor.getSexo() + '}';
    }

    // Métodos Especiais
    public Livro (String titulo, String autor, int totPaginas, Pessoa leitor) {
        this.titulo = titulo;
        this.autor = autor;
        this.totPaginas = totPaginas;
        this.aberto = false;
        this.pagAtual = 0;
        this.leitor = leitor;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getTitulo() {
        return titulo;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public String getAutor() {
        return autor;
    }
    public void setTotPaginas(int totPaginas) {
        this.totPaginas = totPaginas;
    }
    public int getTotPaginas() {
        return totPaginas;
    }
    public void setPagAtual(int pagAtual) {
        this.pagAtual = pagAtual;
    }
    public int getPagAtual() {
        return pagAtual;
    }
    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }
    public boolean getAberto() {
        return aberto;
    }
    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }
    public Pessoa getLeitor() {
        return leitor;
    }
    
    @Override
    public void abrir() {
        this.setAberto(true);
    }
    @Override
    public void fechar() {
        this.setAberto(false);
    }
    @Override
    public void folhear(int p) {
        if (p > this.totPaginas) {
            this.pagAtual = 0;
        } else {
            this.pagAtual = p;
        }
    }
    @Override
    public void avancarPag() {
        this.pagAtual++;
    }
    @Override
    public void voltarPag() {
        this.pagAtual--;
    }
    
}
