package decorator;

public abstract class DecoratorProgram implements  IAbstractWashOptions{
   private IAbstractWashOptions programSpalare;

    public DecoratorProgram(IAbstractWashOptions programSpalare) {
        this.programSpalare = programSpalare;
    }

    @Override
    public void descriereSpalare() {
        this.programSpalare.descriereSpalare();
    }

    @Override
    public double getPret() {
        return this.programSpalare.getPret();
    }

    public abstract void adaugaOptiune();
}
