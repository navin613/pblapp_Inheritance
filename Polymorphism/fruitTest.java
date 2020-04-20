class fruit{
	public String name;
	public String taste;
	public String size;
	
	void eat(String n, String t){
		name = n;
		taste = t;
	}
}

class Apple extends fruit{
	void eat(String t){
		System.out.println("The taste of Apple is : "+t);
	}
}

class Orange extends fruit{
	void eat(String t){
		System.out.println("The taste of Orange is : "+t);
	}
}	

class fruitTest{
	public static void main(String args[]){
		Apple a = new Apple();
		Orange o = new Orange();
		String t1 = "little sour and bitter.";
		String t2 = "sweet.";
		a.eat(t1);
		o.eat(t2);
	}
}
	