package week07.sub05;

import java.util.Comparator;

public class MyCompare implements Comparator<String> {
    @Override
    public int compare(String a, String b) {
        return a.compareTo(b) * -1;
    }
}
