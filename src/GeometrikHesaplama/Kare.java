package src.GeometrikHesaplama;

public class Kare extends Dikdortgen {

    // Kare de aslinda kenar uzunluklari esit olan bir dikdortgendir.
    // Bu yuzden Dikdortgen Class'ini parent olarak belirledik,
    // bu sayede Sekil Class'i da Grandparent'imiz olmus oluyor.

    public Kare(double kareKenar) {
        super(kareKenar,kareKenar);

    }

    @Override
    public String toString() {
        return "Kenar = " + uzunKenar + ", \n kare cevre = " + cevreHesaplama()
                + ", \n kare alan = " + alanHesaplama();
    }

}
