package Prototype;

public class ConcretStickerPrototype implements ISticker{
    private final IMasina masina;
    private final String dimensiune;

    public ConcretStickerPrototype(IMasina masina, String dimensiune) {
        this.masina = masina;
        this.dimensiune = dimensiune;
    }


    @Override
    public ISticker clone() {
        //clona superficiala
        return new ConcretStickerPrototype(this.masina,this.dimensiune);
    }

    @Override
    public void stickerDetail() {
        System.out.println("Sticker pentru "+masina.getModel()+" ( "+masina.getAnFabricatie()+" )"+" , dimensiuni: "+dimensiune);
    }
}


