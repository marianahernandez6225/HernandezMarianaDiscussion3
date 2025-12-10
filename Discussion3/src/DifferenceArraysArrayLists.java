import java.util.ArrayList;

public class DifferenceArraysArrayLists {

    public static void main(String[] args) {

        // ================================
        // 1. Arrays (these don’t change size)
        // ================================
        // Arrays are basically “set it and forget it.”
        // Once I pick a size, that’s it. No adding extra spots later.
        int[] scoresArray = new int[5];

        // Filling in each position manually.
        scoresArray[0] = 90;
        scoresArray[1] = 85;
        scoresArray[2] = 78;
        scoresArray[3] = 88;
        scoresArray[4] = 92;

        System.out.println("=== ARRAY EXAMPLE ===");
        System.out.println("Array length: " + scoresArray.length);

        System.out.print("Array values: ");
        for (int i = 0; i < scoresArray.length; i++) {
            System.out.print(scoresArray[i] + " ");
        }
        System.out.println();
        System.out.println("Arrays are great when I already know how many values I need.\n");


        // ================================
        // 2. ArrayLists (way more flexible)
        // ================================
        // ArrayLists let me add and remove items whenever I want.
        // No fixed size, no stress.
        ArrayList<Integer> scoresList = new ArrayList<>();

        // Adding values
        scoresList.add(90);
        scoresList.add(85);
        scoresList.add(78);
        scoresList.add(88);
        scoresList.add(92);

        // Adding an extra value just to show how easy it is.
        scoresList.add(100);

        System.out.println("=== ARRAYLIST EXAMPLE ===");
        System.out.println("ArrayList size: " + scoresList.size());

        System.out.print("ArrayList values: ");
        for (int i = 0; i < scoresList.size(); i++) {
            System.out.print(scoresList.get(i) + " ");
        }
        System.out.println();

        // Removing something is super simple with an ArrayList
        scoresList.remove(Integer.valueOf(78));
        System.out.println("ArrayList after removing 78: " + scoresList + "\n");


        // ================================
        // 3. Syntax Differences
        // ================================
        System.out.println("=== SYNTAX DIFFERENCES ===");

        // Arrays use brackets [] and are more “manual.”
        String[] namesArray = {"Alice", "Bob", "Charlie"};
        System.out.println("From array -> namesArray[1]: " + namesArray[1]);

        // ArrayLists use <Type> and methods like add(), get(), and remove().
        ArrayList<String> namesList = new ArrayList<>();
        namesList.add("Alice");
        namesList.add("Bob");
        namesList.add("Charlie");
        System.out.println("From ArrayList -> namesList.get(1): " + namesList.get(1));

        // Arrays can store primitive values directly.
        int[] numberArray = {1, 2, 3};
        System.out.println("Primitive array example: " + numberArray[0]);

        // ArrayLists need wrapper classes, but Java handles that for me.
        ArrayList<Integer> numberList = new ArrayList<>();
        numberList.add(1);
        numberList.add(2);
        numberList.add(3);
        System.out.println("ArrayList<Integer> example: " + numberList.get(0));

        System.out.println();
        System.out.println("Summary:");
        System.out.println("Arrays stay the same size and are good when everything is predictable.");
        System.out.println("ArrayLists let me add, remove, and adjust as I go, which makes them easier to work with.");
    }
}
