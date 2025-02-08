package com.aprendizado.java.POO.dominio.SistemaLojaJogos;

public class TestLojaJogo {
    public static void main(String[] args) {
        Loja loja = new Loja();

        Cliente cliente1 = new Cliente("Glaudencio", 12);
        Cliente cliente2 = new Cliente("Glauco", 16);
        Cliente cliente3 = new Cliente("Adriano", 23);
        Cliente cliente4 = new Cliente("Raimundo", 17);

        Desenvolvedor dev1 = new Desenvolvedor("Glaucius", "Alemanha");
        Jogo jogo1 = new Jogo("Minicraft", dev1);

        Desenvolvedor dev2 = new Desenvolvedor("Ana", "Brasil");
        Jogo jogo2 = new Jogo("SpaceRangers", dev2);

        Desenvolvedor dev3 = new Desenvolvedor("Carlos", "Japão");
        Jogo jogo3 = new Jogo("SamuraiAdventure", dev3);

        Desenvolvedor dev4 = new Desenvolvedor("Laura", "Estados Unidos");
        Jogo jogo4 = new Jogo("PuzzleQuest", dev4);

        Desenvolvedor dev5 = new Desenvolvedor("Miguel", "Espanha");
        Jogo jogo5 = new Jogo("RacingLegends", dev5);

        loja.adicionarJogo(jogo5,jogo1, jogo3, jogo2, jogo4);
        Jogo jogo = loja.buscarJogoPorTitulo("Minicraft");
        if (jogo != null) {
            System.out.println("Jogo encontrado na busca: ");
            jogo.dadosJogo();
        }else{
            System.out.println("Nenhum jogo encontrado na busca");
        }
        //loja.listarJogos();

        loja.adicionarCliente(cliente1, cliente2, cliente3, cliente4);
        cliente1.comprarJogo(jogo1, jogo3);
        //cliente1.dadosCliente();
        loja.venderJogo(cliente1, jogo1, jogo3);
        //loja.listarClientes();


    }
}
