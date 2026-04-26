import com.sun.source.tree.BreakTree;

public class FabricaHandbal implements FabricaSport{

    @Override
    public Sport creareMeci(TipSport tipSport, String echipaGazda, String echipaOaspete) {
        return switch ((TipHandbal) tipSport){
            case HANDBALFEMININ -> new Handbal(echipaGazda,echipaOaspete);
            case HANDBALMASCULIN -> new Handbal(echipaGazda, echipaOaspete);
            default -> null;
        };
    }
}
