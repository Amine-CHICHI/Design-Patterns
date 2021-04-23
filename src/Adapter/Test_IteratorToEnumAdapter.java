package Adapter;

import java.util.ArrayList;
import java.util.Enumeration;

public class Test_IteratorToEnumAdapter {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>();
        strings.add("amine");
        strings.add("anas");
        strings.add("sami");
        strings.add("salma");
        strings.add("dounia");

        IteratorToEnumAdapter iteratorToEnumAdapter = new IteratorToEnumAdapter(strings);

        testIteratorToEnumAdapter(iteratorToEnumAdapter);

    }

    private static void testIteratorToEnumAdapter(Enumeration enumeration) {
        if (enumeration.hasMoreElements()) {
            System.out.println("This this enum had more elements");
        }
        enumeration.nextElement();
    }
}
