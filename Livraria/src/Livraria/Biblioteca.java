package Livraria;
import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
        private List<ItemAcervo> acervo = new ArrayList<>();
        private List<Usuario> usuarios = new ArrayList<>();

        public void cadastrarItem(ItemAcervo item) {
            acervo.add(item);
            System.out.println("Item cadastrado no acervo: " + item.getTitulo());
        }

        public ItemAcervo buscarItemPorId(String id) {
            for (ItemAcervo item : acervo) {
                if (item.getId().equalsIgnoreCase(id))
                    return item;
            }
            return null;
        }

    public boolean realizarEmprestimo(String usuarioId, String itemId) {
        Usuario usuario = buscarUsuarioPorId(usuarioId);
        ItemAcervo item = buscarItemPorId(itemId);

        if (usuario == null || item == null) return false;
        if (item.isEmprestado()) {
            System.out.println("Item indisponivel");
            return false;
        }

        item.setEmprestado(true);
        usuario.adicionarItem(item);
        System.out.println("Emprestimo ok! Prazp para devolucao" + item.calcularPrazoDevolucao());
        return true;


    }



        private Usuario buscarUsuarioPorId(String usuarioId) {
            for (Usuario u : usuarios) if (u.getId().equalsIgnoreCase(id))
                return u;
           }

        }


