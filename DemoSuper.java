class Box {
private double width ;
private double height ;
private double depth ;
Box ( double w , double h , double d) {
width = w;
height = h ;
depth = d;
}
Box () {
width = -1;
height = -1;
depth = -1;
}
double volume () {
return width * height * depth ;
}
}
class BoxWeight extends Box {
double weight ; // weight of box
BoxWeight ( double w , double h , double d , double m) {
super (w , h , d ); // call superclass constructor
weight = m;
}
BoxWeight () {
super ();
weight = -1;
}
}
class DemoSuper {
public static void main ( String args []) {
BoxWeight mybox1 = new BoxWeight (10 , 20 , 15 , 34.3);
BoxWeight mybox3 = new BoxWeight (); // default
double vol ;
vol = mybox1 . volume ();
System . out . println (" Volume of mybox1 is " + vol );
vol = mybox3 . volume ();
System . out . println (" Volume of mybox3 is " + vol );
}
}