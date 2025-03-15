package com.aprendizado.java.Polimorfismo.SistemaNotificacao;

public class PushNotificacao implements Notificavel{
    private String token;

    public PushNotificacao(String token) {
        this.token = token;
    }

    @Override
    public void enviar(String mensagem) {
        System.out.println("Enviando push notification " + token + ": " + mensagem);
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
}
