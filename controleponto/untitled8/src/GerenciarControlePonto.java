import Model.Funcionario;
import Model.Gerente;
import Model.Operador;
import Model.Secretaria;

public class GerenciarControlePonto {
    public static void main(String[] args) {
        ControlePonto controlePonto = new ControlePonto();

        Gerente gerente = new Gerente("Gerente", 1);
        Operador operador = new Operador("Telefonista", 2);
        Secretaria secretaria = new Secretaria("Secretaria", 3);

        // Registra a entrada e saída com um segundo de pausa entre cada ação
        registrarEntrada(controlePonto, gerente, "Gerente Carlos");
        sleepOneSecond();
        registrarEntrada(controlePonto, operador, "Telefonista Marina");
        sleepOneSecond();
        registrarEntrada(controlePonto, secretaria, "Secretaria Mariana");
        sleepOneSecond();
        registrarSaida(controlePonto, gerente, "Gerente Carlos");
        sleepOneSecond();
        registrarSaida(controlePonto, operador, "Telefonista Marina");
        sleepOneSecond();
        registrarSaida(controlePonto, secretaria, "Secretaria Mariana");
    }

    private static void registrarEntrada(ControlePonto controlePonto, Funcionario funcionario, String nomeFuncionario) {
        String mensagemEntrada = controlePonto.registraEntrada(funcionario);
        System.out.println("Entrada na agência do " + nomeFuncionario + ": " + "\n" + mensagemEntrada + "\n");
    }

    private static void registrarSaida(ControlePonto controlePonto, Funcionario funcionario, String nomeFuncionario) {
        String mensagemSaida = controlePonto.registraSaida(funcionario);
        System.out.println("Saída da agência do " + nomeFuncionario + ": " + "\n" + mensagemSaida + "\n");
    }

    private static void sleepOneSecond() {
        try {
            Thread.sleep(1000); // 1000 milliseconds = 1 second
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
