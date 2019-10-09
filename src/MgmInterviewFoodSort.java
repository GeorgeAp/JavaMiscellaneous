import java.util.Arrays;

public class MgmInterviewFoodSort {

    public static FOOD[] potatoes = null;

    public abstract class FOOD {
        public int size = -1;

        public String whoAMI() {
            return this.getClass().getName()
                    .substring(MgmInterviewFoodSort.class.getName().length() + 1);
        }

        public abstract void defaultSize();
    }

    public class Potato extends FOOD {
        //
        @Override
        public void defaultSize(){}
    }

    public class Tomato extends FOOD {
        // default size for tomato
        @Override
        public void defaultSize(){
            size = 121;
        }
    }

    public void sortFood(int numberOfFood) {

        // sort food
        final FOOD[] sortedFood = new FOOD[numberOfFood];
        int indexOfTheSmallerFood = 0;

        for (int i = 0; i < numberOfFood; i++) {
            indexOfTheSmallerFood = i;

            for (int j = i; j < numberOfFood; j++) {

                if(potatoes[indexOfTheSmallerFood].size > potatoes[j].size){
                    indexOfTheSmallerFood = j;
                }

                if(potatoes[indexOfTheSmallerFood].size == potatoes[j].size &&
                        potatoes[indexOfTheSmallerFood].whoAMI().contains("Tomato")){
                    indexOfTheSmallerFood = j;
                }
            }
            sortedFood[i] = potatoes[indexOfTheSmallerFood];
            potatoes[indexOfTheSmallerFood] = potatoes[i];
        }

        //print result
        for (final FOOD potato : Arrays.asList(sortedFood)) {
            System.out.println(potato.whoAMI() + " " + potato.size);
        }
    }

    public static void main(final String[] args) {

        MgmInterviewFoodSort fs = new MgmInterviewFoodSort();

        int[] foodItemSizes = new int[]{11, 0, 1, 42, 77, 55, 46, 12, 11, 9}; // declare array of food item sizes, 0 value(s) mean
                                                                            // no size is given (default size). Tomato sizes
                                                                            //are entered first then potato
        int numberOfFood = foodItemSizes.length;  // number of FOOD items (potatoes plus tomatoes)
        int numberOfTomatoes = 2; // number of tomatoes variables in FOOD
        potatoes = new FOOD[numberOfFood];

        for (int i = 0; i < numberOfFood; i++){
            final Tomato t = fs.new Tomato();
            final Potato p = fs.new Potato();
            t.defaultSize();

            if (i < numberOfTomatoes){
                if (foodItemSizes[i]!= 0) {
                    t.size = foodItemSizes[i];
                    potatoes[i] = t;
                }
                else {
                    potatoes[i] = t;
                }
            }
            else {
                p.size = foodItemSizes[i];
                potatoes[i] = p;
            }

        }

        fs.sortFood(numberOfFood);

        /*
        final Tomato p0 = fs.new Tomato();
        p0.size = 11;
        potatoes[0] = p0;

        final Tomato p1 = fs.new Tomato();
        p1.defaultSize();
        potatoes[1] = p1;

        final Potato p2 = fs.new Potato();
        p2.size = 1;
        potatoes[2] = p2;

        final Potato p3 = fs.new Potato();
        p3.size = 42;
        potatoes[3] = p3;

        final Potato p4 = fs.new Potato();
        p4.size = 77;
        potatoes[4] = p4;

        final Potato p5 = fs.new Potato();
        p5.size = 55;
        potatoes[5] = p5;

        final Potato p6 = fs.new Potato();
        p6.size = 46;
        potatoes[6] = p6;

        final Potato p7 = fs.new Potato();
        p7.size = 12;
        potatoes[7] = p7;

        final Potato p8 = fs.new Potato();
        p8.size = 11;
        potatoes[8] = p8;

        final Potato p9 = fs.new Potato();
        p9.size = 9;
        potatoes[9] = p9;

        fs.sortFood(numberOfFood);
         */
    }
}
