public class lab2 {

void factorial(int n){
    int f=1;
    for(int i=1;i<=n;i++){
        f=f*i;

    }
    System.out.println("the factorial is"+f);
}
    void sumofdigits(int n){
        
        int r,sum=0;
        while(n!=0){
            r=n%10;
            sum=sum+r;
            n=n/10;

        }
        System.out.println("the sum of digits"+sum);



    }
 public static void main(String args[]) {
lab2 obj=new lab2();
obj.factorial(5);
obj.sumofdigits(456);
    }
    {
        
    }



    
}
