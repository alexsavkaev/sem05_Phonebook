import java.util.*;

public class Main {
    public static void main(String[] args) {


//    Реализуйте структуру телефонной книги с помощью HashMap.
//    Программа также должна учитывать, что во входной структуре будут повторяющиеся
//    имена с разными телефонами, их необходимо считать, как одного человека с разными телефонами.
//    Вывод должен быть отсортирован по убыванию числа телефонов.
        HashMap<String, List<String>> phoneBook = new HashMap<>();
        phoneAdd(phoneBook,"Иван Иваныч Петров", "55664");
        phoneAdd(phoneBook,"Иван Иваныч Петров", "66456");
        phoneAdd(phoneBook,"Иван Иваныч Петров", "57898");
        phoneAdd(phoneBook,"Мария Михална Платова", "33412");
        phoneAdd(phoneBook,"Мария Михална Платова", "23423");
        phoneAdd(phoneBook,"Сан Саныч Серпин", "77777");
        System.out.println(phoneBook);
        ArrayList<String> list = new ArrayList<>(phoneBook.keySet());
        list.sort(Comparator.comparingInt(o -> phoneBook.get(o).size()));
        System.out.println(list);
    }
    private static void phoneAdd(HashMap<String, List<String>> map, String key, String value) {
        map.putIfAbsent(key, new ArrayList<>());
        map.get(key).add(value);
    }
}
