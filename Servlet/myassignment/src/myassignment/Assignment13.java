package myassignment;
//ass 13
class Worker {
 protected String name;
 protected double salaryRate;

 public Worker(String name, double salaryRate) {
     this.name = name;
     this.salaryRate = salaryRate;
 }

 public double pay(int hours) {
     return 0; 
 }

 public void displayPay(int hours) {
     System.out.println(name + " is paid: " + pay(hours));
 }
}

class DailyWorker extends Worker {

 public DailyWorker(String name, double salaryRate) {
     super(name, salaryRate);
 }

 @Override
 public double pay(int hours) {
     int days = hours / 8;
     return days * salaryRate;
 }
}
class SalariedWorker extends Worker {

 public SalariedWorker(String name, double salaryRate) {
     super(name, salaryRate);
 }

 @Override
 public double pay(int hours) {
     return 40 * salaryRate; 
 }
}

//Main class to test
public class Assignment13 {
 public static void main(String[] args) {
     DailyWorker dw = new DailyWorker("Ram", 1000);
     SalariedWorker sw = new SalariedWorker("Sita", 900);

     System.out.println("=== Worker Payment ===");
     dw.displayPay(40);  
     sw.displayPay(20);  
 }
}

/*
 * === Worker Payment ===
Ram is paid: 5000.0
Sita is paid: 36000.0

 */