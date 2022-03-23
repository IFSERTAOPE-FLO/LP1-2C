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

        System.out.println("LIVRO 1");
        l1.exibirDescricaoLivro();
//        System.out.println("Nome: " + l1.getTitulo());
//        System.out.println("ISBN: " + l1.getISBN());
//
//        //Primeira forma
//        Autor autorRecuperado = l1.getAutor();
//        System.out.println("Autor: " + autorRecuperado.getNome());
//        //Segunda forma
//        System.out.println("Autor: " + l1.getAutor().getNome());
//
//        System.out.println("Editora: " + l1.getEditora().getNome());

//        System.out.println("LIVRO 2");
//        System.out.println("Nome: " + l2.getTitulo());
//        System.out.println("ISBN: " + l2.getISBN());
//        System.out.println("Autor: " + l2.getAutor().getNome());
//        System.out.println("Editora: " + l2.getEditora().getNome());
        //As linhas acima foram colocadas no método exibirDescricaoLivro()
        l2.exibirDescricaoLivro();


        //Alterem o nome do autor para "Coelho, Paulo"
        coelho.setNome("Coelho, Paulo");
        System.out.println(coelho.getNome());
        System.out.println("Novo Autor L1: " + l1.getAutor().getNome());
        System.out.println("Novo Autor L2: " + l2.getAutor().getNome());

        //Continuem para exibir a editora...
        System.out.println("Editora L2: " + l2.getEditora().getNome());
        System.out.println("Autor L2: " + l2.getAutor().getNome());

        //Alterar o autor do livro 2 para Raul Seixas
        Autor autor2 = new Autor();
        autor2.setCodigo("abc1223");
        autor2.setNome("Raul Seixas");
        autor2.setBibliografia("Um autor, compositor e cantor...");
        l2.setAutor(autor2);
        System.out.println("Autor L2: " + l2.getAutor().getNome());



    }
}
