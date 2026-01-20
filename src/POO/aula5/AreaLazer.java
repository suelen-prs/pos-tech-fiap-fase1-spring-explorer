package POO.aula5;

import java.util.List;

public class AreaLazer {
    protected String nome;
    protected Reserva reserva;
    private List<Reserva> historicoReservas;

    public boolean estaDisponivel(){

        return reserva == null;
    }
}
