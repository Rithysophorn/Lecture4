//Rithy Sophorn
//Date: 4/12/2022
//Class: BIT 143

class Lecture04 {

    public static void main(String[] args) {
        System.out.println("Hello from lecture 04");

        // SELF-CHECK PROBLEMS:
        // Note: you may need to put some of your answers inside comments

        // 1. When should you use a LinkedList instead of an ArrayList?

        //Linkedlist is much easier and faster when it comes to add or remove a new object that is over the capacity of the list since it's a reference point towards each one. For an ArrayList, we would have to create a new ArrayList if we were to change from a list of 4 to a list of 5.

        // 2. Would a LinkedList or an ArrayList perform better when run on the
        // following code? Why?
        // public static int min(List<Integer> list) {
        // int min = list.get(0);
        // for (int i = 1; i < list.size(); i++) {
        // if (list.get(i) < min) {
        // min = list.get(i);
        // }
        // }
        // return min;
        // }

        //An ArrayList would be faster in this code because an ArrayList perform faster when it comes to get an object from the list. The LinkedList would have to starts from the first value towards to end to find the value in th list, while the ArrayList can just get right to it. 

        // 3. What is an iterator? Why are iterators often used with linked lists?

        //An iterator is an object that used to loop through the collections. We used an iterators often with linkedList because we want more functionally than the standard iterator interface provided. It has a "link" between the two elements in ths list.

        // 4. Write a piece of code that counts the number of duplicate elements in a
        // linked list.
        // That is, the number of elements whose values are repeated at an earlier index
        // in the list. Assume that all duplicates in the list occur consecutively. For
        // example, the list [1, 1, 3, 5, 5, 5, 5, 7, 7, 11] contains five duplicates:
        // one duplicate of element value 1, three duplicates of element value 5, and
        // one duplicate of element value 7.

        /*
        public class countDuplicate {
            public static class numb {
                int object;
                numb Next;
            }
            public static numb input (numb head, int value) {
                numb temp = new numb();
                temp.object = value;
                temp.Next = head;
                return head;
            }

            public static int CountNumb(numb head) {
                int count = 0;
                while (head.Next != null) {
                    numb dub = head.Next;
                    while (dub != null) {
                        if (head.object == dub.object) {
                            count++;
                            break;
                        } 
                        dub = dub.Next;
                    }
                    head = head.Next;
                }
                return count;
            }
            public static void main (String [] args) {
                numb Head =  null;
                Head = input (Head, 1);
                Head = input (Head, 1);
                Head = input (Head, 3);
                Head = input (Head, 5);
                Head = input (Head, 5);
                Head = input (Head, 5);
                Head = input (Head, 5);
                Head = input (Head, 7);
                Head = input (Head, 7);
                Head = input (Head, 11);

                System.out.println(CountNumb(Head));

            }
        }   
        */

        // 5. Write a piece of code that inserts a String into an ordered linked list of
        // Strings, maintaining sorted order.
        // For example, for the list ["Alpha", "Baker", "Foxtrot", "Tango", "Whiskey"],
        // inserting "Charlie" in order would produce the list ["Alpha", "Baker",
        // "Charlie", "Foxtrot", "Tango", "Whiskey"].

        /*
        import java.util.*;

        public class insertString {
            public static void main (String [] args) {
                LinkedList <String> name = new LinkedList <> ();
                name.add("Alpha");
                name.add("Baker");
                name.add("Foxtrot");
                name.add("Tango");
                name.add("Whiskey");
                System.out.println("Before added: " + name);

                name.add(2, "Charlie");
                System.out.println("After added: " + name);

            }
        }
        */

        // From Section 11.2: Sets
        // 10. A List has every method that a Set has, and more. So why would you use a
        // Set rather than a List?

        //A set is an unordered collection and it doesn't allow duplicate elements, while a list is an order collection and it allows duplicate elements. We use a set because we want to printout without duplicate. 

        // 11. When should you use a TreeSet, and when should you use a HashSet?

        //HashSet use equal() method to compare and it will return true, while TreeSet use compareTo() method to compare that will return zero 

        // 12. A Set doesn’t have the get and set methods that an ArrayList has. How do
        // you examine every element of a Set?

        //To examine every element of a Set is by using contain() method to check whether or not an element is in the Set. 

        // 13. What elements are contained in the following set after this code
        // executes?

        // Set<Integer> set = new HashSet<>();
        // set.add(74);
        // set.add(12);
        // set.add(74);
        // set.add(74);
        // set.add(43);
        // set.remove(74);
        // set.remove(999);
        // set.remove(43);
        // set.add(32);
        // set.add(12);
        // set.add(9);
        // set.add(999);

        //Output:
        //32,999,9,12

        // 14. How do you perform a union operation on two sets? An intersection? Try to
        // give an answer that doesn’t require any loops.

        //s1.add(s2); - union of s1 and s2 will stored in s1
        //s1.retainAll(s2); - intersection of s1 and s2 will stored in s1

        // 15. Write the output produced when the following method is passed each of the
        // following lists:

        // public static void mystery(List<String> list) {
        // Set<String> result = new TreeSet<>();
        // for (String element : list) {
        // if (element.compareTo(list.get(0)) < 0) {
        // result.add(element);
        // } else {
        // result.clear();
        // }
        // }
        // System.out.println(result);
        // }
        // [marty, stuart, helene, jessica, amanda]
        // [sara, caitlin, janette, zack, riley]
        // [zorah, alex, tyler, roy, roy, charlie, phil, charlie, tyler]

        //Outpu:

        //amanda, helene, jessica
        //riley
        //alex, charlie

        // Exercises:
        // 2. Write a method called alternate that accepts two Lists as its parameters
        // and returns a new List containing alternating elements from the two lists, in
        // the following order:

        // First element from first list
        // First element from second list
        // Second element from first list
        // Second element from second list
        // Third element from first list
        // Third element from second list
        // . . .
        // If the lists do not contain the same number of elements, the remaining
        // elements from the longer list should be placed consecutively at the end. For
        // example, for a first list of [1, 2, 3, 4, 5] and a second list of [6, 7, 8,
        // 9, 10, 11, 12], a call of alternate(list1, list2) should return a list
        // containing [1, 6, 2, 7, 3, 8, 4, 9, 5, 10, 11, 12].

        /*
        import java.util.Arrays;
        import java.util.ArrayList;
        import java.util.Iterator;
        public class TwoLists {
            public static void main (String [] args) {
                Integer array1[] = {1,2,3,4,5};
                ArrayList <Integer> list1 = new ArrayList <Integer> (Arrays.asList(array1));
                System.out.println("List 1 is: " + list1);
                Integer array2[] = {6,7,8,9,10,11,12};
                ArrayList <Integer> list2 = new ArrayList <Integer> (Arrays.asList(array2));
                System.out.println("List 1 is: " + list2);

                ArrayList <Integer> alternateList = alternate (list1, list2);
                System.out.println("Alternate List is: " + alternateList);
            }
            //This method is to create an alternate list from list1 and list2 in the main class
            public static ArrayList <Integer> alternate(ArrayList <Integer> list1, ArrayList <Integer> list2) {
                ArrayList <Integer> result = new ArrayList <Integer> ();
                Iterator <Integer> i1 = list1.iterator();
                Iterator <Integer> i2 = list2.iterator();
                
                while (i1.hasNext() || i2.hasNext()) {
                    if(i1.hasNext()) {
                        result.add(i1.next());
                    }
                    if(i2.hasNext()) {
                        result.add(i2.next());
                    }
                }
                return result;
            }
        }
        */

        // 9. Write a method hasOdd that accepts a set of integers as a parameter and
        // returns true if the set contains at least one odd integer and false
        // otherwise.
        // If passed the empty set, your method should return false.

        /*
        import java.util.*;
        public class Odd {
            //Check whether it has an odd or not. Return false if no odd
            public static boolean hasOdd (Set <Integer> set) {
                if(set.isEmpty()) {
                    return false;
                }
                for (Integer i: set) {
                    if((i % 2) != 0) {
                        return true;
                    }
                }
                return false;
            }
            public static void main (String [] args){
                int list [] = {2,4,6,1,10};
                Set <Integer> set = new HashSet <Integer> ();
                for (int i=0; i<5; i++){
                    set.add(list[i]);
                }
                System.out.println("Set List: " + set);
                System.out.println("True if there's an odd integer otherwise False: "+ hasOdd(set));
            }
        }
        */
    }
}
