package CuptorTS;

public class ComandaPreparat {
    private int idComanda;
    private PreparatTS preparat;

    public ComandaPreparat(int idComanda, PreparatTS preparat) {
        this.idComanda = idComanda;
        this.preparat = preparat;
    }

    public int getIdComanda() {
        return idComanda;
    }

    public PreparatTS getPreparat() {
        return preparat;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ComandaPreparat{");
        sb.append("idComanda=").append(idComanda);
        sb.append(", preparat=").append(preparat);
        sb.append('}');
        return sb.toString();
    }
}
