import java.util.*;
public class File25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            System.out.println("Enter the student details of "+(i+1)+" : ");
            String name = sc.next();
            int roll_no = sc.nextInt();
            String department = sc.next();
            float cgpa = sc.nextFloat();
            Student s = new Student(name, roll_no, department, cgpa);
            s.display();
            System.out.println("---------------------------");
        }
        sc.close();
    }
    
}
class Student{
    String name;
    int roll_no;
    String department;
    float cgpa;
    Student(Student s1){
        this.name = s1.name;
        this.roll_no = s1.roll_no;
        this.department = s1.department;
        this.cgpa = s1.cgpa;
    }
    Student(String name, int roll_no, String department, float cgpa){
        this.name = name;
        this.roll_no = roll_no;
        this.department = department;
        this.cgpa = cgpa;
    }
    Student(){
        System.out.println("Student object created !");
    }
    void display(){
        System.out.println("Student details are \n---------------------------");
        System.out.println("Student name : "+this.name);
        System.out.println("Student roll no : "+this.roll_no);
        System.out.println("Student belongs to : "+this.department);
        System.out.println("Student's cgpa is : "+this.cgpa);
    }
}