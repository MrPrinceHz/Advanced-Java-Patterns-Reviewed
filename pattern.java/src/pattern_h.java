import java.security.spec.RSAOtherPrimeInfo;

class pattern_h
{
    public static void main(String[] args)
    {
        int n=7;
        for(int i=1;i<=n;i++){
            if(i==1||i==n){
                for(int j=1;j<=n;j++){
                    System.out.print("#");
                }
            }
            else{
                for(int j=1;j<=n;j++){
                    if(j==(n-(i-1))||j==i){
                        System.out.print("#");
                    }
                    else{
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }

    }
}