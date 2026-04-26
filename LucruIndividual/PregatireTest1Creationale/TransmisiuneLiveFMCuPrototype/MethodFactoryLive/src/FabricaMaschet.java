public class FabricaMaschet implements FabricaSport{
    @Override
    public Sport creareMeci(TipSport tipSport, String echipaGazda, String echipaOaspete) {
        return switch ((TipBaschet) tipSport){
            case BASCHETFEMININ -> new Baschet(echipaGazda, echipaOaspete);
            case BASCHETMASCULIN -> new Baschet(echipaGazda, echipaOaspete);
            default -> null;
        };
    }
}
