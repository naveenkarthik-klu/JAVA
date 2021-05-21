abstract class A {
abstract void callme ();
void callmetoo () {
System . out . println (" This is a concrete method ." );
}
}
class B extends A {
void callme () {
System . out . println ("B ’s implementation of callme ." );
}
}
class AbstractDemo {
public static void main ( String args []) {
B b = new B ();
b. callme ();
b. callmetoo ();
A a1 = new B();
a1.callme();
a1.callmetoo();
A a = new B();
a.callmetoo();
}
}