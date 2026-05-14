package clase;

public class Ambulanta extends HandlerAccidentare{
    @Override
    public void trateazaAccidentarea(FisaAcidentare accidentare) {
        System.out.println("Ambulanta verifica accidentarea cursantul "+accidentare.getNumeCursant());
        if(accidentare.getGravitate()==TipGravitateAccidentare.GRAVA){
            System.out.println("Ambulanta transporta cursantul "+accidentare.getNumeCursant()+" la spital fiind foarte grav!");
        }
    }
}
