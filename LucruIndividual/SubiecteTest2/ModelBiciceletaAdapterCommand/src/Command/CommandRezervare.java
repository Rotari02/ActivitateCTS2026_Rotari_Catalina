package Command;

import adapterDeObiecte.IPachetTuristic;

public class CommandRezervare implements ICommand{
    private IPachetTuristic pachetTuristic;

    public CommandRezervare(IPachetTuristic pachetTuristic) {
        this.pachetTuristic = pachetTuristic;
    }

    @Override
    public void executa() {
        pachetTuristic.rezervaPachet();
    }
}
