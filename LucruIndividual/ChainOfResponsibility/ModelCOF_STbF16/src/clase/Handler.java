package clase;

public abstract class Handler {
    protected Handler succseor;

    public void setSuccseor(Handler succseor) {
        this.succseor = succseor;
    }

    public abstract void recomandareMijlodDeTransport(int distanta);
}
