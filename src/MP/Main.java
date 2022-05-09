package MP;

import java.util.*;

public class Main {

    private static ArrayList<Album> albums = new ArrayList<>();

    public static void main(String[] args) {

        Album album = new Album("Album1","AC/DC");

        album.addSong("TNT",4.5);
        album.addSong("Highway to hell",3.5);
        album.addSong("ThunderStruck",5.0);
        albums.add(album);

        album = new Album("Album2","Eminem");

        album.addSong("Rap god",4.5);
        album.addSong("Not Afraid",3.5);
        album.addSong("Lose yourself",4.5);

        albums.add(album);

        LinkedList<Song> playList_1 = new LinkedList<>();

        albums.get(0).addToPlayList("TNT",playList_1);
        albums.get(0).addToPlayList("Highway to hell",playList_1);
        albums.get(1).addToPlayList("Rap god",playList_1);
        albums.get(1).addToPlayList("Lose yourself",playList_1);

        play(playList_1);

    }

    private static void play(LinkedList<Song> playList){
        Scanner sc = new Scanner(System.in);
        boolean quit = false;
        boolean forward = true;
        ListIterator<Song> listIterator = playList.listIterator();

        if(playList.size() == 0){
            System.out.println("Bu çalma listesinde şarkı yok");
        }else {
            System.out.println("suan caliyor " + listIterator.next().toString());
            printMenu();
        }

        while(!quit){
            int action = sc.nextInt();
            sc.nextLine();

            switch (action){

                case 0:
                    System.out.println("Calma listesi tamamlandi.");
                    quit = true;
                    break;

                case 1:
                    if(!forward){
                        if(listIterator.hasNext()){
                            listIterator.next();
                        }
                        forward = true;
                    }
                    if(listIterator.hasNext()){
                        System.out.println("Suan caliyor"+listIterator.next().toString());
                    }else {
                        System.out.println("baska parca  yok, listenin sonuna ulaştı");
                        forward = false;
                    }
                    break;
                case 2:
                    if(forward){
                        if (listIterator.hasPrevious()){
                            listIterator.previous();
                        }
                        forward = false;
                    }
                    if(listIterator.hasPrevious()){
                        System.out.println("suan caliyor "+listIterator.previous().toString());
                    }else {
                        System.out.println("ilk parcadayiz");
                        forward = false;
                    }
                    break;

                case 3:
                    if(forward){
                        if(listIterator.hasPrevious()){
                            System.out.println("suan caliyor "+listIterator.previous().toString());
                            forward = false;
                        }else {
                            System.out.println("listenin başındayız");
                        }
                    }else {
                        if(listIterator.hasNext()){
                            System.out.println("suan caliyor "+listIterator.next().toString());
                            forward = true;
                        }else {
                            System.out.println("listenin sonuna geldik");
                        }
                    }
                    break;

                case 4:
                    printList(playList);
                    break;
                case 5:
                    printMenu();
                    break;
                case 6:
                    if (playList.size() >0){
                        listIterator.remove();
                        if(listIterator.hasNext()){
                            System.out.println("suan calan parca :"+listIterator.next().toString());
                        }
                        else {
                            if(listIterator.hasPrevious())
                            System.out.println("suan calan parca : "+listIterator.previous().toString());
                        }
                    }

            }
        }
    }

    private static void printMenu(){
        System.out.println("Istediginiz islemi yapmak icin \n seciniz");
        System.out.println("0 - cikis\n"+
                "1 - siradaki parcayi cal\n"+
                "2 - onceki parcayi cal\n"+
                "3 - Ayni parcayi tekrar cal\n"+
                "4 - Tum parcalari listele \n"+
                "5 - kullanilabilen secenekleri goster\n"+
                "6 - calan parcayi sil");
    }

    private static void printList(LinkedList<Song> playList){
        Iterator<Song> iterator = playList.iterator();
        System.out.println("-----------------");

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        System.out.println("-----------------");
    }

}
