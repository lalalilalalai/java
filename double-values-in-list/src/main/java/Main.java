import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Kitty");
        list.add("Kitty");
        list.add("Rabbit");
        list.add("Beaver");
        System.out.println(deleteDoubleValuesFromList(list));
        System.out.println(deleteDoubleValuesFromListWithStream(list));
    }

    //         TODO delete doubles from list no using Set<> or Stream Api.
    //         TODO удалить дубликаты из листа, не используя Set<> и Stream Api.
    public static Collection<String> deleteDoubleValuesFromList(List<String> list) {
        List<String> distinctValuesList = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            String value = list.get(i);
            if (!distinctValuesList.contains(value)) {
                distinctValuesList.add(value);
            }
        }
        return distinctValuesList;
    }

    public static Collection<String> deleteDoubleValuesFromListWithStream(List<String> list) {
        return list.stream()
                .distinct()
                .toList();
    }
}
