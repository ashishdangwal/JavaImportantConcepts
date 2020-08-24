import java.util.*;
public class RemoveDuplicatesExample {

    public static void main(String[] args) {
        List<Integer> lst = new ArrayList<Integer>();
        lst.add(1);
        lst.add(14);
        lst.add(5);
        lst.add(1);
        lst.add(14);
        lst.add(2);
        System.out.println("Before Removing Duplicate: " + lst);
        Set<Integer> st = new LinkedHashSet<Integer>();
        Iterator itr = lst.iterator();
        while(itr.hasNext()){
            st.add((Integer) itr.next());
        }
        lst.clear();
        Iterator lsitr = st.iterator();
        while(lsitr.hasNext()){
            lst.add((Integer)lsitr.next());
        }
        System.out.println("After Removing Duplicate: " + lst);
    }
}
