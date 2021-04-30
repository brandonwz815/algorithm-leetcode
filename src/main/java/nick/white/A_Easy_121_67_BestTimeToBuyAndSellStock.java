package nick.white;

public class A_Easy_121_67_BestTimeToBuyAndSellStock {

    public static void main(String[] args) {
        int[] prices = {7, 1, 5, 3, 6, 4};
        System.out.printf(" After: %s\n", maxProfit(prices));

        int[] prices2 = {7, 6, 4, 3, 1};
        System.out.printf(" After: %s\n", maxProfit(prices2));
    }

    public static int maxProfit(int[] prices) {
////        int minFromLeft = Integer.MAX_VALUE;
//        int minLeftPosition = 0;
//        int aPointer = 0;
//
////        int maxFromRight = Integer.MIN_VALUE;
//        int maxRightPosition = prices.length -1;
//        int bPointer = prices.length - 1;
//
//        while ( bPointer > minLeftPosition) {
//            if (prices[aPointer] < prices[minLeftPosition]) {
//                minLeftPosition = aPointer++;
//            }
//            if (prices[bPointer] > maxFromRight) {
//                maxFromRight = prices[bPointer--];
//            }
//        }
//        return maxFromRight < maxFromRight ? maxFromRight - minFromLeft : -1;
        return 0;
    }
}
