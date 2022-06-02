package BoxingMatch;

public class Main {
    public static void main(String[] args) {
        float CoinFlip=(float) Math.random()*100;
        Fighter marc = new Fighter("Marc" , 15 , 100, 90, 0);
        Fighter alex = new Fighter("Alex" , 10 , 95, 100, 0);
        Ring r = new Ring(marc,alex , 90 , 100);
        r.run();

        System.out.println("Kimin ilk baslayacagini belirlemek icin yazi tura atiliyor...");
        if(CoinFlip>50) {
            System.out.println("Ilk hamleyi "+marc.name+" yapacak...");
            r.BeginFightOp1First();
        } else {
            System.out.println("Ilk hamleyi "+alex.name+" yapacak...");
            r.BeginFightOp2First();
        }
    }
}
