//ArrayList
import java.util.*;
public class LinkedList
{
public static void main(String args[])
{
LinkedList list=new LinkedList();
list.add("bala");
list.add("arun");
list.add("srinu");
list.add("null");
ListIterator i=list.ListIterator();
while(i.hasNext())
{
Object obj=i.next();
if(obj!=NULL)
System.out.println(Obj.toString());
else 
System.out.println("Null value at end");
}
}
}