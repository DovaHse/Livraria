package Livraria;

public class Hq extends ItemAcervo{
        private int edicao;

    public Hq(String id, String titulo, int edicao) {
        super(id, titulo);
        this.edicao = edicao;
    }

    @Override
    public int calcularPrazoDevolucao() {
        return 7;
    }

    @Override
    public String toString() {
        return super.toString() + " |  Revista Edicao n " + edicao;
    }



}
