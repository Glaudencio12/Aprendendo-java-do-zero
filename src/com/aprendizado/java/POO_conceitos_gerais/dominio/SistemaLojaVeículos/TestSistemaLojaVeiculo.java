package com.aprendizado.java.POO_conceitos_gerais.dominio.SistemaLojaVeículos;

public class TestSistemaLojaVeiculo {
    public static void main(String[] args) {
        Loja loja = new Loja();

        Veiculo carro1 = new Veiculo("Fiat", "Uno", 2008, 12000);
        Veiculo carro2 = new Veiculo("Ford", "Ranger", 2023, 100000);
        Veiculo carro3 = new Veiculo("Wolksvaguem", "Kwid", 2022, 32000);
        Veiculo carro4 = new Veiculo("Citroen", "Ceferon", 2019, 40000);

        System.out.println();
        Loja.exibirHorarioDeFuncionamento();

        loja.adicionarVeiculo(carro1);
        loja.adicionarVeiculo(carro2);
        loja.adicionarVeiculo(carro3);
        loja.adicionarVeiculo(carro4);
        System.out.println();

        Veiculo veiculo = loja.procurarVeiculoPeloModelo("Ranger");
        System.out.println("Veículo encontrado na busca: ");
        veiculo.exibirDetalhes();
        System.out.println();

        loja.removerVeiculo(carro1);

        System.out.println("Qauntidade de veículos na loja: " + Loja.mostarTotalVeiculos());
        System.out.println();

        loja.exibriVeiculos();
    }
}
