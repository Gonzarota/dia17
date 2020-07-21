import java.util.Random;

public class SumaArray {

    private int [][]array;
    Random random= new Random();

    public SumaArray() {
        array = new int[4][4];
        init();
    }
    public void init(){
        for(int i=0;i<array.length;i++){
            for(int j=0;j<array[i].length;j++){
                if(i==array.length-1){
                    array[i][j]=array[0][j]+array[1][j]+array[2][j];
                }else{
                    array[i][j]=random.nextInt(50);
                }
            }
        }
    }

    public void draw(){
        for(int i=0;i<array.length;i++){
            for(int j=0;j<array[i].length;j++){
                System.out.print(array[i][j]+"  ");
            }
            System.out.println();
        }
    }
}
