import java.util.Scanner;
class meanmed{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int []num=new int[size];
        for(int ind=0;ind<size;ind++){
            num[ind]=sc.nextInt();
        }
        int sum=0;

       for(int ind=0;ind<size;ind++){
            sum=sum+num[ind];
        } 
        int avg=sum/2;
         System.out.println("avg:"+avg);
         int first=0,last=size;
         int middle=(first+last)/2;
          System.out.println("median:"+num[middle]);
    }}