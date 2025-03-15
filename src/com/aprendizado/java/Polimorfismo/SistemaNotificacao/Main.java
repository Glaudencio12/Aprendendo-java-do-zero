package com.aprendizado.java.Polimorfismo.SistemaNotificacao;

public class Main {
    public static void main(String[] args) {
        SmsNotificacao smsNotificacao = new SmsNotificacao("978968605");
        EmailNotificacao emailNotificacao = new EmailNotificacao("glaudencio3@gmail.com");
        PushNotificacao pushNotificacao = new PushNotificacao("489fneifn3");

        SistemaNotificacao.enviarNotificacao(smsNotificacao, "Lembrete de compromisso!");
        SistemaNotificacao.enviarNotificacao(emailNotificacao, "Lembrete de compromisso!");
        SistemaNotificacao.enviarNotificacao(pushNotificacao, "Lembrete de compromisso!");

    }
}
