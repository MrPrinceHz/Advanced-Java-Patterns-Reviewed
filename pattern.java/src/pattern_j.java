class pattern_j{
    public static void main(String[] args) {
        int i,j,n=8;
        for(i=1;i<=n;i++){
            for(j=1;j<i;j++){
                System.out.print("  ");
            }
            for(j=1;j<=(15-i*2);j++){
                System.out.print("# ");
            }
            System.out.println();
        }
    }
}