package src.GeometrikHesaplama;

public class Cember extends Sekil{


    public Cember(double yariCap) {
        super(yariCap);

    }

    public double cemberCevreHesaplama() {
        return yariCap*2*3.14;

    }

    public double cemberAlanHesaplama() {
        return yariCap*yariCap*3.14;
    }

    @Override
    public String toString() {
        return
                "yariCap = " + yariCap + ", \n cember  cevre = " + cevreHesaplamaCember()+", \n cember alan = "+alanHesaplamaCember();
    }
}
