public class Queue extends DynamicArray implements Comparable<Queue>, Xifo<String>, Fifo<String> {

     public void add(String e) { //
        super.add(e); //Appends the element at the end using DynamicArray logic
    } // method add

    /**
     * Returns the front element of the queue without removing it.
     * Implements the Xifo interface.
     */
    public String peek() { //
        if (this.size() == 0) return null; //Handles empty queue
        return this.get(0); //Returns the front element (first inserted)
    } // method peek

    /**
     * Removes and returns the front element of the queue.
     * Implements the Xifo interface.
     */
    public String pop() { //
        if (this.size() == 0) return null; //Handles empty queue
        return this.remove(0); //Removes and returns the front item
    } // method pop

    /**
     * Converts the contents of the queue to a readable string.
     * Uses Arrays.toString to match allowed import usage.
     */
    public String toString() { //
        String[] elements = new String[this.size()]; // Temporary array to hold current items
        for (int i = 0; i < this.size(); i++) { //
            elements[i] = this.get(i); //Copy elements from DynamicArray
        } //
        return java.util.Arrays.toString(elements); // Use allowed Arrays.toString
    } // method toString

    /**
     * Compares this queue to another queue based on their size (occupancy).
     * Implements the Comparable interface.
     */
    public int compareTo(Queue other) { //MODIFIED
        return this.size() - other.size(); // Natural ordering based on number of elements
    } // method compareTo

} // class Queue