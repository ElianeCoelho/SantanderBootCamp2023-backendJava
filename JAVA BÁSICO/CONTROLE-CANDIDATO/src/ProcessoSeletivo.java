import java.util.concurrent.ThreadLocalRandom;
import java.util.Random;

public class ProcessoSeletivo {
    public static void main(String[] args) throws Exception {
        String[] candidatos = { "FELIPE", "MARCIA", "MARIA", "JOSÉ", "JOÃO" };
        for (String candidato : candidatos) {
            entrarEmContato(candidato);
        }

    }

    static void entrarEmContato(String candidato) {
        int tentativasRealizadas = 1;
        boolean continuaTentando = true;
        boolean atendeu = false;
        do {
            atendeu = atender();
            continuaTentando = !atendeu;
            if (continuaTentando) {
                tentativasRealizadas++;
            } else {
                System.out.println("##CONTATO REALIZADO COM SUCESSO!");
            }
        } while (continuaTentando && tentativasRealizadas < 3);

        if (atendeu) {
            System.out.println(
                    "CONTATO COM " + candidato + " REALIZADO COM SUCESSO NA " + tentativasRealizadas + " TENTATIVA.");
        } else {
            System.out.println("TENTATIVA DE CONTATO COM " + candidato + " SEM SUCESSO, RELAIZADO "
                    + tentativasRealizadas + " TENTATIVAS.");
        }

    }

    static boolean atender() {
        return new Random().nextInt(3) == 1;
    }

    static void analisarCandidato(double salarioPretendido) {
        double salarioBase = 2000.0;
        if (salarioBase > salarioBase) {
            System.out.println("LIGAR PARA O CANDIDATO");
        } else if (salarioBase == salarioPretendido) {
            System.out.println("LIGAR PARA O CANDIDATO COM CONTRA PROPOSTA");
        } else {
            System.out.println("AGUARDANDO RESULTADO DOS DEMAIS CANDIDATOS");
        }

    }

    static void selecionarCandidatos() {
        String[] candidatos = { "FELIPE", "ANA JULIA", "MANOELA", "RICARDO", "JOSÉ", "PRISCILA", "ROSE", "JULIANA",
                "LAURA", "LUANA" };

        int contadorCandidatosSelecionados = 0;
        int candidatoAtual = 0;
        double salarioBase = 2000.0;

        while (contadorCandidatosSelecionados < 5 && candidatoAtual < candidatos.length) {
            String candidato = candidatos[candidatoAtual];
            double salarioPretendido = valorPretendido();

            System.out.println("O candidato " + candidato + " solicitou este valor de salário: " + salarioPretendido);
            if (salarioBase >= salarioPretendido) {
                System.out.println("O candidato " + candidato + " foi selecionado para a vaga");
                contadorCandidatosSelecionados++;

            }
        }
    }

    static double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }

    static void imprimirSelecionados() {
        String[] candidatos = { "FELIPE", "MARCIA", "MARIA", "JOSÉ", "JOÃO" };
        System.out.println("----------CANDIDATOS-----------------");
        for (int i = 0; i < candidatos.length; i++) {
            System.out.println((i + 1) + " : " + candidatos[i]);
        }
        System.out.println("----------LISTA CANDIDATOS USANDO FORECH-----------");
        for (String candidato : candidatos) {
            System.out.println(candidato + " avançou de fase, Parabéns.");
        }
    }

    static void ligarCandidato(String metodoDois) {

    }
}
