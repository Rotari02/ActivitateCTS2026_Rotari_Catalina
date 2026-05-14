package clase;

public class RecomandaTramvai extends Handler {
    @Override
    public void recomandareMijlodDeTransport(int distanta) {
        if(distanta>5&&distanta<=10){
            System.out.println("Pentru distanta de "+distanta+" km,circulati cu tramvaiul!");
        }else if(this.succseor!=null){
            this.succseor.recomandareMijlodDeTransport(distanta);
        }
    }
}
