import java.util.*;

class Primenum{
  public static void main(String[] args){
  System.out.println("enter a number:");
  int i,flag=0;
  Scanner s=new Scanner(System.in);
  int a=s.nextInt();
  if(a==0||a==1){  
   System.out.println(a+" is not prime number");      
  }else{  
   for(i=2;i<a;i++){      
    if(a%i==0){      
     System.out.println(a+" is not prime number");      
     flag=1;      
     break;      
    }      
   }      
   if(flag==0)  { System.out.println(a+" is prime number"); }  
  }
  
    
  }
}