package arraylist.example;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class UseOfIterator {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        list.add(53);
        list.add(60);
        list.add(80);

        Iterator it = list.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
        System.out.println("Java Project 8 correction 1 shared with Shazzad Mahmud");
    }
}
