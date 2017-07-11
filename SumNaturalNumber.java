# SumNaturalNumber
import java.util.*;
import java.io.*;
public class SumNaturalNumber
{
  public static void main(String args[])
  {
    int n,i=1,sum=0;
    Scanner sc=new Scanner(System.in);
    n=sc.nextInt();
    do
    {
      sum=sum+i;
      i+=1;
    }
    while(i<=n)
    System.out.println("sum of First"+n+"Numbers="+sum);
    }
    }
