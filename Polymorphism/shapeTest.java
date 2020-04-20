class shape{
	public void draw(){
		System.out.println("Drawing Shape");
	}
	
	public void erase(){
		System.out.println("Erasing Shape");
	}
}

class Circle extends shape{
	public void draw(){
		System.out.println("Drawing Circle");
	}
	
	public void erase(){
		System.out.println("Erasing Circle");
	}
}

class Triangle extends shape{
	public void draw(){
		System.out.println("Drawing Triangle");
	}
	
	public void erase(){
		System.out.println("Erasing Triangle");
	}
}

class Square extends shape{
	public void draw(){
		System.out.println("Drawing Square");
	}
	
	public void erase(){
		System.out.println("Erasing Square");
	}
}

class shapeTest{
	public static void main(String args[]){
		shape c = new Circle();
		shape s = new Square();
		shape t = new Triangle();
		
		c.draw();
		c.erase();
		
		t.draw();
		t.erase();
		
		s.draw();
		s.erase();
	}
}
