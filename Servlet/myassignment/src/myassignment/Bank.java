package myassignment;

public abstract class Bank {
    String accNo;
    String custName;
    int custGender;
    String custJob;
    double curBal;

    public Bank(String accNo, String custName, int custGender, String custJob, double curBal) {
        this.accNo = accNo;
        this.custName = custName;
        this.custGender = custGender;
        this.custJob = custJob;
        this.curBal = curBal;
    }

    public String toString() {
        String gender = (custGender == 1) ? "Male" : "Female";
        return "Account No: " + accNo + "\n" +
               "Name: " + custName + "\n" +
               "Gender: " + gender + "\n" +
               "Job: " + custJob + "\n" +
               "Current Balance: " + curBal;
    }

    public abstract double calcBalance();
}