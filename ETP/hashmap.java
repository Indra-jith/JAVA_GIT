import java.util.*;

public class hashmap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedHashMap<Character, Integer> map1 = new LinkedHashMap<>();
        LinkedHashMap<Character, Integer> map2 = new LinkedHashMap<>();
        System.out.println("Enter the first string: ");
        String str1 = scanner.nextLine();
        str1 = str1.toLowerCase();
        System.out.println("Enter the second string: ");
        String str2 = scanner.nextLine();
        str2 = str2.toLowerCase();
        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();
        for (char i : arr1) {
            if (map1.containsKey(i)) {
                int count = map1.get(i);
                map1.put(i, count + 1);
            } else {
                map1.put(i, 1);
            }
        }
        for (char i : arr2) {
            if (map2.containsKey(i)) {
                int count = map2.get(i);
                map2.put(i, count + 1);
            } else {
                map2.put(i, 1);
            }
        }
        Set<Character> kset1 = map1.keySet();
        Set<Character> kset2 = map2.keySet();
        System.out.println(kset1);
        System.out.println(map1);
        // System.out.println(map2);
        for (char i : kset2) {
            System.out.println(i + " : " + map2.get(i));
        }
        if (map1.equals(map2)) {
            System.out.println("It is an anagram");
        } else {
            System.out.println("not an anagram");
        }
    }
}
