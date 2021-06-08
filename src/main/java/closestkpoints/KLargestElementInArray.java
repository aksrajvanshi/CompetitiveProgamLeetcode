/**
 * Given an integer array nums and an integer k, return the kth largest element in the array.
 *
 * <p>Note that it is the kth largest element in the sorted order, not the kth distinct element.
 */
package closestkpoints;

import java.util.PriorityQueue;

public class KLargestElementInArray {

    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue();
        for (int i : nums) {

            pq.offer(i);

            if (pq.size() > k) {
                pq.poll();
            }
        }
        return pq.peek();
    }

}
