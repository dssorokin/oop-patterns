package strategy;

public class StrategyMain {

    private SortStrategy sortStrategy;

    public void setSortStrategy(SortStrategy sortStrategy) {
        this.sortStrategy = sortStrategy;
    }

    public void sortLogic(int[] digits, SortType sortType) {
        switch (sortType) {
            case SELECTION_SORT -> setSortStrategy(new SelectionSortStrategy());
            case INSERTION_SORT -> setSortStrategy(new InsertionSortStrategy());
            case BUBBLE_SORT -> setSortStrategy(new BubbleSortStrategy());
        }

        sortStrategy.sort(digits);
    }

    public static enum SortType {
        INSERTION_SORT, SELECTION_SORT, BUBBLE_SORT
    }
}

