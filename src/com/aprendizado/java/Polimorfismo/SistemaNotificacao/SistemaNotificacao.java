package com.aprendizado.java.Polimorfismo.SistemaNotificacao;

public class SistemaNotificacao {
    public static void enviarNotificacao(Object notificaco, String mensagem){
        if (notificaco instanceof Notificavel) {
            Notificavel notificacaoCast = (Notificavel) notificaco;
            notificacaoCast.enviar(mensagem);
        }else {
            System.out.println("Objeto inválido para notificação");
        }
    }
}
