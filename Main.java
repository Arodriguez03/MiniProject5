//imports a scanner for user input
import java.util.Scanner;
class Main {
  public static void main(String[] args) {
 Scanner scan = new Scanner(System.in);
 //asks users for investment and minimum drop
 System.out.println("Welcome to the stock market. How much would you like to invest? (include decimals)");
 double investing = scan.nextDouble();
 System.out.println("What is the lowest you would like the stock to drop to before selling? (include decimals as a percentage)");
 double miniDrop = scan.nextDouble();
 //assigns "stock market" value for reference
 double currentValue = 0.3;

//calls method
System.out.println( "This is how much money you have after investment: " + stocks(investing, miniDrop, currentValue));
 
 
  }
  //method takes user input and invests it 
  //returns value after investment is complete
  public static double stocks(double invest, double min, double value){
    double result;

    if(value > min){
     result = invest * value;
     invest = result + invest;
     value = value - 0.05;
     return stocks(invest, min, value); 
    }else{
      return invest;
    }
  }
}