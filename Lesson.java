public class Lesson {
    public static void main(String[] args) {
                // GUI
        // String name = JOptionPane.showInputDialog("Enter your name.");
        // JOptionPane.showMessageDialog(null, "Hello " + name);
        // int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age."));
        // JOptionPane.showMessageDialog(null, "You are " + age + " years old");
        // double height = Double.parseDouble(JOptionPane.showInputDialog("Enter your height."));
        // JOptionPane.showMessageDialog(null, "Your height is " + height + " cm");

        // ARRAYS
        // String[] cars = new String[3];
        // cars[0] = "Mustang";
        // cars[1] = "Corvette";
        // cars[2] = "BMW";
        // System.out.println(cars[0]);
        // System.out.println(Arrays.toString(cars));

        // STRING METHODS
        // String name = "Bro";
        // boolean result = name.equals("Bro");
        // boolean resultIgnoreCase = name.equalsIgnoreCase("bro");
        // int result = name.length();
        // char result = name.charAt(2);
        // int result = name.indexOf("B");
        // boolean result = name.isEmpty();
        // String result = name.toUpperCase();
        // String result = name.trim();
        // String result = name.replace('o', 'a');
        // String[] result = name.split("");
        // System.out.println(Arrays.toString(result));
        
        // WRAPPER CLASSES
        // wrapper class = provides a way to use primitive data types as reference data types
        //                 reference data types contain useful methods
        //                 can be used with collections  (ex. ArrayList)
        // primitive | wrapper
        // ----------|---------
        // boolean   | Boolean
        // char      | Character
        // int       | Integer
        // double    | Double
        // autoboxing  = the automatic conversion that Java compiler makes between the primitive types
        //               and their corresponding object wrapper classes
        // unboxing    = the reverse of autoboxing. Automatic conversion of wrapper class to primitive
        // Boolean a = true;
        // Character b = '@';
        // Integer c = 123;
        // Double d = 3.14;
        // String e = "Bro";
    
        // ARRAYLIST
        // ArrayList = a resizable array.
        //             Elements can be added and removed after compilation phase
        //             store reference data types
        // ArrayList<String> foods = new ArrayList<String>();
        // foods.add("Pizza");
        // foods.add("Hamburger");
        // foods.add("Hotdog");
        // foods.set(0, "Sushi");
        // foods.remove(2);
        // foods.clear();
        // for (int i = 0; i < foods.size(); i++) {
        //     System.out.println(foods.get(i));
        // }
    
        // 2D ARRAYLIST
        // ArrayList<ArrayList<String>> groceryList = new ArrayList<>();
        // ArrayList<String> bakeryList = new ArrayList<>();
        // bakeryList.add("Pasta");
        // bakeryList.add("Garlic Bread");
        // bakeryList.add("Donuts");
        // ArrayList<String> produceList = new ArrayList<>();
        // bakeryList.add("Tomatoes");
        // bakeryList.add("Zuccchini");
        // bakeryList.add("Pepper");
        // ArrayList<String> drinksList = new ArrayList<>();
        // drinksList.add("Soda");
        // drinksList.add("Coffee");
        // groceryList.add(bakeryList);
        // groceryList.add(produceList);
        // groceryList.add(drinksList);
        // System.out.println(groceryList.get(0).get(0));

        // METHODS
        // method = block of code that is executed whenever it is called upon
        // hello();

        // printf()
        // printf() = an optional method to control, format, and display text values to the console window
        //            two arguments = format string + (object/variable/value)
        //            % [flags] [precision] [width] [conversion-character]

        // boolean myBoolean = true;
        // char myChar = 'a';
        // String myString = "Bro";
        // int myInteger = 50;
        // double myDouble = 1000;

        // [conversion-character]
        // System.out.printf("%b", myBoolean);
        // System.out.printf("%c", myChar);
        // System.out.printf("%s", myString);
        // System.out.printf("%d", myInteger); // integer  - d
        // System.out.printf("%f", myDouble); // double    - f

        // [width]
        // System.out.printf("Hello %-10s %d\n", myString, myInteger);

        // [precision]
        // System.out.printf("You have this much money %.5f", myDouble);

        // [flags]
        // adds an effect to output based on the flag added to format specifier
        // System.out.printf("You have this much money | %.1f", myDouble);
        
    }
}
