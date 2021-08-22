package _my.test;

public class FinalArray {
    static final int[] arr = new int[5];
    static final TestClass testClass = new TestClass();

    public static void main(String[] args) {
        arr[0]  = 1;
//        arr = new int[6];
        testClass.setA(6);
//        testClass = new TestClass();
    }

    static class TestClass {
        private int a;
        private int b;

        public int getA() {
            return a;
        }

        public void setA(int a) {
            this.a = a;
        }

        public int getB() {
            return b;
        }

        public void setB(int b) {
            this.b = b;
        }
    }
}
