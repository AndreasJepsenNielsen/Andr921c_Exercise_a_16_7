import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Kap16Opgave7 {

    public static void main(String[] args) {
        LinkedIntList A = new LinkedIntList();

        A.add(1);
        A.add(2);
        A.add(3);
        A.add(4);

        deleteBack(A);

        System.out.println(A); // 4 er fjernet

    }

    // Kapitel 16 opgave 7

    public static int deleteBack(LinkedIntList list) {
        if (list.isEmpty()) {
            Iterator it = list.iterator();

            it.next();
        }
        int toReturn = 0;
        toReturn = list.get(list.size() - 1);
        list.remove(list.size() - 1);

        System.out.println(toReturn);
        return toReturn;
    }

}
