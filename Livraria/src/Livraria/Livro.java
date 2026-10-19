package Livraria;

public class Livro extends ItemAcervo{
        private String autor;
        private int numeroPaginas;

    public Livro(String id, String titulo, String autor, int numeroPaginas) {
        super(id, titulo);
        this.autor = autor;
        this.numeroPaginas = numeroPaginas;
    }

    public String getAutor(){
        return autor;
    }
    @Override
    public int calcularPrazoDevolucao() {
        return 14;
    }

    @Override
    public String toString(){
        return super.toString() + " | Livro por " + autor;
    }


}
