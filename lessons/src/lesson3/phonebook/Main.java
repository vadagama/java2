package lesson3.phonebook;

/*
2. Написать простой класс PhoneBook(внутри использовать HashMap):
- В качестве ключа использовать фамилию
- В каждой записи всего два поля: phone, e-mail
- Отдельный метод для поиска номера телефона по фамилии (ввели фамилию, получили ArrayList телефонов),
и отдельный метод для поиска e-mail по фамилии.
Следует учесть, что под одной фамилией может быть несколько записей.
Итого должно получиться 3 класса Main, PhoneBook, Person.
*/

import java.util.*;

//Я не понял как можно использовать HashMap и возвращать несколько значений.
//Методы HashMap возвращают только значения по уникальному списку ключей.

public class Main {
    // Задаем по какому ключу будем искать
    public static String SEARCH_ELEMENT = "Краснов";

    public static void main(String[] args) {
        Person person1 = new Person("8(917)123", "oleg@yandex.ru");
        Person person2 = new Person("8(917)456", "vanya@yandex.ru");
        Person person3 = new Person("8(917)789", "kolya@yandex.ru");
        Person person4 = new Person("8(917)124", "fedya@yandex.ru");
        Person person5 = new Person("8(917)567", "oleg@yandex.ru");

        HashMap<String, Person> phones = new HashMap<String, Person>();

        phones.put("Краснов", person1);
        phones.put("Петров", person2);
        phones.put("Федоров", person3);
        phones.put("Краснов", person4);
        phones.put("Никифоров", person5);

        // Запуск методов для поиска

        searchMail(phones);
        searchPhone(phones);
    }

    protected static ArrayList<String> searchMail(HashMap<String, Person> map) {
        ArrayList<String> mails = new ArrayList<>();

        for (HashMap.Entry<String, Person> o : map.entrySet()) {
            if (o.getKey() == SEARCH_ELEMENT) {
                mails.add(o.getValue().getMail());
            }
        }
        System.out.println(mails);
        return mails;
}

    protected static ArrayList<String> searchPhone(HashMap<String, Person> map) {
        ArrayList<String> phones = new ArrayList<>();

        for (HashMap.Entry<String, Person> o : map.entrySet()) {
             if (o.getKey() == SEARCH_ELEMENT) {
                phones.add(o.getValue().getPhone());
            }
        }
        System.out.println(phones);
        return phones;
    }
}
