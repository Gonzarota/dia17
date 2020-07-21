public class IntArray {


    private int[][]array;

    public IntArray(){
        array= new int [8][8];
        init();
    }

    private void init(){
        for(int i=0;i<array.length;i++){
            for(int j=0;j<array[i].length;j++){
                array[i][j]=i;
            }
        }
    }


    public void draw(){
        for(int i=0;i<array.length;i++){
            for(int j=0;j<array[i].length;j++){
                System.out.print(array[i][j]);
            }
            System.out.println();
        }
    }
}
