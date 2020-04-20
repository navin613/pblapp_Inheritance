class Person{
    private String name;
    private String dob;
    
    Person(String n, String d){
        name = n;
        dob = d;
    }
    
    public String displayPerson(){
        return "Name : "+ name + ", DOB : " + dob;
    }
}

class Teacher extends Person{
    private int salary;
    private String subject;
    
    Teacher(String n, String d, String sub, int sal){
        super(n,d);
        salary = sal;
        subject = sub;
    }
   
    public String display(){
        return "Teacher : "+super.displayPerson()+", subject: "+subject+", salary : "+salary;
    }
    
}

class Student extends Person{
    private int studId;
    
    Student(String n, String d, int studentId){
        super(n,d);
        studId = studentId;
    }
    
    public String displayStudent(){
        return "Student : "+super.displayPerson()+", Student ID : "+studId;
    }
    
}

class collegeStudent extends Student{
    String collegeName;
    String year;
    collegeStudent(String n, String d, int id, String collegeName, String year){
        super(n,d,id);
        this.collegeName = collegeName;
        this.year = year;
    }
    
    public String displayCollegeStudent(){
        return "Student : "+super.displayStudent()+", College Name : "+collegeName +", Year : "+year;
    }
} 

public class InheritanceQues3 {
    public static void main(String args[]){
        System.out.println("Teacher class validation");
        
        System.out.println("---------------------------------");
        Teacher t = new Teacher("Natraj", "01/01/1985 ", "Java", 70000);
        System.out.println(t.display());
        
        System.out.println("---------------------------------");
        
        System.out.println("Student class validation");
        
        System.out.println("---------------------------------");
        
        Student s1 = new Student("Ram", "01/06/2000", 04);
        System.out.println(s1.displayStudent());
        
        System.out.println("---------------------------------");
        
        System.out.println("College Student class validation");
        
        System.out.println("---------------------------------");
        
        collegeStudent s2 = new collegeStudent("Raman", "01/12/1995", 10, "VIT", "Fourth");
        System.out.println(s2.displayCollegeStudent());
    }
}
