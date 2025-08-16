import java.util.*;

public class RotateImage {

    public void rotate(int[][] matrix) {
        // TODO: in-place rotate the matrix 90 degrees clockwise
    }

    public static void main(String[] args) {
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        new RotateImage().rotate(matrix);
        System.out.println(Arrays.deepToString(matrix));
    }
} 