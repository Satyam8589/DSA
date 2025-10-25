class Solution {
    public int totalMoney(int n) {
        int total = 0;
        int weekStart = 1;
        int day = 0;

        while (n > 0) {
            int current = weekStart;
            for (int i = 0; i < 7 && n > 0; i++) {
                total += current;
                current++;
                n--;
            }
            weekStart++;
        }

        return total;
    }
}
