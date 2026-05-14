package decorator;

public class ProgramStandard implements  IAbstractWashOptions{

    private static final double pretStandard=25;

    @Override
    public void descriereSpalare() {
        System.out.println("Program standard: prespalare, spuma activa si clatire");
    }

    @Override
    public double getPret() {
        return pretStandard;
    }
}
