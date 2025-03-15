package com.aprendizado.java.Polimorfismo.SistemaNotificacao;

public class SmsNotificacao implements Notificavel{
    private String numeroTelefone;

    public SmsNotificacao(String numeroTelefone) {
        this.numeroTelefone = numeroTelefone;
    }

    @Override
    public void enviar(String mensagem) {
        System.out.println("Enviando SMS para " + numeroTelefone + ": " + mensagem);
    }

    public String getNumeroTelefone() {
        return numeroTelefone;
    }

    public void setNumeroTelefone(String numeroTelefone) {
        this.numeroTelefone = numeroTelefone;
    }
}
