import java.util.*;
import java.util.stream.Collectors;


public class test {
    public static void main(String[] args) {

    }


    public static int sortDesc(final int num) {
        // sorteert digits van int hoog-laag, cast terug naar een int
        if (num == 0) {
            return num;
        }
        List<Integer> numbers = new LinkedList<>();
        for (int i = num; i > 0; i /= 10) {
            numbers.add(i % 10);
        }
        return Integer.parseInt(numbers.stream()
                .sorted(Comparator.reverseOrder())
                .mapToInt(i -> i)
                .mapToObj(String::valueOf)
                .collect(Collectors.joining()));
    }
}
