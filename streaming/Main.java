public class Main {
    public static void main(String[] args) {
        PlataformaStreaming netflix = new PlataformaStreaming();

        Usuario usuario1 = new Usuario("Alice");
        usuario1.addGenero("ação");
        usuario1.addGenero("ficção científica");

        Usuario usuario2 = new Usuario("Bruno");
        usuario2.addGenero("comédia");

        Usuario usuario3 = new Usuario("Carlos");
        usuario3.addGenero("terror");
        usuario3.addGenero("ação");

        Usuario usuario4 = new Usuario("Diana");
        usuario4.addGenero("anime");

        Usuario usuario5 = new Usuario("Eduardo");
        usuario5.addGenero("ficção científica");
        usuario5.addGenero("comédia");
        usuario5.addGenero("anime");

        netflix.addObserver(usuario1);
        netflix.addObserver(usuario2);
        netflix.addObserver(usuario3);
        netflix.addObserver(usuario4);
        netflix.addObserver(usuario5);

        System.out.println("Lançamento 1");
        netflix.setNovoLancamento("Mad Max: Estrada da Fúria", "ação");

        System.out.println("\nLançamento 2");
        netflix.setNovoLancamento("Superbad", "comédia");

        System.out.println("\nLançamento 3");
        netflix.setNovoLancamento("Naruto Shippuden", "anime");

        System.out.println("\nRemovendo notificações do Eduardo");
        netflix.removeObserver(usuario5);

        System.out.println("\nLançamento 4");
        netflix.setNovoLancamento("Interestelar", "ficção científica");
    }
}