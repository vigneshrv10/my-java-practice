public class OOPS {
    public static void main(String[] args) {
        Pen p1 = new Pen();
        p1.setColor("Blue");
        System.out.println(p1.color);
        p1.color = "Yellow";
        System.out.println(p1.color);
        p1.setTip(5);
        System.out.println(p1.tip);
        p1.tip = 6;
        System.out.println(p1.tip);
        BankAccount viggy = new BankAccount();
        viggy.username = "vigneshrv";
        System.out.println(viggy.username);
        viggy.setPassword("xxyyzz");
        viggy.getpassword();
        BankAccount vig2 = new BankAccount("vignesh 2");
        System.out.println(vig2.username);
        vig2.setPassword("vginesh 22");
        vig2.getpassword();
        Student s1 = new Student("vignesh",20);
        s1.marks[0] = 90;
        s1.marks[1] = 85;
        s1.marks[2] = 20;
        Student s2 = new Student(s1);
        for (int i=0;i<3;i++){
            System.out.println(s2.marks[i]);
        }
        s1.marks[2] = 100;
        System.out.println(s2.marks[2]); // reference copy
        
        


    }
}

class Pen{
    String color;
    int tip;
    void setColor(String newColor){
        color = newColor;
    }
    void setTip(int newTip){
        tip = newTip;
    }
}
class Student{
    String name;
    int age;
    float percentage;
    int marks[];
    void calculate_percentage(int mat, int phy, int chy){
        percentage = (mat + phy + chy )/3;
    }
    Student(Student s1){
         marks = new int[3];
        this.marks = s1.marks;
       
        this.name = s1.name;
    }
    Student(){
        System.out.println("Constructor called");
        marks = new int[3];

    }
    Student(String name, int age){
        this.name = name;
        this.age = age;
        System.out.println("Student instance created with name : "+name+" and age : "+age);
        marks = new int[3];

    }
}
class BankAccount{
    public String username; // can be accessed directly
    private String password; // cant be accessed directyly, use getpassword or setpassword
    BankAccount(){ // non parameter constructor and constructor overloading happened
        System.out.println("Constructor called");
    }
    BankAccount(String name){ // parameterized constructor
        this.username = name;
        System.out.println("Bank account instance created with username : "+name);
    }
    public void setPassword(String pw){
        System.out.println("Passoword set successfully");
        password = pw;
    }
    public void getpassword(){
        System.out.println("Your password is : "+this.password);
    }
}