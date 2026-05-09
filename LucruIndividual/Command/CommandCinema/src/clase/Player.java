package clase;

import java.util.LinkedList;

public class Player {
    LinkedList<ICommand> listaComenzi = new LinkedList<ICommand>();

    public void invoca(ICommand comanda) {
        listaComenzi.add(comanda);
        comanda.execute();
    }

    public void undo() {
        listaComenzi.pollLast().unexecute();
    }
}
