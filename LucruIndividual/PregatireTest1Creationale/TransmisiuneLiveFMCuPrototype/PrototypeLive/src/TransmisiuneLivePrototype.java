import java.util.ArrayList;
import java.util.List;

public class TransmisiuneLivePrototype implements  ILive{
    private  String numeEveniment;
    private  int nrSpectatori;
    private List<String> comentarii;

    public TransmisiuneLivePrototype(String numeEveniment, int nrSpectatori) {
        this.numeEveniment = numeEveniment;
        this.nrSpectatori = nrSpectatori;
        this.comentarii=new ArrayList<String>();
    }


    public void setComentarii(List<String> comentarii) {
        this.comentarii = comentarii;
    }

    @Override
    public ILive copiaza() {
        List<String> clonaComentarii =new ArrayList<>(this.comentarii);
        TransmisiuneLivePrototype clona=new TransmisiuneLivePrototype(this.numeEveniment, this.nrSpectatori);
        clona.setComentarii(clonaComentarii);
        return  clona;
    }

    @Override
    public void transmiteEvenimentLive() {
        StringBuilder sb=new StringBuilder("LIVE: ");
        sb.append(this.numeEveniment).append("\n");
        sb.append(this.nrSpectatori).append("persoanae conectate. \n");
        System.out.println(sb.toString());
        if(!this.comentarii.isEmpty()) {
            this.afiseazaListaComentariilor();
        }
    }

    @Override
    public void adaugaComentariu(String comentariu) {
        this.comentarii.add(comentariu);
    }

    @Override
    public void afiseazaListaComentariilor() {
        StringBuilder sb =new StringBuilder("COMENTARRII:\n");
        for(String comentariu: comentarii){
             sb.append("\t").append(comentariu).append("\n");
        }
        System.out.println(sb.toString());
    }

    @Override
    public void conectareSpectator() {
        this.nrSpectatori++;

    }

}
