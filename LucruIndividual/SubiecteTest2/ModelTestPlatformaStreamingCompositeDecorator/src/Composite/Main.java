package Composite;

public class Main {
    public static void main(String[] args) {
        IClip categorieSport =new CompositeStreaming(TipComposite.Categorie,"Sport");
        IClip categorieMuzica=new CompositeStreaming(TipComposite.Categorie,"Muzica");

        IClip clip1=new ClipVideo(10f,"Momente meci FCSB-Dinamo");
        IClip clip2=new ClipVideo(25.5,"Interviu cu Simona Halep");
        IClip clip3 = new ClipVideo(5.25f, "Rezumat meci FCSB - Rapid Bucuresti");

        categorieSport.adaugaElement(clip1);
        categorieSport.adaugaElement(clip2);
        categorieSport.adaugaElement(clip3);

        IClip playlistPop =new CompositeStreaming(TipComposite.Playlist,"POP");
        IClip clip4=new ClipVideo(3.4f,"Selena Gomez -hgfd");
        IClip clip5=new ClipVideo(2.7f,"Selena Gomez -Justin ....");
        IClip clip6=new ClipVideo(4.4f,"SDemi Lovato-Solo");

        playlistPop.adaugaElement(clip4);
        playlistPop.adaugaElement(clip5);
        playlistPop.adaugaElement(clip6);

        IClip clip7 = new ClipVideo(3.02f, "Beyonce - Single Ladies");
        IClip clip8 = new ClipVideo(3.44f, "Britney Spears - Toxic");

        categorieMuzica.adaugaElement(playlistPop);
        categorieMuzica.adaugaElement(clip7);
        categorieMuzica.adaugaElement(clip8);

        categorieMuzica.afiseazaDetalii("\t");
        categorieSport.afiseazaDetalii("\t");

        System.out.println("'-------------------------------");

        categorieMuzica.afiseazaDetalii("\t");

        System.out.println("'-------------------------------");
        System.out.println("Numar componenete sport "+categorieSport.getNumarComponente());
    }
}

