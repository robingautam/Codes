package example;
import java.util.*;

class box {
	int l,b,h;
	void setDimension(int L, int B, int H) {
		l=L;
		b=B;
		h=H;
	}
	void setDimension(int L,int B) {
		l=L;
		b=B;
	}
	void setDimension(int L) {
		l=L;
	}
	void setDimension(double L, double B, double H) {
		
	}
	int getLength() {
		return l;
	}
	int getBreadth() {
		return b;
	}
	int getHeight() {
		return h;
	}
	
}
class heavyBox extends box {
	int w;
	void setWeight(int W) {
		w = W;
	}
	int getWeight() {
		return w;
	}
	void print() {
		System.out.println("length of the box is "+l);
		System.out.println("breadth of the box is "+b);
		System.out.println("height of the box is "+h);
		System.out.println("weight of the box is "+w);
	}
}



public class inheritance {
    public static void main(String[] args) {
    	heavyBox rob = new heavyBox();
		rob.setDimension(10, 20);
		rob.setWeight(50);
	  rob.print();
    }
}
