package b12_java_collection_framework.excercise;

import java.util.Comparator;

public class ComparatorSortDecrease implements Comparator<Product> {

    @Override
    public int compare(Product o1, Product o2) {
        return o2.getNameProduct().compareTo(o1.getNameProduct());
    }
}
