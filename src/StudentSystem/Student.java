package StudentSystem;

public class Student {
    String name,stuNo;
    int classes;
    Course mat;
    Course fizik;
    Course kimya;
    double avarage;
    boolean isPass;


    Student(String name, int classes, String stuNo, Course mat,Course fizik,Course kimya) {
        this.name = name;
        this.classes = classes;
        this.stuNo = stuNo;
        this.mat = mat;
        this.fizik = fizik;
        this.kimya = kimya;
        calcAvarage();
        this.isPass = false;
    }


    public void addBulkExamNote(double mat, double fizik, double kimya) {

        if (mat >= 0 && mat <= 100) {
            this.mat.note = mat * 0.80;
        }

        if (fizik >= 0 && fizik <= 100) {
            this.fizik.note = fizik * 0.80;
        }

        if (kimya >= 0 && kimya <= 100) {
            this.kimya.note = kimya * 0.80;
        }

    }
    public void addVerbalNote(double mat, double fizik, double kimya) {

        if (mat >= 0 && mat <= 100) {
            this.mat.verbal = mat * 0.20;
        }

        if (fizik >= 0 && fizik <= 100) {
            this.fizik.verbal = fizik * 0.20;
        }

        if (kimya >= 0 && kimya <= 100) {
            this.kimya.verbal = kimya * 0.20;
        }

    }


    public void isPass() {
        if (this.mat.note == 0 || this.fizik.note == 0 || this.kimya.note == 0) {
            System.out.println("Notlar tam olarak girilmemiş");
        } else {
            this.isPass = isCheckPass();
            printNote();
            System.out.println("Ortalama : " + this.avarage);
            if (this.isPass) {
                System.out.println("Sınıfı Geçti. ");
            } else {
                System.out.println("Sınıfta Kaldı.");
            }
        }
    }

    public void Avarage()
    {
        this.fizik.ortalama = this.fizik.note +this.fizik.verbal;
        this.kimya.ortalama = this.kimya.note +this.kimya.verbal;
        this.mat.ortalama = this.mat.note +this.mat.verbal;
    }
    public void calcAvarage() {
        this.avarage = (this.fizik.note + this.kimya.note + this.mat.note) / 3;
    }

    public boolean isCheckPass() {
        Avarage();
//        calcAvarage();
        return this.avarage > 55;
    }

    public void printNote(){
        System.out.println("=========================");
        System.out.println("Öğrenci : " + this.name);
        System.out.println("Matematik ortalama : " + this.mat.ortalama);
        System.out.println("Fizik ortalama : " + this.fizik.ortalama);
        System.out.println("Kimya ortalama : " + this.kimya.ortalama);
    }

}
