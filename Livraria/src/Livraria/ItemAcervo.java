package Livraria;

public abstract class ItemAcervo {
    // Atributos
    private String id;
    private String titulo;
    private boolean emprestado;

    //
    public ItemAcervo(String id, String titulo) {
        this.id = id;
        this.titulo = titulo;
        this.emprestado = false;
    }

    //
    public abstract int calcularPrazoDevolucao();

    // Getter e Setter


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public boolean isEmprestado() {
        return emprestado;
    }

    public void setEmprestado(boolean emprestado) {
        this.emprestado = emprestado;
    }


    @Override
    public String toString() {
        String status = emprestado ? "Emprestado" : "Disponivel";
        return " [" + id + "] " + titulo + " (" + status + ") - prazo: " + calcularPrazoDevolucao() + " dias";
    }
}
