public class Multiplication{

    public static void main(String[] args){
        int x = 0;
        for(int i = 1; i < 11;i++){
            for(int j = 1 ; j < 11; j++){
                x = i*j;
                if(i == 10 && j!=1)System.out.format("%4d ",x);
                else if(j!= 1) System.out.format("%5d",x);
                else System.out.printf("%d",x);
            }
            System.out.println();
        }
    }
}
