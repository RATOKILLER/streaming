import java.util.ArrayList;
import java.util.List;

class Usuario implements Observer {
    private final String nome;
    private final List<String> generosInteresse;

    public Usuario(String nome) {
        this.nome = nome;
        this.generosInteresse = new ArrayList<>();
    }

    public void addGenero(String genero) {
        generosInteresse.add(genero);
    }

    @Override
    public void update(String titulo, String genero) {
        if (generosInteresse.contains(genero)) {
            System.out.println(nome + " recebeu notificação: Novo título de " + genero + " disponível -> " + titulo);
        }
    }
}