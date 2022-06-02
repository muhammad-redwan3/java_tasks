package BoxingMatch;

public class Ring {
    Fighter f1;
    Fighter f2;
    int minWeight;
    int maxWeight;

    public Ring(Fighter f1, Fighter f2, int minWeight, int maxWeight) {
        this.f1 = f1;
        this.f2 = f2;
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;
    }

    public void run() {

        if (checkWeight()) {
            while (f1.health > 0 && f2.health > 0) {
                System.out.println("======== YENİ ROUND ===========");
                f2.health = f1.hit(f2);
                if (isWin()){
                    break;
                }
                f1.health = f2.hit(f1);
                if (isWin()){
                    break;
                }
                printScore();
            }

        } else {
            System.out.println("Sporcuların ağırlıkları uyuşmuyor.");
        }


    }

    public boolean checkWeight() {
        return (f1.weight >= minWeight && f1.weight <= maxWeight) && (f2.weight >= minWeight && f2.weight <= maxWeight);
    }

    public boolean isWin() {
        if (f1.health == 0) {
            System.out.println("Maçı Kazanan : " + f2.name);
            return true;
        } else if (f2.health == 0){
            System.out.println("Maçı Kazanan : " + f2.name);
            return true;
        }

        return false;
    }

    public void BeginFightOp1First() {
        int round=1;
        if(checkWeight()) {
            while (this.f1.damage>0 && this.f2.damage>0) {
                System.out.printf("======== %d. ROUND ========\n",round);
                this.f2.damage=this.f1.hit(this.f2);
                if (isWin())
                    break;
                this.f1.damage=this.f2.hit(this.f1);
                if(isWin())
                    break;
                System.out.println(this.f1.name+" kalan saglik: "+this.f1.damage);
                System.out.println(this.f2.name+" kalan saglik: "+this.f2.damage);
                round+=1;
            }
        } else
            System.out.println("Sporcularin sikletleri uymuyor.");
    }



    public void BeginFightOp2First() {
        int round=1;
        if(checkWeight()) {
            while (this.f1.damage>0 && this.f2.damage>0) {
                System.out.printf("======== %d. ROUND ========\n",round);
                this.f1.damage=this.f2.hit(this.f1);
                if (isWin())
                    break;
                this.f2.damage=this.f1.hit(this.f2);
                if(isWin())
                    break;
                System.out.println(this.f1.name+" kalan saglik: "+this.f1.damage);
                System.out.println(this.f2.name+" kalan saglik: "+this.f2.damage);
                round+=1;
            }
        } else
            System.out.println("Sporcularin sikletleri uymuyor.");
    }
    public void printScore() {
        System.out.println("------------");
        System.out.println(f1.name + " Kalan Can \t:" + f1.health);
        System.out.println(f2.name + " Kalan Can \t:" + f2.health);
    }
}
