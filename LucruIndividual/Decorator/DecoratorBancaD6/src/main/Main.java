package main;

import clase.CardContactless;
import clase.CardFizic;
import clase.ICardBancar;

public class Main {
    public static void main(String[] args) {
        ICardBancar cardBancar = new CardFizic();
        CardContactless cardDecorat = new CardContactless(cardBancar);
        cardDecorat.platesteOnline(60.00);
        cardDecorat.platesteCardNormal(50.89);
        cardDecorat.platesteContactless(42.54);
    }
}
