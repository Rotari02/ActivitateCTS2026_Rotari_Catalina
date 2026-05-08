package clase;

public class Agentie extends CompositeIerarhieBancara {
    public Agentie(String denumire, String adresa) {
        super(denumire, adresa);
    }

    @Override
    public void descriereStructura(String aliniat) {
        System.out.println(aliniat + "Agenta " + this.getDenumire() + " ,adresa:" + this.getAdresa());
        for (IUnitateBancara unitateBancara : this.getListaUnitati()) {
            unitateBancara.descriereStructura(aliniat + aliniat);
        }
    }
}
