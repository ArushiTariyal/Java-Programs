public class Jagged2DArray {
    public static void main(String[] args){
        int[][] arr = new int[3][];
        arr[0] = new int[4];
        arr[1] = new int[5];
        arr[2] = new int[3];

        for(int i=0; i<arr.length; i++){
            for(int j = 0; j<arr[i].length; j++){
                arr[i][j] = i+j;
            }
        }
        for(int[] e: arr){
            for(int ee: e){
                System.out.print(ee+" ");
            }
            System.out.println();
        }
    }
}
