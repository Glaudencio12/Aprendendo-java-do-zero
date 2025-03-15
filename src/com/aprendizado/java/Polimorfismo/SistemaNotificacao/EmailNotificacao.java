package com.aprendizado.java.Polimorfismo.SistemaNotificacao;

public class EmailNotificacao implements Notificavel{
    private String email;

    public EmailNotificacao(String email) {
        this.email = email;
    }

    @Override
    public void enviar(String mensagem) {
        System.out.println("Enviando email para " + email + ": " + mensagem);
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
