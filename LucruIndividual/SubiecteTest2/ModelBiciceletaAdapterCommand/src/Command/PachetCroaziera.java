package Command;

import adapterDeObiecte.IPachetTuristic;

public class PachetCroaziera  implements IPachetTuristic {
    private String numeCroaziera;

    public PachetCroaziera(String numeCroaziera) {
        this.numeCroaziera = numeCroaziera;
    }

    @Override
    public void descrierePachet() {
        System.out.println("Croaziera "
                + numeCroaziera );
    }

    @Override
    public void rezervaPachet() {
        System.out.println("Croaziera "
                + numeCroaziera + " a fost rezervata.");
    }

    @Override
    public void vindePachet() {
        System.out.println("Croaziera "
                + numeCroaziera + " a fost vanduta.");

    }
}
