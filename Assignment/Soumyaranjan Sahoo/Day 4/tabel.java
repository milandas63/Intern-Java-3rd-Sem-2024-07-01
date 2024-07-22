public class tabel {
    public static void main(String[] args) {
        int start = 2;
        int end = 40;
        for(int i = start ; i <= end ; i += 6){
            for(int j = 1 ; j <= 10 ; j++){
                for(int k = i ; k<(i+6) ; k++){
                    System.out.print(padL(k,2) + "x" + padL(j,2) + " = " + padL((k*j),3) + " ");
                    if(k>=end) break;
                }
                System.out.println();
            }
            System.out.println();
        }
    }
    private static String padL(int n , int l){
        String r = ""+n;
        for(int i = r.length(); i < l ; i++){
            r = " "+r;
        }
        return r;
    }
}