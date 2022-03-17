package Aula3.biblioteca;

public class Biblioteca {

    public static void main(String[] args) {
        Autor coelho = new Autor();
        coelho.setCodigo("123456");
        coelho.setNome("Paulo Coelho");
        coelho.setBibliografia("Um autor renomado...");

        Editora ed1 = new Editora();
        ed1.setCodigo("0987654");
        ed1.setNome("Pearson");

        Editora exata = new Editora();
        exata.setCodigo("32795");
        exata.setNome("Editora Exata");

        Livro l1 = new Livro();
        l1.setTitulo("O Alquimista");
        l1.setISBN("asd12345");
        l1.setAutor(coelho);
        l1.setEditora(ed1);

        Livro l2 = new Livro();
        l2.setTitulo("Maktub");
        l2.setISBN("123asdf123");
        l2.setAutor(coelho);
        l2.setEditora(exata);
    }
}
