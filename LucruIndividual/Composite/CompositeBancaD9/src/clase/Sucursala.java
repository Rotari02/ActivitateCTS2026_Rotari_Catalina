package clase;

public class Sucursala extends CompositeIerarhieBancara {
    public Sucursala(String denumire, String adresa) {
        super(denumire, adresa);
    }

    @Override
    public void descriereStructura(String aliniat) {
        System.out.println(aliniat + "Sucursala:" + this.getDenumire() + " ,adresa:" + this.getAdresa());
        for (IUnitateBancara unitateBancara : getListaUnitati()) {
            unitateBancara.descriereStructura(aliniat + aliniat);
        }
    }
}
