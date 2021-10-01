package b21_behavarioral_design_pattern.practice.strategy_design_pattern;

import java.util.List;

public interface SortStrategy {
    <T> void sort(List<T> items);
}
