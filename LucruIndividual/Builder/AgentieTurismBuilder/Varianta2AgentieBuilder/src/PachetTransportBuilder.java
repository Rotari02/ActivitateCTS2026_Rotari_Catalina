public class PachetTransportBuilder implements Builder {
    private  boolean areWifi;
    private  boolean areAnimale;
    private  boolean esteFumator;
    private  boolean areAC;
    private  boolean areTV;


    public PachetTransportBuilder() {
        super();
        this.areWifi = false;
        this.areAnimale = false;
        this.esteFumator = false;
        this.areAC = false;
        this.areTV = false;
    }

    @Override
    public PachetTransport build() {
        return new PachetTransport(areWifi, areAnimale,esteFumator,areAC,areTV);
    }

    public  PachetTransportBuilder setAreWifi(boolean areWifi) {
        this.areWifi=areWifi;
        return this;
    }

    public PachetTransportBuilder setAreAnimale(boolean areAnimale) {
        this.areAnimale=areAnimale;
        return this;
    }

    public PachetTransportBuilder setEsteFumator(boolean esteFumator) {
        this.esteFumator=esteFumator;
        return this;
    }

    public PachetTransportBuilder setAreAC(boolean areAC) {
        this.areAC= areAC;
        return this;
    }

    public  PachetTransportBuilder setAreTV(boolean areTV) {
        this.areTV=areTV;
        return this;
    }
}
