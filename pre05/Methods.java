import java.io.*;
import java.util.*;

public class Methods{
  public static void main(String[] args){
    System.out.println(isDivisible());
    System.out.println(isTriangle());
    System.out.println(ack());
    Scanner ackCheck= new Scanner(System.in);
    System.out.print("Enter first integer: ");
    int m= ackCheck.nextInt();
    System.out.print("Enter second integer: ");
    int n= ackCheck.nextInt();
    System.out.println(ack(m,n));
  }
  public static boolean isDivisible () {
    Scanner in= new Scanner(System.in);
    System.out.print("Is this divisible? Enter one number: ");
    int n = in.nextInt();
    System.out.print("Enter another number: ");
    int m = in.nextInt();
    if (n%m == 0){
    return true;
    } else {
      return false;
    }
  }