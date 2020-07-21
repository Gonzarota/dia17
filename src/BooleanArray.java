public class BooleanArray {


    private boolean[][]array;

    public BooleanArray() {
        array = new boolean[7][7];
        int medio=array.length/2;
        array[medio][medio]=true; //con esto lo hace automatico siempre que sea impar, el metodo init solo vale para un 3x3
        //init();
    }
    /*private void init() {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if(i==1&&j==1){
                    array[i][j]=true;
                }else{
                    array[i][j]=false;
                }

            }
        }
    }*/
    public void draw() {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }
    }
}

