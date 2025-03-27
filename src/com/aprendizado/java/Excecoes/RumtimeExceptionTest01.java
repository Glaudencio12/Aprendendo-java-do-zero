package com.aprendizado.java.Excecoes;

public class RumtimeExceptionTest01 {
    public static void main(String[] args) {
        try {
            int[] vetor1 = {2,3,4,5};
            System.out.println("Soma dos elementos do vetor 1" + somaVetor(vetor1));

            int[] vetor2 = {};
            System.out.println("Soma dos elementos do vetor " + somaVetor(vetor2));
        }catch (IllegalArgumentException e){
            System.err.println("O vetor não pode ser nulo: " + e.getMessage());
            e.printStackTrace();
        }
    }
    public static int somaVetor(int[] nums){
        int soma = 0;
        if (nums == null || nums.length == 0) {
            throw new IllegalArgumentException("Argumento inválido");
        }else{
            for(int num : nums){
                soma += num;
            }
            return soma;
        }
    }
}
