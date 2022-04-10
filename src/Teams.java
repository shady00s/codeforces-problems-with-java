// problem link : https://codeforces.com/contest/231/problem/A

import java.util.Scanner;

public class Teams {
 public static void main(String[] args) {
     Scanner scan = new Scanner(System.in);

     // number of rounds 

     int rounds = scan.nextInt();

     int winRounds = 0;
     for(int x = 0; x< rounds;x++){
         //number of compitions on each round
            int firstRound = scan.nextInt();
            int secRound = scan.nextInt();
            int thirdRound = scan.nextInt();

            int sumOfWin = firstRound + secRound + thirdRound;

            if(sumOfWin > 1){
                winRounds ++;
            }

     }
     scan.close();
     System.out.println(winRounds);
 }   
}
