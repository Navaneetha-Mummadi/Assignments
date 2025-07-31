package myassignment;
//Assignment12

public class Student {
private static int rollCounter = 1;

private int rollNo;
private String studName;
private int marksInEng;
private int marksInMaths;
private int marksInScience;

public Student(String studName, int eng, int maths, int science) {
   this.rollNo = rollCounter++;
   this.studName = studName;
   this.marksInEng = eng;
   this.marksInMaths = maths;
   this.marksInScience = science;
}

public int getRollNo() { return rollNo; }
public String getStudName() { return studName; }
public int getMarksInEng() { return marksInEng; }
public int getMarksInMaths() { return marksInMaths; }
public int getMarksInScience() { return marksInScience; }

public int getTotalMarks() {
   return marksInEng + marksInMaths + marksInScience;
}

public double getPercentage() {
   return getTotalMarks() / 3.0;
}
}

/*
 
1. Roll No Ascending:
1 - Anu
2 - Bala
3 - Chitra
4 - Dinesh
5 - Esha
6 - Farhan
7 - Gita
8 - Hari

2. Highest Percentage:
Top %: 7 - Gita

3. Highest in Mathematics:
Top Maths: 7 - Gita

4. Ascending by Maths + Science:
6 - Farhan
4 - Dinesh
5 - Esha
8 - Hari
1 - Anu
2 - Bala
3 - Chitra
7 - Gita

5. Rank List:
Rank 1: 7 - Gita | Total: 281 | %: 93.67
Rank 2: 3 - Chitra | Total: 273 | %: 91.00
Rank 3: 8 - Hari | Total: 257 | %: 85.67
Rank 4: 1 - Anu | Total: 255 | %: 85.00
Rank 5: 2 - Bala | Total: 255 | %: 85.00
Rank 6: 5 - Esha | Total: 246 | %: 82.00
Rank 7: 4 - Dinesh | Total: 212 | %: 70.67
Rank 8: 6 - Farhan | Total: 197 | %: 65.67

 */
