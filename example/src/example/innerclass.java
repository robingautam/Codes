package example;

class outerClass {
	class innerClass {
		private void print() {
			System.out.println("this is the inner class");
		}
	}
		 void display() {
			innerClass rob = new innerClass();
			rob.print();
		}
		
	}
public class innerclass {
  public static void main(String[] args) {
	  outerClass viv = new outerClass();
	  viv.display();
	  
  }
}
