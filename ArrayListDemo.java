//ArrayList
import java.util.*;
public class LinkedListDemo
{
public static void main(final String args[]) {
    final LinkedList list = new LinkedList();
    list.add("bala");
    list.add("arun");
    list.add("srinu");
    list.add("null");
    final ListIterator i = list.ListIterator();
    while (i.hasNext()) {
        final Object obj = i.next();
if(obj!=NULL)
System.out.println("The list items is:"+Obj.toString());
else 
System.out.println("Null value at end");
}
}
}