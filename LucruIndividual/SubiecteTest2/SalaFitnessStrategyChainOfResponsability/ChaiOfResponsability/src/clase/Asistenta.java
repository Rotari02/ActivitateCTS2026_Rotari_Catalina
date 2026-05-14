package clase;

public class Asistenta extends HandlerAccidentare {
    @Override
    public void trateazaAccidentarea(FisaAcidentare accidentare) {
        System.out.println("Asistentul medical verifica gravitatea accidentarii cursantului " + accidentare.getNumeCursant());
        if(accidentare.getGravitate() ==TipGravitateAccidentare.USOARA){
            System.out.println("    ->Asistenta trateaza accidentarea...");
        }else {
            if(this.getSuccesor()!=null){
               this.getSuccesor().trateazaAccidentarea(accidentare);
            }else{
                System.out.println("Nu avem medic sa evalueza si sa trateza accidentarea cursantul  "+accidentare.getNumeCursant());
            }
        }
    }
}
