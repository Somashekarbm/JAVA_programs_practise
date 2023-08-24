public class Primeexample{
    public static void main(String[] args){
        int i,m=0,flag=1;
        int n=1;
        m=n/2;
        if(n==0||n==1){
            System.out.println(n+"is not a prime number");
            flag=0;
        }
        for(i=2;i<=m;i++){
             if(n%i==0){
                 flag=0;
                 break;
             }
        }
        if(flag==1){
             System.out.println(n+"is a prime number");
        }


    }
}