class pattern_f{
    public static void main(String[] args) {
        int i,j,n=7;
        for(i=1;i<=n;i++) {
            System.out.print("#");
        }
        System.out.println();
        for(i=1;i<n;i++){
            for(j=1;j<=i;j++){
                System.out.print(" ");
            }
            for(j=1;j<2;j++){
                System.out.print("#");
            }
            System.out.println();
        }
        for(i=1;i<=n;i++){
            System.out.print("#");
        }
    }
}