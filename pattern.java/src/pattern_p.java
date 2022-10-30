class pattern_p{
    public static void main(String[] args) {
        int i,j,n=8;
        for(i=1;i<=n;i++){
            for(j=n;j>n-i;j--){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}