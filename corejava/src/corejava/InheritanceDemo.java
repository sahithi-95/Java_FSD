package corejava;
class Alpa{
	public Alpa(){
		System.out.println("Alpa constutor");
	}
	public void demo() {
		System.out.println("Alfa Demo");
	}
	
}
class Beta extends Alpa{
	public Beta(){
		System.out.println("Beta  constutor");
	}
	public void tes() {
		System.out.println("Beta Test");
	}
	public void demo() {
		System.out.println("Beta Demo");
	}
	
}
public class InheritanceDemo {

	public static void main(String[] args) {
		Alpa a= new Alpa();
		a.demo(); // Alpa constuctor then Alpa demo
		//Beta bt =(Beta) a;
		
		Beta b=new Beta();
		//b.test();
		

		
	}

}
