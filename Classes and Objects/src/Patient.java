public class Patient {
    private String name;
    private double height;
    private double weight;
    double result;
    void setData(String name, double height, double weight){
        this.name = name;
        this.height = height;
        this.weight = weight;
    }
    double computeBMI(){
        result = weight/(height*height);
        return result;
    }
    public static void main(String args[]){
        Patient obj = new Patient();
        obj.setData("Navin",1.76,70.0);
        System.out.println(obj.computeBMI());
    }
}
