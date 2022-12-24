package org.example;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        task3();
    }

    public static void task1() {
//        Подсчитать количество вхождения каждого слова
//        Пример:
//        Россия идет вперед всей планеты. Планета — это не Россия.
//                toLoverCase().
        Map<String, Integer> map = new HashMap<>();
        String str = "qqqq we ee assss we we we ee ee qqqq We";
        String[] newStr = str.toLowerCase().split(" ");
        for (String inNewStr : newStr) {
            map.putIfAbsent(inNewStr, 0);
            map.put(inNewStr, (map.get(inNewStr) + 1));
        }
        for (var entry : map.entrySet()) {
            System.out.println("слово - " + entry.getKey() + " , встретилось в тексте: " + entry.getValue());
        }
    }

    public static void task2() {
//         Подсчитать количество искомого слова,
//         через map (наполнением значение,
//         где искомое слово будет являться ключом)

        Map<String, Integer> map = new HashMap<>();
        String str = "qqqq We ee assss we we we ee ee qqqq";
//        String inWord;
        String[] masStr = str.toLowerCase().split(" ");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a search word: ");
        String inWord = scanner.next();
        inWord = inWord.toLowerCase();
        map.put(inWord, 0);
        for (String inNewStr : masStr) {
            if (map.containsKey(inNewStr)) {
                map.put(inWord, (map.get(inWord) + 1));
            }
        }
        for (var entry : map.entrySet()) {
            System.out.println("слово - " + entry.getKey() + " , встретилось : " + entry.getValue());
        }
    }

    public static void task3() {
//          Найти пересечения слов в массивах и указать их общее количество.
//          Пример:
//          mas1= [“qwe”,”asd”,”qwe”,”x”]
//          mas2=[“qwe”,”v”]
//          Результат:
//          qwe=3
        String[] mas1 = new String[]{"qwe", "asd", "qwe", "x"};
        String[] mas2 = new String[]{"qwe", "v", "x", "x"};
        Map<String, Integer> map = new HashMap<>();
        for (String item : mas1) {
            map.put(item, 1);
            for (String item2 : mas2) {
                if (map.containsKey(item2)) {
                    map.put(item2, (map.get(item2) + 1));
                }
            }
            if (map.get(item) == 1) {
                map.remove(item);
            }
        }
        for (var entry : map.entrySet()) {
            System.out.println("слово - " + entry.getKey() + " , " +
                    "пересекается в 2х массивах. Общее количество : " + entry.getValue() + " раз(а)");
        }
    }
}
