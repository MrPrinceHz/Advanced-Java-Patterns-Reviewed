class pattern_s{
    public static void main(String[] args) {
        int i,j,n=8;
        for(i=1;i<=n;i++){
            for(j=1;j<=i;j++){
                if(i==8 && j==8)
                    continue;
                else System.out.print(j);
            }
            for(j=n*2-i*2-1;j>=1;j--){
                System.out.print(" ");
            }
            for(j=i;j>=1;j--){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}