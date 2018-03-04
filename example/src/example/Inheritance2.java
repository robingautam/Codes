package example;

class Box {
	private double w,h,d;
	void Box(Box ob){
		w=ob.w;
		h=ob.h;
		d=ob.d;
	}
	void Box (double width, double height, double depth){
		w=width;
		h=height;
		d=depth;
	}
	void Box (double width, double height){
		w=width;
		h=height;
	}
	void Box (double width){
		w=width;

	}
	void Box() {
		w=-1;
		h=-1;
		d=-1;
	}
	double volume() {
		return w*h*d;
	}
}
class BoxWeight extends Box() {
	double w;
	BoxWeight(double weight){
		w=weight;
	}
}
class Inheritance {
	
}