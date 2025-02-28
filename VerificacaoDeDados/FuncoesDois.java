package VerificacaoDeDados;

public class FuncoesDois {
    public static void main(String[] args) {
        String resultado = verificarAcesso(19, true, false);
        System.out.println(resultado);

        String resultado2 = verificarAcesso(20, false, false);
        System.out.println(resultado2);
    }

    public static String verificarAcesso(int idade, boolean temCarteira, boolean temHistoricoNegativo) {
        if (idade >= 18 && temCarteira && !temHistoricoNegativo) {
            return "Acesso Permitido!";
        } else if (idade >= 18 && temCarteira && temHistoricoNegativo) {
            return "Nao pode dirigir. Tem historico negativo!";
        } else {
            return "Acesso negado. Permissão negada!";
        }
    }
}
