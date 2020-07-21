import java.util.Random;

public class FloatArray {

    private float[][]array;
    Random random=new Random();

    public FloatArray(){
        array=new float[5][5];
        init();

    }

    private void init() {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = random.nextFloat()*100;
            }
        }
    }

    public void draw() {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.printf("%.2f ",array[i][j]);
            }
            System.out.println();
        }
    }
}
