class Animal {
    public void eat(){
        System.out.println("Eat method in parent class.");
    }
    
    public void sleep(){
        System.out.println("Sleep method in parent class.");
    }
}

class Bird extends Animal{
    public void eat(){
        System.out.println("Eat method in child class.");
    }
    
    public void sleep(){
        System.out.println("Sleep method in child class.");
    }
    
    public void fly(){
        System.out.println("fly method in child class.");
    }
}
public class animalContainer {
    public static void main(String args[]){
        Animal obj1 = new Animal();
        Bird obj2 = new Bird();
        obj1.eat();
        obj1.sleep();
        obj2.eat();
        obj2.sleep();
        obj2.fly();
    }
    
}
