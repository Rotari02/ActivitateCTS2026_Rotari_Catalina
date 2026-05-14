package clase;

public class RecomanadaTroleibuz extends Handler{
    @Override
    public void recomandareMijlodDeTransport(int distanta) {
        if(distanta<=3){
            System.out.println("Pentru distanta de "+distanta+" km, circulati cu trolebuzul!");
        }else if(this.succseor!=null){
            this.succseor.recomandareMijlodDeTransport(distanta);
        }
    }
}
