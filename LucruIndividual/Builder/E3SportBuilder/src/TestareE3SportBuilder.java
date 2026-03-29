public class TestareE3SportBuilder {
    public static void main(String[] args) {
        RezervareMeciBuilder builder = new RezervareMeciBuilder();

        RezervareMeci rezervare1 = builder.setAreAccesVIP(true).setCcomentariuAudioLiveInCasti(true).build("Rosu Marin");
        RezervareMeci rezervare2 = builder.setAreAccesVIP(false).setCcomentariuAudioLiveInCasti(true).build("Verban Ion");

        System.out.println(rezervare1.toString());
        System.out.println(rezervare2.toString());
    }
}
