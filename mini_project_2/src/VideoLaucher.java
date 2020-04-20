import java.util.*;

class Video{
    String videoName;
    boolean checkout;
    int rating;
        
    Video(String name){
        videoName = name;
    }
    public String getName(){
        return videoName;
    }
    
    public void doCheckout(){
        System.out.println("Video " +'"'+ videoName+'"'+" checked out successfully.");
        checkout = true;
    }
    
    public void doReturn(){
        System.out.println("Video "+'"'+videoName +'"'+"returned successfully.");
        checkout = false;
    }
    
    public void receiveRating(int rating){
        this.rating = rating;
    }
    
    public int getRating(){
        return rating;
    }
    
    public boolean getCheckout(){
        return checkout;
    }
}

class VideoStore {
    Video[] store;
    VideoStore(){
        store = new Video[5];
    }
    
    public void addVideo(String name){
        store[0] = new Video(name);
        System.out.println("Video "+'"'+store[0].getName()+'"'+" added successfully.");
    }
    
    public void doCheckout(String name){
        if(store[0].getName().equals(name)){
            store[0].doCheckout();
        }
    }
    
    public void doReturn(String name){
        if(store[0].getName().equals(name)){
            store[0].doReturn();
        }
    }
    
    public void receiveRating(String name,int rating){
        if(store[0].getName().equals(name)){
            store[0].receiveRating(rating);
        }
        System.out.println("Rating "+'"'+store[0].getRating()+'"'+" has been mapped to the Video ''"+store[0].getName()+'"'+".");
    }
    
    public void listInventory(){
        System.out.println("--------------------------------------------------------------");
        System.out.println("Video Name\t | \tCheckout Status\t | \tRating");
        System.out.print(store[0].getName()+"\t\t | \t"+store[0].getCheckout()+"\t\t | \t"+store[0].getRating());
        System.out.println("\n--------------------------------------------------------------");
    }
}

public class VideoLaucher {
    public static void main(String args[]){
        System.out.println("MAIN MENU");
        System.out.println("=========");
        int c;
        int rate;
        String n1, n2 ,n3, n4;
        VideoStore obj = new VideoStore();
        Scanner sc = new Scanner(System.in);
                
        do{
            System.out.println("1. Add Video :");
            System.out.println("2. Check Out Video :");
            System.out.println("3. Return Video :");
            System.out.println("4. Receive Rating :");
            System.out.println("5. List Inventory :");
            System.out.println("6. Exit :");
            System.out.print("Enter your choice (1..6) :");

            c = sc.nextInt();
            switch(c){
                case 1:
                    System.out.print("Enter the name of the video you want to add :");
                    n1 = sc.next();
                    obj.addVideo(n1);
                    break;
                case 2:
                    System.out.print("Enter the name of the video you want to check out :");
                    n2 = sc.next();
                    obj.doCheckout(n2);
                    break;
                case 3:
                    System.out.print("Enter the name of the video you want to Return :");
                    n3 = sc.next();
                    obj.doReturn(n3);
                    break;
                case 4:
                    System.out.print("Enter the name of the video you want to Rate :");
                    n4 = sc.next();
                    System.out.print("\nEnter the rating for this video :");
                    rate = sc.nextInt();
                    obj.receiveRating(n4, rate);
                    break;
                case 5:
                    obj.listInventory();
                    break;
                case 6:
                    System.out.print("Exiting...!! Thanks for using the application.");
                    System.exit(1);
                    break;
                default:
                    System.out.println("You entered Invalid choice.");
                    break;
            }
        }while(c!=6);
    }
}