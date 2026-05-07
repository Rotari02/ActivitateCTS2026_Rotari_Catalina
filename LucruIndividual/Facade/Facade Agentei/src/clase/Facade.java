package clase;

public class Facade {
    public void rezervaPachetCazareTransport(String orasPlecare, String orasDestinatie) {
        CompanieAeriana companieAeriana = new CompanieAeriana("Tarom");
        Zbor zborDus = companieAeriana.rezervaBiletAvion(orasPlecare, orasDestinatie);
        Zbor zborIntors = companieAeriana.rezervaBiletAvion(orasDestinatie, orasPlecare);

        Hotel hotel = new Hotel("OLIMP");
        System.out.println(zborDus.toString());
        System.out.println(zborIntors.toString());
        hotel.rezervaCamera(orasDestinatie);
    }
}
