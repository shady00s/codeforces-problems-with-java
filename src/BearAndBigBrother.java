import java.util.Scanner;

// Problem link  http://codeforces.com/contest/791/problem/A

public class BearAndBigBrother {


     public static void main(String[] args) {
        
         Scanner  scan = new Scanner(System.in) ;
      
         int limak = scan.nextInt();
         int bob = scan.nextInt();
         //limak weight is TRIPLED after each year , bob weight DOUBLED
        int year = 0;
      
      

      
          while( limak <= bob){
             limak *= 3 ;
      
             bob *= 2 ;

            year ++;
          }
          System.out.println(year);
          scan.close();
          }
    }



