package org.example;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        task2();
    }

    public static void task1() {
//        Подсчитать количество вхождения каждого слова
//        Пример:
//        Россия идет вперед всей планеты. Планета — это не Россия.
//                toLoverCase().
        Map<String, Integer> map = new HashMap<>();
        String str = "qqqq we ee assss we we we ee ee qqqq";
        String[] newStr = str.toLowerCase().split(" ");
        for (String inNewStr : newStr) {
//            if (map.containsKey(inNewStr)) {
                map.putIfAbsent(inNewStr, 0);
                map.put(inNewStr, (map.get(inNewStr) + 1));
//                System.out.println(inNewStr + ' ' + map.get(inNewStr));
//            } else {
//                map.put(inNewStr, 1);
//            }
        }
        for (var entry : map.entrySet()) {
            System.out.println("слово - " + entry.getKey() + " , встретилось : " + entry.getValue());
        }
    }
    public static void task2() {
//         Подсчитать количество искомого слова,
//         через map (наполнением значение,
//         где искомое слово будет являться ключом)

        Map<String, Integer> map = new HashMap<>();
        String str = "qqqq we ee assss we we we ee ee qqqq";
        String inWord;
        String[] newStr = str.toLowerCase().split(" ");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input a word: ");
        inWord = scanner.next();
        map.put(inWord, 0);
        for (String inNewStr : newStr) {
            if (map.containsKey(inNewStr)) {
                map.put(inWord, (map.get(inWord) + 1));
                System.out.println(inNewStr + ' ' + map.get(inNewStr));
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


    }
}
