class pattern_e{
    public static void main(String[] args) {
        int i,j,n=8;
        for(i=1;i<=n;i++){
            for(j=n-1;j>=i;j--){
                System.out.print("  ");
            }
            for(j=1;j<=(i*2-1);j++){
                System.out.print("# ");
            }
            System.out.println();
        }
    }
}