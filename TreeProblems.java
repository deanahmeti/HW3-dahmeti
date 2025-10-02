/*
 * *** Dean Ahmeti / COMP 272 - 002 ***
 *
 * This java file contains several simple tree problems that need to be
 * codified. These routines  must use the TreeMap and TreeSet library
 * classes from the Java Collection Framework.
 *
 */

import java.util.*;

public class TreeProblems {

  /**
   * Method different()
   *
   * Given two TreeSets of integers, return a TreeSet containing all elements 
   * that are NOT in both sets. In other words, return a TreeSet of all the
   * elements that are in one set but not the other.
   */
  
  public static Set<Integer> different(Set<Integer> setA, Set<Integer> setB) {

    // INSERT CODE HERE - DO NOT FORGET TO PLACE YOUR NAME ABOVE
    //
    // This can be done numerous ways, but once such will only that
    // *several* lines of code. Hint: create two temporary TreeSets and utilize the
    // methods retainAll(), addAll(), and removeAll(). But in the end, get something to work.

    return setA;
  }


  /**
   * Method removeEven()
   *
   * Given a treeMap with the key as an integer, and the value as a String,
   * remove all <key, value> pairs where the key is even. 
   */

  public static void removeEven(Map<Integer, String> treeMap) {

    // INSERT CODE HERE.

    return;
  }


  /**
   * Method treesEqual()
   *
   * Given two treeMaps, each with the key as an integer, and the value as a String,
   * return a boolean value indicating if the two trees are equal or not.
   */

  public boolean treesEqual(Map<Integer, String> tree1,Map<Integer, String> tree2 ) {

    // INSERT CODE HERE

    Set<Integer> setA = new TreeSet<>(Arrays.asList(1, 2, 3, 4));
        Set<Integer> setB = new TreeSet<>(Arrays.asList(3, 4, 5, 6));
        System.out.println(TreeProblems.different(setA, setB));  

      
        Map<Integer, String> map = new TreeMap<>();
        map.put(1, "one");
        map.put(2, "two");
        map.put(3, "three");
        map.put(4, "four");
        TreeProblems.removeEven(map);
        System.out.println(map); // Should show keys 1 and 3 only

        
        Map<Integer, String> tree1 = new TreeMap<>();
        tree1.put(1, "A");
        tree1.put(2, "B");

        Map<Integer, String> tree2 = new TreeMap<>();
        tree2.put(1, "A");
        tree2.put(2, "B");

        Map<Integer, String> tree3 = new TreeMap<>();
        tree3.put(1, "A");
        tree3.put(2, "C");

        TreeProblems tp = new TreeProblems();
        System.out.println(tp.treesEqual(tree1, tree2)); // true
        System.out.println(tp.treesEqual(tree1, tree3)); // false

    return false;

  }

} // end treeProblems class
