package Livraria;
import java.util.ArrayList;
import java.util.List;

public class Usuario {
    private String id;
    private String nome;
    private List<ItemAcervo> itensEmprestados;

    public Usuario(String id, String nome) {
        this.id = id;
        this.nome = nome;
        this.itensEmprestados = new ArrayList<>();
    }

    public void adicionarItem(ItemAcervo item){
        itensEmprestados.add(item);
    }

    public void adiocionarItem(ItemAcervo item){ itensEmprestados.add(item);}
    public void removerItem(ItemAcervo item){ itensEmprestados.remove(item);}
    public List<ItemAcervo> getItensEmprestados() {return itensEmprestados;}

    public String getId() {
        return "";
    }
}

