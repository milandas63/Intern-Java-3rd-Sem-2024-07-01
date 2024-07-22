public class triangle {
    public static void main(String[] args) {
        int height = 20;
        for(int i = 0; i<height; i++){
            for(int j=0; j<2*height-1; j++){
                if(j==height-i-1 || j==height+i-1 || i==height-1){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
