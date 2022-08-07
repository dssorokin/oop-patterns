import strategy.StrategyMain;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        StrategyMain strategyMain = new StrategyMain();
        int[] digits = {8, 4, 5, 2, 1, 11, 3, 7};

        strategyMain.sortLogic(digits, StrategyMain.SortType.SELECTION_SORT);
    }
}