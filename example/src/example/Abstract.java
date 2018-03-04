package example;


abstract class animal {
	abstract void makesound();
}
class cat extends animal {
	public void makesound() {
		System.out.print("meow meow");
	}
}
class lion extends animal {
	public void makesound() {
		System.out.println("hoow hoow");
	}
}
class Abstract {
	public static void main(String []args) {
		lion rob = new lion();
		rob.makesound();
		cat viv = new cat();
		viv.makesound();
	}
	
}