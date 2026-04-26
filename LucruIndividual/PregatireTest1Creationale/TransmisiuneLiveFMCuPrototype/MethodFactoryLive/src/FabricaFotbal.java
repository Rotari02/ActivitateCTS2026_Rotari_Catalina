public class FabricaFotbal implements FabricaSport {
    @Override
    public Sport creareMeci(TipSport tipSport, String echipaGazda, String echipaOaspete) {
        return switch ((TipFotbal) tipSport) {
            case FOTABALFEMININ -> new Fotbal(echipaGazda, echipaOaspete);
            case FOTBALMASCULIN -> new Fotbal(echipaGazda, echipaOaspete);
            default -> null;
        };
    }
}
