/*
Two players A and B throw a fair coin N times.
If Head, then A gets 1 point; otherwise B.
******
What happens to the absolute difference in points as N increases?
What is the probability that one of the players is leading between 50%
                    and 55% of the time? Or more than 95% of the time?
In case of 20 trials, say, what is the probability of 5 Heads in a row?
 */

import java.util.Random;

public class CoinToss {

    protected int N; // total number of trials
    protected double p; // probability on head
    protected Random rand; // random number generator

    public CoinToss(int N){
        this(N, 0.5);
    }

    public CoinToss(int N, long seed){
        this(N , 0.5, seed);
    }

    public CoinToss(int N, double p) {
        this.N = N;
        this.p = p;
        this.rand = new Random();
    }


    public CoinToss(int N, double p, long seed) {
        this.N = N;
        this.p = p;
        this.rand = new Random(seed);
    }

    public void printRealisation(){
        int n = 0;
        int pointA = 0; // head
        int pointB = 0; // tail

        while (n < N){
            if (rand.nextDouble() < p){
                pointA = pointA + 1;
            }
            else {
                pointB = pointB + 1;
            }

            n = n+1;
            System.out.println("" + (pointA - pointB));
        }
    }
    public static void main(String[] args){
        CoinToss coinToss = new CoinToss(1000, 0.5);
        coinToss.printRealisation();
    }
}
