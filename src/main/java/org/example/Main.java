package org.example;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        task1();
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
            map.put(inNewStr, 0);

            map.put(inNewStr, (map.get(inNewStr) + 1));
            System.out.println(inNewStr+' '+map.get(inNewStr));
        }
        for (var entry : map.entrySet()) {
            System.out.println("слово - " + entry.getKey() + " , встретилось : " + entry.getValue());
        }
    }
    public static void task2() {
//         Подсчитать количество искомого слова,
//         через map (наполнением значение,
//         где искомое слово будет являться ключом)

        Map<Character, Integer> map = new HashMap<>();
        String str = "qqqq we ee assss";
        for (int i = 0; i < str.length(); i++) {
            map.putIfAbsent(str.charAt(i),0);
            map.put(str.charAt(i),map.get(str.charAt(i))+1);
// if (map.containsKey(str.charAt(i))) {
// map.put(str.charAt(i), map.get(str.charAt(i)) + 1);
// } else {
// map.put(str.charAt(i),1);
// }
        }
// for (Map.Entry<Character, Integer> entry :map.entrySet()) {
        for (var entry :map.entrySet()) {
            System.out.println("буква - "+entry.getKey()+" , встретилась : "+entry.getValue());
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
