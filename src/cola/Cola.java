
package cola;

import java.util.LinkedList;
import java.util.ArrayList;
import java.util.Arrays;

public class Cola {


    public static void main(String[] args) {
        
        LinkedList cola = new LinkedList ();
        
        cola.add("Ray");
        cola.add("nicholl");
        cola.add("arrieta");
        
        for (int i=1;i<11;i++)
            cola.offer(i);
        
        System.out.println("LA COLA ESTA VACIA?");
        System.out.println(cola.isEmpty());
        
        //System.out.println(cola.size());
        
        System.out.println(cola.get(4));
        
        System.out.println(cola.indexOf("nicholl"));
        
        cola.remove(4);
        cola.remove(0);
        cola.remove(7);
        cola.remove(6);
        
        while (cola.peek()!=null){
            System.out.println(cola.poll());
        }
        
        cola.clear();
        
         while (cola.peek()!=null){
            System.out.println(cola.poll());
        }
        
         
           System.out.println("LA COLA ESTA VACIA?");
        System.out.println(cola.isEmpty());
         
    }
    
}
