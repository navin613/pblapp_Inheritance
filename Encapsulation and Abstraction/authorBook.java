class Author {
	public static String name;
	public static String email;
	public static char gender;
	
	Author(String name, String email, char gender){
		this.name = name;
		this.email = email;
		this.gender = gender;
	}
}

class Book {
	private String name1, author;
	double price;
	int qtyInStock;
	
	Book(String name1){
		this.name1 = name1;
	}
	
	public String getName(){
		return name1;
	}
	
	public void setPrice(double price){
		this.price = price;
	}
	
	public double getPrice(){
		return price;
	}
	
	public void set_qtyInStock(int n){
		qtyInStock = n;
	}
	
	public int get_qtyInStock(){
		return qtyInStock;
	}
	
	public void getAuthorDetails(){
		System.out.println("Author Name : "+Author.name);
		System.out.println("Author email : "+Author.email);
		System.out.println("Author gender : "+Author.gender);
	}
}

class authorBook{
	public static void main(String args[]){
		Book b = new Book("Java Vision");
		Author a = new Author("Navin", "hellojava@gmail.com", 'M');
		b.setPrice(100);
		b.set_qtyInStock(1000);
		
		System.out.println("Details of Book");
		
		System.out.println("----------------------------------------------------");
		System.out.println("Name of Book : "+b.getName());
		System.out.println("Price of Book : "+b.getPrice());
		System.out.println("Quantity of Book : "+b.get_qtyInStock());
		System.out.println("----------------------------------------------------");
		System.out.println("Details of author of book:");
		System.out.println("----------------------------------------------------");
		b.getAuthorDetails();
	}
}
		
	
	