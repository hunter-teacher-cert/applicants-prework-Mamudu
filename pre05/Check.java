import java.io.*;
import java.util.*;

public static boolean ack(){
    Scanner ackCheck= new Scaner(System.in);
    System.out.print("Enter first integer: ");
    int n= ackCheck.nextInt();
    System.out.print("Enter second integer: ");
    int m= ackCheck.nextInt();
    int A;
  public static int ack(int m, int n){
  if (m==0){
    A(m,n)=n+1
  }else if(m>0 && n=0){
    A(m,n)=
    return n+1;
  }else if(m>0 && n==0){
    return ack(m-1,1);
  } else if(m>0 && n>0){
    return ack(m-1, ack(m, n-1));
  } else{
    return 0;