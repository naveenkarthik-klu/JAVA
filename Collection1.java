import java.util.*;
import java.util.HashMap; 
import java.util.Map; 
class Collection1{
 public static void print(Map<String, Integer> map) 
{ 
if (map.isEmpty()) { 
System.out.println("Map is empty"); 
} 
  
else { 
System.out.println(map); 
} 
} 	
public static void main(String arg[])
{
System.out.println("\tArrayList");	
ArrayList <String> list = new ArrayList <String>();	
list.add("Ravi");
list.add("Vijay");
list.add("Bavi");
list.add("Ajay");
System.out.println("List elements (using println func.)");
System.out.println(list);
System.out.println("\tIterator");
Iterator iterator = list.iterator(); 
System.out.println("List elements (using iterator)"); 
while (iterator.hasNext()) 
System.out.print(iterator.next() + " "); 
System.out.println(); 
System.out.println("\tHash map");
HashMap<String, Integer> map = new HashMap<>(); 
print(map); 
map.put("Vishal", 10); 
map.put("Sachin", 30); 
map.put("Vaibhav", 20); 
System.out.println("Size of map is: "+ map.size()); 
print(map); 
if (map.containsKey("Vishal")) { 
Integer a = map.get("Vishal"); 
System.out.println("Value for key"+ " \"vishal\" is: "+ a); 
} 
map.clear(); 
print(map);
}
}

