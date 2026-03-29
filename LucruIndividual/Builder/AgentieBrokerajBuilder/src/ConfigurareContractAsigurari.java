public class ConfigurareContractAsigurari {

    AbstractConfigurare builder;

    public ConfigurareContractAsigurari(AbstractConfigurare builder) {
        this.builder = builder;
    }

    public ContractAsigurare getContract() {
        return this.builder.getContract();
    }

    public void build() {
        System.out.println("Configurare Contract Asigurari");
        this.builder.adaugaAsigurareAuto(new IAsigurareRCA(10));
        this.builder.adaugaAsigurareProductie(new AsigurareProductie(1000));
        this.builder.adaugaAigurareServixii(new AsigurareServicii(100));
    }
}
