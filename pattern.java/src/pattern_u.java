class pattern_u{
    public static void main(String[] args) {
        int p=1,n=8;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=(n-i);j++){
                System.out.print("  ");
            }
            for(int j=1;j<=(2*(i-1))+1;j++){
                if(j<=i){
                    if(p>9){
                        p=0;
                    }
                    System.out.print(p+" ");
                    p+=1;
                }
                else{
                    if(j==(i+1)){
                        p-=2;
                    }
                    else p-=1;
                    if(p<0){
                        p=9;
                    }
                    System.out.print(p+" ");
                }
            }
            if(i>=2){
                p+=1;
            }
            System.out.println();
        }
    }
}