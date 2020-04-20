
public class Box {   //It mention in question to create class name box with dimension width, height, depth
    private double width;
    private double height;
    private double depth;
    private double vol;
    Box(double width, double height, double depth){
        this.width = width;
        this.height = height;
        this.depth = depth;
    }
    void volume() {
        vol = width*height*depth;
        System.out.println("Volume of Box : "+vol);
    }
    public static void main(String args[]){
        Box obj = new Box(12.32,52.32,15.69);
        obj.volume();
    }
    
}
