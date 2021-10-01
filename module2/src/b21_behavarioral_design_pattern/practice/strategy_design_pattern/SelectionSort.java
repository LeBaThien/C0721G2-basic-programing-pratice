package b21_behavarioral_design_pattern.practice.strategy_design_pattern;

import java.util.List;

public class SelectionSort implements SortStrategy {
    @Override
    public <T> void sort(List<T> items) {
        System.out.println("Selection sort");
    }
}
