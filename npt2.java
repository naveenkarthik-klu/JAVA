class School { 
    // This is the inner class named Student
    class Student extends School { 
		// This is a method in inner class Student
        public void print() { 
			System.out.println("Hi! I am inner class STUDENT of outer class SCHOOL."); 

  } 
    } 
} 

public class npt2{ 
    public static void main(String[] args) { 

	Student a = new Student();
	a.print();
	}}