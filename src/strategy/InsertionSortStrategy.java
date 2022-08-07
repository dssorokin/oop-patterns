package strategy;

public class InsertionSortStrategy implements SortStrategy{

    @Override
    public void sort(int[] digits) {
        for (int i = 1;i < digits.length;i++) {
            int iDigit = digits[i];
            for (int j = i - 1; j >= 0;j--) {
                int jDigit = digits[j];
                if (jDigit > iDigit) {
                    break;
                }
                digits[j + 1] = jDigit;
                digits[j] = iDigit;
            }
        }
    }
}
