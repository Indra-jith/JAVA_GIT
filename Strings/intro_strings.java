public class intro_strings {
  public static void main(String[] args) {

    String s1 = new String("World");
    System.out.println(s1); // this also works actually
    // Spoiler Alert -> String is a class
    // Java : "Chill, You don't have to create an object just do this"
    String name = "Hello";
    System.out.println(name);
    System.out.println(s1 + " World");

    // NOTE
    /*
     * Mutable -> can be changed
     * Immutable -> cannot be changed
     */

    // String firstName = "Hello";
    // String lastName = "World";
    // System.out.println(firstName + lastName);
    // BEHIND THE SCENES
    // "World" is not appended where Hello was there
    /*
     * STRINGS ARE IMMUTABLE! IT CANNOT BE CHANGED
     * HELLO IS HELLO! WORLD IS WORLD! NOBODY GETS ATTATCHED WITH ANYONE
     * Also, There is a String constant pool and if a string is not there in pool
     * It gets added (does not get added if it's already there)
     */

    String firstName = "Hello";
    String lastName = "Hello";
    // Second hello won't be created since Hello is already there in the pool
    System.out.println(firstName == lastName); // true

    /*
     * Summary
     * In java, strings are an object that represents sequence of char values
     * Strings in Java is immutable (cannot be changed)
     * Whenever we create a string, The JVM checks the "String Constant pool"
     * If the string already exists in the pool, a reference to the pooled
     * instance is returned
     * If the string doesn't exist in the pool, a new strring instance is created
     * and
     * placed inside the pool
     * This makes java "MEMORY EFFICIENT", because no new objects are created if it
     * already exists in the String Constant Pool
     */

  }
}
