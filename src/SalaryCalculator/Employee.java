package SalaryCalculator;

public class Employee {
    String name;
    double salary;
    int workHours;
    int hireYear;

    public Employee(String name,double salary,int workHours, int hireYear)
    {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    public void print(){
        System.out.println("Adı : " + this.name);
        System.out.println("Maaşı : " + this.salary);
        System.out.println("calısma Saati: " + this.workHours);
        System.out.println("Başlangıç:" + hireYear);
        System.out.println("Vergi: " + tax());
        System.out.println("Bonus: " + bonus());
        System.out.println("Maaş Artışı: " + raiseSalary());
        System.out.println("Vergi ve Bonuslar ile birlikte maas : " + (this.salary+ this.bonus() - this.tax()));
        System.out.println("Toplam Maas : " + (this.salary + this.raiseSalary()));

    }
    public double tax(){
        if(this.salary < 1000){
            return 0;
        }
        if(this.salary > 1000){
            return 0.03 * this.salary;
        }
        return 0;
    }

    public double bonus(){
        if(this.workHours > 40){
            return (this.workHours - 40) * 30;
        }
        else {
            return 0;
        }
    }
    public double raiseSalary(){
        double raiseRate;
        int year = 2021 - this.hireYear;

        if(year < 10){
            raiseRate = 0.05;
        } else if (year < 20) {
            raiseRate = 0.1;
        } else {
            raiseRate = 0.15;
        }

        return this.salary*raiseRate;

    }

}
