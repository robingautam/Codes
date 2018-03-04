package example;
interface robin{
	public void makeSound();
}
class vivek implements robin {
	public void makeSound() {
		System.out.println("meow meow");
	}
}

public class Interface {
   public static void main(String[] args) {
	   vivek vivek = new vivek();
	   vivek.makeSound();
   }
    
    
}
