package b12_java_collection_framework.excercise;

import java.util.Comparator;

public class ComparatorSortIncrease implements Comparator<Product> {


    @Override
    public int compare(Product o1, Product o2) {
        return o1.getNameProduct().compareTo(o2.getNameProduct());
    }
}
