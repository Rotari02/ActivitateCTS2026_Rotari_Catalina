package Prototype;

import java.util.ArrayList;
import java.util.List;

public class MainPrototype {
    public static void main(String[] args) {
        IMasina masina1=new IMasina() {
            @Override
            public String getModel() {
                return "Dacia Logan";
            }

            @Override
            public int getAnFabricatie() {
                return 2022;
            }
        };

        ConcretStickerPrototype stickerPrototype =new ConcretStickerPrototype(masina1,"50*30cm");

        List<ISticker> listaStickere =new ArrayList<>();
        for(int i=0;i<4;i++) {
            listaStickere.add(stickerPrototype.clone());
        }

        for(ISticker stiker: listaStickere){
            stiker.stickerDetail();
        }


    }
}
