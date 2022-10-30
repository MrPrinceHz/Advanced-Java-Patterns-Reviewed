class pattern_t{
    public static void main(String[] args) {
        int i,j,n=8;
        for(i=1;i<=n;i++){
            for(j=1;j<=n-i+1;j++) {
                if (i == 1 && j == 8)
                    continue;
                else
                    System.out.print(j);
            }
            for(j=2;j<=i*2-2;j++){
                System.out.print(" ");
            }
            for(j=n-i+1;j>=1;j--){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}