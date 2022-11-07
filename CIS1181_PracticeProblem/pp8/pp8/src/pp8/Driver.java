/*Todd J Myers
 * 07/10/20
 * practice problem 8 
 * priority queue
 */

package pp8;

import java.util.Comparator;
import java.util.PriorityQueue;

public class Driver 
{
    public static void main(String[] args)
    {
        // A comparator that compares two Strings by length.
        Comparator<String> stringComparator = new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return s1.length() - s2.length();
            }
        };

        // Creates a Priority Queue with Comparator
        PriorityQueue<String> namePQ = new PriorityQueue<>(stringComparator);

        // Add items to a Priority Queue
        namePQ.add("apple");
        namePQ.add("banana");
        namePQ.add("cantaloupe");
        namePQ.add("date");
        namePQ.add("eggplant");
        namePQ.add("fig");

        // Removes items from the Priority Queue 
        while (!namePQ.isEmpty()) {
            System.out.println(namePQ.remove());
        }
    }
}