import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.Iterator;
public class Arshu{
    public static void main(String[] args) {
        ArrayDeque<Integer> al=new ArrayDeque<>();
        al.add(23);
        al.add(24);
        al.add(25);
        al.add(26);
        al.add(27);
        // for(int i=0;i<=al.size()-1;i++){
        //     System.out.print(al.get(i)+" ");
        // }
        Iterator itr=al.iterator();
        while(itr.hasNext()==true){
            System.out.print(itr.next());
        }
    }
}
