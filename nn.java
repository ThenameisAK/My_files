class shape{
	public void display(){
		System.out.println("inside display");
	}
}
class Rectangle extends shape{
	public void area(){
		System.out.println("inside area");
	}
}
class cube extends Rectangle{
	public void volume(){
		System.out.println("inside volume");
	}
}
class Tester{
	public static void main(String[] args){
		cube cube=new cube();
		cube.display();
		cube.area();
		cube.volume();
	}
}
