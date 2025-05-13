import java.util.Arrays;

@FunctionalInterface
interface Comparator<T> {
    int compare(T a, T b);
}
public class Main {
    public static <T> void sortArray(T[] array, Comparator<T> comparator) {
        Arrays.sort(array, (a, b) -> comparator.compare(a, b));
    }
    public static void main(String[] args) {
        Integer[] numbers = {5, 3, 4, 1, 2};

        sortArray(numbers, (a, b) -> a - b);
        System.out.println("Сортировка по возрастанию: " + Arrays.toString(numbers));

        sortArray(numbers, (a, b) -> b - a);
        System.out.println("Сортировка по убыванию: " + Arrays.toString(numbers));
    }
}