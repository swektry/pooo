import Model.Funcionario;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ControlePonto {
    public String registraEntrada(Funcionario f) {
        LocalDateTime horaEntrada = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        String horarioEntrada = horaEntrada.format(formatter);
        return "Horário de entrada do funcionário no Banco: " + horarioEntrada;
    }

    public String registraSaida(Funcionario f) {
        LocalDateTime horaSaida = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        String horarioSaida = horaSaida.format(formatter);
        return "Horário de saída do funcionário no Banco: " + horarioSaida;
    }
}
