package clase;

public class Medic extends HandlerAccidentare{
    @Override
    public void trateazaAccidentarea(FisaAcidentare accidentare) {
        System.out.println("Medicul verifica gravitatea accidentarii cursantului " + accidentare.getNumeCursant());
        if(accidentare.getGravitate()==TipGravitateAccidentare.MEDIE){
            System.out.println("    ->medicul trateaza accidentarea...");
        } else{
            if(this.getSuccesor()!=null){
                this.getSuccesor().trateazaAccidentarea(accidentare);
            } else{
                System.out.println("Serviciul de ambulanta este prea solicitat in acest moment!");
            }
        }
    }

}
