
import java.io.*;
public class Main {
        public static void main(String[] args)
        {

            rowShifting();
            subBytes();

        }

    private static void subBytes() {


    }

    public static void rowShifting(){
            int[][] arr = {
                    { 1, 2, 3, 4},
                    { 5, 6, 7, 8},
                    { 9, 10, 11, 12},
                    { 13, 14, 15, 16}
            };

            for (int i = 0; i<4; i++){
                for (int j = 0; j<4; j++){
                    System.out.print(arr[i][j]+ " ");
                }
                System.out.println();
            }

            int temp;
            //Row 2
            temp = arr[1][0];
            arr[1][0] = arr[1][1];
            arr[1][1] = arr[1][2];
            arr[1][2] = arr[1][3];
            arr[1][3] = temp;

            //Row 3
            temp = arr[2][0];
            arr[2][0] = arr[2][2];
            arr[2][2] = temp;
            temp = arr[2][1];
            arr[2][1] = arr[2][3];
            arr[2][3] = temp;

            //Row 4
            temp = arr[3][0];
            arr[3][0] = arr[3][3];
            arr[3][3] = arr[3][2];
            arr[3][2] = arr[3][1];
            arr[3][1] = temp;

            System.out.println("Afterrr");

            for (int i = 0; i<4; i++){
                for (int j = 0; j<4; j++){
                    System.out.print(arr[i][j]+ " ");
                }
                System.out.println();
            }

        }

}
