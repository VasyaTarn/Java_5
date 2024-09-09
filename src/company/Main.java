package company;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>();

        String[] strArr = {"str1", "str2", "str3"};

        list1.addAll(List.of(strArr));

        List<String> list2 = new ArrayList<>(list1);

        List<String> list3 = Arrays.asList("str1", "str2", "str3");

        list2.addAll(list3.size() / 2, list3);

        list2.sort(Collections.reverseOrder());

        ListIterator<String> iterator = list2.listIterator();

        boolean removeFlag = false;

        while (iterator.hasNext()) {
            iterator.next();

            if (removeFlag) {
                iterator.remove();
            }

            removeFlag = !removeFlag;
        }

        Set<String> set1 = new HashSet<>();

        set1.add("Add1");
        set1.add("Add2");

        set1.addAll(list1);
        set1.addAll(list2);

        System.out.println(set1);

        Set<String> set2 = new LinkedHashSet<>();

        set2.addAll(list2);
        set2.addAll(list3);

        System.out.println(set2);

        Map<Integer, String> map1 = new LinkedHashMap<>();

        map1.put(0, "Январь");
        map1.put(1, "Февраль");
        map1.put(2, "Март");
        map1.put(3, "Апрель");
        map1.put(4, "Май");
        map1.put(5, "Июнь");
        map1.put(6, "Июль");
        map1.put(7, "Август");
        map1.put(8, "Сентябрь");
        map1.put(9, "Октябрь");
        map1.put(10, "Ноябрь");
        map1.put(11, "Декабрь");

        System.out.println("First month of the year: " + map1.get(0));
        System.out.println("Last month of the year: " + map1.get(11));

        map1.put(6, "ОТПУСК");
        System.out.println("After 6th month replacement: " + map1.get(6));

        Map<Integer, String> map2 = new HashMap<>();

        map2.putAll(map1);

        printMap(map1);
        printMap(map2);

        HashMap<String, Set<String>> map3 = new HashMap<>();

        Set<String> contacts1 = new HashSet<>();
        contacts1.add("111-111-111");
        contacts1.add("student1@gmail.com");
        contacts1.add("student1_skype");

        Set<String> contacts2 = new HashSet<>();
        contacts2.add("222-222-222");
        contacts2.add("student2@gmail.com");
        contacts2.add("student2_skype");

        map3.put("name1", contacts1);
        map3.put("name2", contacts2);

        for (Map.Entry<String, Set<String>> entry : map3.entrySet()) {
            System.out.println("Student: " + entry.getKey());
            System.out.println("Contacts: " + entry.getValue());
        }


        Set<User> userSet = new HashSet<>();

        User user1 = new User("Name", 25, "123");
        User user2 = new User("Name", 25, "123");
        User user3 = new User("Name", 30, "123");

        userSet.add(user1);
        userSet.add(user2);
        userSet.add(user3);

        printUsers(userSet);

        System.out.println();

        userSet.clear();

        userSet.add(user1);
        userSet.add(user2);
        userSet.add(user3);

        printUsers(userSet);
    }

    public static void printMap(Map<Integer, String> map) {
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
    }

    private static void printUsers(Set<User> userSet) {
        for (User user : userSet) {
            System.out.println(user);
        }
    }
}