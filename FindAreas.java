abstract class Shape {
double dim1 ;
double dim2 ;
Shape ( double a, double b) {
dim1 = a;
dim2 = b;
}
abstract double area ();
}
class Rectangle extends Shape {
Rectangle ( double a, double b) {
super (a, b);
}
// override area for rectangle
double area () {
System . out . println (" Inside Area for Rectangle .");
return dim1 * dim2 ;
}
}

class Circle extends Shape {
Circle ( double a,double b) {
super(a,b);
}
// override area for rectangle
double area () {
System . out . println (" Inside Area for Circle .");
return 0.5*dim1 * dim2 ;
}
}
class Triangle extends Shape {
Triangle ( double a, double b) {
super (a, b);
}
// override area for right triangle
double area () {
System . out . println (" Inside Area for Triangle .");
return dim1 * dim2 / 2;
}
}
class FindAreas {
public static void main ( String args []) {
Rectangle r = new Rectangle (9, 5);
Triangle t = new Triangle (10 , 8);
Circle c = new Circle(2,15);
Shape figref ;
figref = r;
System . out . println (" Area is " + figref . area ());
figref = t;
System . out . println (" Area is " + figref . area ());

figref = c;
System . out . println (" Area is " + figref . area ());

}
}
