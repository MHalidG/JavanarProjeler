package src.GeometrikHesaplama;

public class Runner {
    public void geometrik(){
        Sekil cember = new Cember(5);
        Sekil kare = new Kare(4);
        Sekil dikdortgen = new Dikdortgen(3,5);

        System.out.println(cember);
        System.out.println(dikdortgen);
        System.out.println(kare);
    }

}


