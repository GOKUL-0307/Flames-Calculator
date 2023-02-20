import java.util.*;
import java.lang.*;
import java.io.*;
public class Main
{
public static void main(String[] args) {
   Scanner sc =new Scanner(System.in);
   //System.out.println("NOTE: ENTER THE NAME WITHOUT USING SPACE");
   System.out.println("Enter the 1st person Name :");
   String s1 = sc.nextLine();
   System.out.println("Enter the 2nd person Name :");
   String s2 = sc.nextLine();
   s1=s1.toUpperCase();
   s2=s2.toUpperCase();
   s1=s1.replaceAll(" ","");//use to remove spaces
   s2=s2.replaceAll(" ","");//use to remove spaces
   StringBuffer sb1=new StringBuffer(s1);
   StringBuffer sb2=new StringBuffer(s2);
   sc.close();
   for(int i=0;i<sb1.length();i++){
       for(int j=0;j<sb2.length();j++){
           if(sb1.charAt(i)==sb2.charAt(j)){
           sb1=sb1.deleteCharAt(i);
           sb2=sb2.deleteCharAt(j);
           i=0;
           j=-1;
           }
       }
    }
   //System.out.println(sb1);
   //System.out.println(sb2);
   int t=sb1.length()+sb2.length();
   //System.out.println(t);
   int t1=t-1;
   String f="flames";
   for(int k=6;k>1;k--){
       int l=t1%k;
       if(l==0){
           f=f.substring(l+1);
       }
       else{
           f=f.substring(l+1)+f.substring(0,l);
       }
   }
   //System.out.println(f);
   char c=f.charAt(0);
   System.out.println("Your Flames choice is !!");
switch(c){
case 'f':
   System.out.println("Friend");
   break;
   case 'l':
   System.out.println("Love");
   break;
        case 'a':
   System.out.println("Affection");
   break;
case 'm':
   System.out.println("Marriage");
   break;
case 'e':
   System.out.println("Enemy");
   break;
case 's':
   System.out.println("Sibling");
   break;


}
//System.out.println(t);
   

}
}
