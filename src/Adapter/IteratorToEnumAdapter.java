package Adapter;

import javax.swing.text.html.HTMLDocument;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;

public class IteratorToEnumAdapter implements Enumeration {
    ArrayList arrayList ;

    Iterator arrayListIterator;

    public IteratorToEnumAdapter(ArrayList arrayList) {
        this.arrayList = arrayList;
    }

    @Override
    public boolean hasMoreElements() {
        arrayListIterator = arrayList.iterator();
        return arrayListIterator.hasNext();
    }

    @Override
    public Object nextElement() {
        arrayListIterator = arrayList.iterator();
        while(arrayListIterator.hasNext()){
            System.out.println(" ---> " + arrayListIterator.next());
        }
        return arrayListIterator;
    }
}
