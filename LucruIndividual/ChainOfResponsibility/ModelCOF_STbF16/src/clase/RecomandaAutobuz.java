package clase;

public class RecomandaAutobuz extends Handler{
    @Override
    public void recomandareMijlodDeTransport(int distanta) {
        if(distanta>3 &&distanta<=5){
            System.out.println("Pentru distanta de "+distanta+" km, circulati cu autobuzul");
        } else if(this.succseor!=null){
            this.succseor.recomandareMijlodDeTransport(distanta);
        }

    }
}
