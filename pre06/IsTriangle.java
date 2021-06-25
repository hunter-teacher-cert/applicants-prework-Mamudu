import java.io.*;
import java.util.*;

public static boolean isTriangle(){
    Scanner tri= new Scanner(System.in);
    System.out.print("Is this a triangle? Enter one side: ");
    int a= tri.nextInt();
    System.out.print("Enter the second side: ");
    int b= tri.nextInt();
    System.out.print("Enter the last side: ");
    int c= tri.nextInt();
    if (a+b<c){
      return false;
    } else if (a+c<b){
      return false;
    } else if(b+c<a){
      return false;
    } else{
      return true;
    }
}