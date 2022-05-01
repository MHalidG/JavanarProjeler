package src.GeometrikHesaplama;

public class Sekil {

    double uzunKenar;
    double kisaKenar;
    double yariCap;

    public Sekil(double uzunKenar, double kisaKenar) {
        this.uzunKenar = uzunKenar;
        this.kisaKenar = kisaKenar;
    }

    public Sekil(double yariCap) {
        this.yariCap = yariCap;
    }

    public double cevreHesaplama() {
        return (uzunKenar + kisaKenar) * 2;
    }

    public double alanHesaplama() {
        return uzunKenar * kisaKenar;
    }

    public double alanHesaplamaCember() {
        return Math.PI*Math.pow(yariCap,2);
    }

    public double cevreHesaplamaCember(){
        return 2*Math.PI*yariCap;
    }

}
