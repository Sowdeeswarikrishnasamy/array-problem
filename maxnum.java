import java.util.Scanner;
class countnumber{
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
        System.out.println("max num:"+first);
        }
        
     }
    