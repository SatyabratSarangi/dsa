package Easy;
// Cyclically rotate by 1

//method 1
// import java.util.Arrays;

// public class Q3Cyclically_rotate_by_1
// {
//     static void rotate(int[] arr) {
//         // store the last element in a variable
//         int lastElement = arr[arr.length - 1];

//         // assign every value by its predecessor
//         for (int i = arr.length - 1; i > 0; i--) {
//             arr[i] = arr[i - 1];
//         }

//         // first element will be assigned by last element
//         arr[0] = lastElement;
//     }

//     public static void main(String[] args) {
//         int[] arr = {1, 2, 3, 4, 5};

//         rotate(arr);
//         System.out.println(Arrays.toString(arr));
//     }
// }

// method 2 2pointer

import java.util.Arrays;

public class Q3Cyclically_rotate_by_1
{
    static void rotate(int[] arr) {
    int i = 0, j = arr.length - 1;
        while (i != j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        rotate(arr);
        System.out.println(Arrays.toString(arr));
    }
}