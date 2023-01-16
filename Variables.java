// Java Variables 
/*  Variables are containers for storing data values
        • String - stores text . 
        • int - stores integers . 
        • float - stores floating point numbers . 
        • char - stores single characters . 
        • booelean - stores values true or false . 
 */

public class Variables {
    public static void main(String[] args) {
        // Declaring Variables
        String name = "Rajkiran";
        int age = 21;
        float salary = 19.2f;
        char ch = 'a';
        // Final Variables -> these variables are constant and cannot be changed.
        final int myNum = 15;
        // myNum = 20; // showig error
        System.out.println(name);
        // to combine both text and a variable , we use + character.
        // but of integer + operator works as additon
        System.out.println("My age is " + age);
        System.out.println(salary);
        System.out.println(ch);

    }
}
