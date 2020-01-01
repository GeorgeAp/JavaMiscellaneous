public class SimpleFix {

    static int sumRange(int[] ints){
        int sum = 0;
        for (int anInt : ints) {
            if (anInt >= 10 & anInt <= 100) {
                sum += anInt;
            }
        }
        return sum;
    }

    public static void main(String[] args){
        int[] inputValues = new int[]{30, 4, 9, 12, 98, -10, 10 };
        System.out.println(sumRange(inputValues));
    }
}
