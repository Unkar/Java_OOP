package StudentDomen;

import java.util.Comparator;

public class UserComparator<T extends User> implements Comparator<T> {
    @Override
    public int compare(T o1, T o2) {
        int resultOfCompare = o1.getFirstName().compareTo(o2.getFirstName());
        if (resultOfCompare == 0) {
            resultOfCompare = o1.getLastName().compareTo(o2.getLastName());
            return resultOfCompare;
        }
        return resultOfCompare;
    }
}
