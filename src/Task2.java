public class Task2 {
    public static void printArray(int[] array) {
        for (int element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    public static void printArray(String[] array) {
        for (String element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }


    public static void printArray(int[][] array) {
        for (int[] row : array) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }


    public static void printArray(float[][] array) {
        for (float[] row : array) {
            for (float element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[] intArray = {1, 2, 3, 4, 5};
        printArray(intArray);

        String[] stringArray = {"Hello", "World"};
        printArray(stringArray);

        int[][] intMatrix = {{1, 2}, {3, 4}};
        printArray(intMatrix);

        float[][] floatMatrix = {{1.1f, 2.2f}, {3.3f, 4.4f}};
        printArray(floatMatrix);
    }
}
