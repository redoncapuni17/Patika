package Siniflar.MaasHesaplayici;

public class Employee {
    String name;
    double salary;
    int workHours;
    int hirYear;
    Employee(String name,double salary,int workHours,int hirYear){
        this.name = name;
        this.salary =salary;
        this.workHours = workHours;
        this.hirYear = hirYear;
    }
    double tax(){
       if(this.salary <= 1000){
           return this.salary;
       }
       else if(this.salary > 1000){
           double tax = 0;
           tax = this.salary*0.03;
           return tax;
       }
       else{
           System.out.println("Hatalı...");
       }
       return 0;
    }
    double bonus(){
        if(this.workHours > 40){
            double bonus = 0;
            bonus = (this.workHours-40)*30;
            return bonus;
        }
        return 0;
    }
    double raiseSalary(){
        if(2022-this.hirYear<10){
            double newSalary = 0;
            newSalary = this.salary*0.05;
            return newSalary;
        }
        else if(2022-this.hirYear>9 && 2022-this.hirYear<20){
            double newSalary = 0;
            newSalary = this.salary*0.10;
            return newSalary;
        }
        else if(2022-this.hirYear>19){
            double newSalary = 0;
            newSalary = this.salary*0.15;
            return newSalary;
        }
        else{
            System.out.println("Hatalı...");
        }
        return 0;
    }
    public String toString(){
        double total = this.salary-tax()+bonus();
        double total2 = this.salary+raiseSalary();
        System.out.println("Adı : "+this.name);
        System.out.println("Maaşı : "+this.salary);
        System.out.println("Çalışma Saati : "+this.workHours);
        System.out.println("Başlangıç Yılı : "+this.hirYear);
        System.out.println("Vergi : "+tax());
        System.out.println("Bonus : "+bonus());
        System.out.println("Maaş Artışı : "+raiseSalary());
        System.out.println("Vergi ve Bonuslar ile birlikte maaş : "+total);
        System.out.println("Toplam Maaş : "+total2);
        return null;
    }

}