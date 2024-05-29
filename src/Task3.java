import java.util.Arrays;
import java.util.Comparator;

public class Task3 {
    private String[] array;

    public Task3(String[] array) {
        this.array = array;
    }


    public String arrayToString() {
        return String.join(" ", array);
    }


    public void sortReverseOrder() {
        Arrays.sort(array, String.CASE_INSENSITIVE_ORDER.reversed());
    }


    public void sortByWordCount() {
        Arrays.sort(array, Comparator.comparingInt(this::countWords));
    }


    private int countWords(String str) {
        return str.trim().split("\\s+").length;
    }

    public static void main(String[] args) {
        String[] array = {"Hello World", "Java is fun", "Programming is awesome"};
        Task3 utils = new Task3(array);


        System.out.println("Исходный массив: " + utils.arrayToString());


        utils.sortReverseOrder();
        System.out.println("Массив в обратном порядке: " + utils.arrayToString());


        utils.sortByWordCount();
        System.out.println("Массив, отсортированный по количеству слов: " + utils.arrayToString());
    }
}

