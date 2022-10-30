class pattern_o{
    public static void main(String[] args) {
        int i,j,n=8;
        for(i=1;i<=n;i++){
            for(j=n;j>i;j--){
                System.out.print("  ");
            }
            for(j=i;j>=1;j--){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}