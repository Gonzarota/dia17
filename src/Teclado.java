public class Teclado {

    private int [][]array;

    public Teclado(){
        array=new int[3][3];
        init();
    }

    public void init(){
        int contador=0;
        for(int i=0;i<array.length;i++){
            for(int j=0;j<array[i].length;j++){
                array[i][j]=contador;
                contador++;
            }
        }
    }

    public void draw(){
        for(int i=0;i<array.length;i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j]);
            }
            System.out.println();
        }
    }
}


