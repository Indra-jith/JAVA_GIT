import java.util.ArrayList;

// import java.util.List;
public class arraylist_intro {
    public static void main(String[] args) {
        /*
         * List is an interface and ArrayList comes under it
         * Not only Arraylist but other types such as LinkedList,stacks,vectors
         */
        ArrayList<String> list1 = new ArrayList<>();
        // or do it with lists (parent = new child())
        // List<String> l1 = new ArrayList<>();

        // ArrayList allows us to create resizable/dynamic array

        // ArrayList<int> list2 = new ArrayList<>();
        // when we do ArrayList with primitive data types,
        // error will come to add dimensions
        // string was a class so no issues

        // USE WRAPPER CLASSES FOR PRIMITIVE DATA TYPES
        // example :
        ArrayList<Integer> list2 = new ArrayList<>();

        System.out.println("Original : " + list1);
        list1.add("Mercury");
        list1.add("Venus");
        list1.add("Earth");
        list1.add("Mars");

        System.out.println("Modified : " + list1); // [Mercury, Venus, Earth, Mars]

        // accessing the elements (.get)
        System.out.println("Element at 0th index : " + list1.get(0));

        // changing the elements (.set)
        list1.set(0, "mercuryv2");
        System.out.println("Modified : " + list1);
        System.out.println("Element at 0th index after using set: " + list1.get(0));

        // deleting elements from the list (.remove)
        list1.remove(0); // removes first element
        list1.remove("Earth");
        System.out.println("Modified after deleting the elements : " + list1);

        // ArrayList list3 = new ArrayList();
        // // you can choose to not give a type to ArrayList
        // // then you can add multiple data types
        // list3.add("mercury");
        // list3.add(1);
        // System.out.println("without specifying data type : " + list3); // but they
        // will give warning

        // size -> .size()
        System.out.println("ArrayList size : " + list1.size());

        // clone (create a copy) .clone()
        ArrayList<String> list11 = (ArrayList<String>) list1.clone();
        System.out.println("Cloned list : " + list11);

        // checks if an element is there
        System.out.println("List contains Mars : " + list1.contains("Mars"));

        // checks is list is empty
        System.out.println("Is list empty? : " + list1.isEmpty());

        // iterating on list1
        for (String st : list1) {
            System.out.println(st);
        }
    }
}
