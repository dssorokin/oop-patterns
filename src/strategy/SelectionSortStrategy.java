package strategy;

public class SelectionSortStrategy implements SortStrategy{

    @Override
    public void sort(int[] digits) {

        for (int i = 0;i < digits.length;i++) {
            int min = digits[i];
            int minIndex = i;
            for (int j = i;j < digits.length;j++) {
                if (min > digits[j]) {
                    min = digits[j];
                    minIndex = j;
                }
            }
            int temp = digits[i];
            digits[i] = min;
            digits[minIndex] = temp;
        }

    }
}
