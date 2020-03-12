package lesson3;

import org.w3c.dom.ls.LSOutput;

import java.util.*;


/*
1. Создать массив с набором слов (20-30 слов, должны встречаться повторяющиеся):
- Найти список слов, из которых состоит текст (дубликаты не считать);
- Посчитать сколько раз встречается каждое слово (использовать HashMap);
*/

public class Collections {

    public static void main(String[] args) {
        String BIG_STRING = "Программы на Java транслируются в байт-код Java, выполняемый виртуальной машиной Java (JVM) — программой, обрабатывающей байтовый код и передающей инструкции оборудованию как интерпретатор.\n" +
                "Дюк — талисман Java\n" +
                "Достоинством подобного способа выполнения программ является полная независимость байт-кода от операционной системы и оборудования, что позволяет выполнять Java-приложения на любом устройстве, для которого существует соответствующая виртуальная машина. Другой важной особенностью технологии Java является гибкая система безопасности, в рамках которой исполнение программы полностью контролируется виртуальной машиной. Любые операции, которые превышают установленные полномочия программы (например, попытка несанкционированного доступа к данным или соединения с другим компьютером), вызывают немедленное прерывание.\n" +
                "\n" +
                "Часто к недостаткам концепции виртуальной машины относят снижение производительности. Ряд усовершенствований несколько увеличил скорость выполнения программ на Java:\n";
        String[] arrayOfWords = BIG_STRING.split(" ");

        //Вывод на печать всего массива слов
        printAllWords(arrayOfWords);

        //Вывод на печать уникальных слов
        printUnique(arrayOfWords);

        //Вывод на печать количества слов
        printWordsRepeats(arrayOfWords);

    }

    private static void printAllWords (String[] arrayOfWords) {
        System.out.println(Arrays.asList(arrayOfWords));
    }

    private static HashSet<String> getSetOfUniqueWords(String[] array) {
        HashSet<String> setOfUniqueWords = new HashSet<>(Arrays.asList(array));
        return setOfUniqueWords;
    }

    private static void printUnique (String[] arrayOfWords) {
        System.out.println(getSetOfUniqueWords(arrayOfWords));
    }


    private static LinkedHashMap<String, Integer> getWordsRepeats(String[] array) {
        LinkedHashMap<String, Integer> hm = new LinkedHashMap<String, Integer>();
        Integer am;
        for (String i : array) {

            am = hm.get(i);
            hm.put(i, am == null ? 1 : am + 1);
        }
        return hm;
    }

    private static void printWordsRepeats (String[] arrayOfWords) {
        System.out.println(getWordsRepeats(arrayOfWords));
    }

}
