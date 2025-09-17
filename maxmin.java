import java.util.Scanner;
class minnum{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int []num=new int[size];
        for(int ind=0;ind<size;ind++){
            num[ind]=sc.nextInt();
        }
        int first=num[0];
         for(int ind=0;ind<size;ind++){
           if(first<num[ind])
               first=num[ind];
        } 
        int second=num[0];
        for(int ind=0;ind<size;ind++){
           if(second>num[ind])
               second=num[ind];
        } 
        System.out.println("max num:"+first);
         System.out.println("min num:"+second);
        }
        
     }