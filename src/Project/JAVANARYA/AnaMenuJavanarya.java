package src.Project.JAVANARYA;

import src.GeometrikHesaplama.Runner;
import src.DepoYonetimi.methods;
import src.Market.Transactions;
import src.Atm.User;

import java.util.Scanner;

public class AnaMenuJavanarya implements AnaMenuMethods {
Scanner scan=new Scanner(System.in);
    @Override
    public void AnaMenu() {
        System.out.println("JAVANARYA TOPRAKLARINA HOS GELDINIZ LUTFEN KULLANMAK ISTEDIGINIZ SISTEMI SECINIZ");

        System.out.println("\n" + "           ==JAVANARYA E JAVANAR SISTEMI==            \r\n"
                + "     \n"
                + "    1-OKUL YONETIM SISTEMI               2-MARKET YONETIM SISTEMI  \n"
                + "     \n"
                + "    \n"
                + "    3-DEPO YONETIM SISTEMI              4-ARABA KIRLAMA SERVISI     \n"
                + "    \n"
                + "\n"
                + "    5-JAVAANAAARE ARSIV TARAMA SISTEMI  6-JAVANAR PLAYER               \n"
                + "\n\n"
                + "    7-DEPO YONETIM SISTEMI              8-ARABA KIRALAMA SERVISI     \n"
                + "\n\n" +
                "    9-JAVANAR BANK              10-JAVANAR HOSPITAL     \n"
                + "\n\n"+"0-CIKIS"

        );
        int input = dogruInputuAlInt();

        switch (input) {

            case 1:
                User.atmGiris();


                break;

            case 2:
                Transactions.menu();

                break;
            case 3:
                methods.depoGiris();

                break;
            case 4:


                break;
            case 5:

                break;
            case 6:

                break;
            case 7:

                break;
            case 8:

                break;
            case 9:

                break;
            case 10:
                Runner geometrik=new Runner();
                geometrik.geometrik();

                break;
            case 0:

                break;
            default:
                System.out.println("GIRDIGINIZ SAYI: "+input+" BU SAYILI SERVISIMIZ HENUZ YAPIM ASAMASINDADIR." +
                        "LUTFEN AKTIF HIZMETLER ARASINDAN SECIM YAPINIZ");

                break;
        }
    }


    @Override
    public int dogruInputuAlInt(){
                Scanner scan = new Scanner(System.in);
                int input;
                while (true) {
                    try {
                        input = Integer.parseInt(scan.next());  //integer giris yapilana kadar while
                        break;
                    } catch (Exception e) {
                        System.out.println("Lutfen bir rakam tuslayin");
                    }
                }
                return input;
            }
}
