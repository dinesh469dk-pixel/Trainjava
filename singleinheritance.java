

 class vehicle{
	 void start() {
		 System.out.println("Engine starting....");
		 
	 }
 }
   
 class car extends vehicle{
	 void drive() {
		 System.out.println("Rady to race....");
		 
	 }
 }
public class singleinheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		car obj1 = new car();
		obj1.drive();
		obj1.start();
		

	}

}
