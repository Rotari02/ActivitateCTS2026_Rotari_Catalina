package clase;

import java.util.ArrayList;
import java.util.List;

public class CompositeIerarhieBancara implements IUnitateBancara {
    private String denumire;
    private String adresa;
    private List<IUnitateBancara> listaUnitati;

    public CompositeIerarhieBancara(String denumire, String adresa) {
        this.denumire = denumire;
        this.adresa = adresa;
        this.listaUnitati = new ArrayList<IUnitateBancara>();
    }

    public String getDenumire() {
        return denumire;
    }

    public String getAdresa() {
        return adresa;
    }

    public List<IUnitateBancara> getListaUnitati() {
        return listaUnitati;
    }

    @Override
    public void adaugaComponenta(IUnitateBancara unitateBancara) {
        this.listaUnitati.add(unitateBancara);
    }

    @Override
    public void stergeComponente(IUnitateBancara unitateBancara) {
        this.listaUnitati.remove(unitateBancara);
    }

    @Override
    public void descriereStructura(String aliniat) {

    }
}
