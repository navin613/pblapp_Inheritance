public class Person {
    private String name;
    private int yearOfBirth;
    
    Person(String name, int yearOfBirth){
        this.name = name;
        this.yearOfBirth = yearOfBirth;
    }
    
    public String getPerson(){
        return "Name : "+name+"\nYear of Birth : "+yearOfBirth;
    }
}
