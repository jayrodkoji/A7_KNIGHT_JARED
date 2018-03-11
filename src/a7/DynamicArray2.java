package a7;

// A more efficient version of the DynamicArray class than the one created in lecture.
//
// Represents the dynamic array [data[0], data[1], ..., data[virtualArrayLength-1]]
// In other words, the first virtualArrayLength elements of data are elements of the 
// dynamic array. The remainder of data is room to grow.  When data fills 
// up, we allocate a new array that is twice as long. 
public class DynamicArray2 {

	private String[] data;   // the backing array
	private int virtualArrayLength; // the number of elements in the dynamic array
	
	/**
	 * Creates an empty dynamic array with room to grow.
	 * (DO NOT modify this method.)
	 */
	public DynamicArray2() {
		// Start with a few available spaces.
		data = new String[8];
		// But the virtual array is empty.
		virtualArrayLength = 0;
	}
	
	/**
	 * Returns the number of elements in the dynamic array.
	 * 
	 * @return the number of elements
	 */
	public int size() {
		return virtualArrayLength;
	}
	
	// Appends s to the end of the dynamic array at index this.size().
	public void add(String s) {
		// FILL IN
		add(this.size(), s);
		// HINT: Call the other add method.
	}
	
	// Throws an IndexOutOfBoundsException if i is not a valid index
	// for adding to the dynamic array, otherwise inserts s at index i.
	// Elements can be added from index 0 to this.size().
	public void add(int i, String s) {	
		// FILL IN
	    if(i < 0)
            throw new IndexOutOfBoundsException();
	    
	    // Fill data array
	    if(virtualArrayLength < data.length) {
	        for(int j = data.length -1; j > i; j--) {
	            data[j] = data[j - 1];
	        }
	        
	        data[i] = s;
	            
	    }
	    
	    String[] newData = new String[data.length];
		// If there is no room for s in data, create a new array 
		// that is twice as long as data. Copy the contents of data 
		// over to this new array. Set data (the reference to the 
		// backing array) to this new array.
		if(virtualArrayLength == data.length || virtualArrayLength == newData.length) {
		     newData = new String[virtualArrayLength * 2];
		}
		// Shift the items in data at indexes starting at i up by one,
		// to make room for s at index i.
		// HINT: Try this on paper first
		
		for(int j = 0; j < i; j++) {
            newData[j] = data[j];
        }
		
		for(int j = i + 1; j < data.length; j++) {
            newData[j] = data[j - 1];
        }
		// Add s at index i.
		newData[i] = s;
		// Update virtualArrayLength.
		virtualArrayLength += 1;
		// (DO NOT create a new array each time this method is called.
		//  Do so ONLY when the capacity of data in the backing store is exceeded, 
		//  which will happen infrequently.)
	}
	
	// Throws an IndexOutOfBoundsException if i is not a valid index
	// of the dynamic array, otherwise removes the element at index i
	// and shifts the elements after i down one to fill in the gap.
	public void remove(int i) {	
		// FILL IN
		
		// DO NOT create a new array anywhere in this method.
		// Instead, shift the items in data from indexes i+1 on 
		// down by one, to overwrite the "removed" string at index i.
	}
	
	// Throws an IndexOutOfBoundsException if i is not a valid index
	// of the dynamic array, otherwise returns the element at index i
	public String get(int i) {
		// FILL IN
		
		// DO NOT return null (unless that is the value of the element). 
		// The following statement is a temporary 
		// placeholder to prevent a compiler error.  Remove when you 
		// implement this method.
		return null;
	}
	
	// Throws an IndexOutOfBoundsException if i is not a valid index
	// of the dynamic array, otherwise replaces the element at index i 
	// with s
	public void set(int i, String s) {
		// FILL IN
	}
	
	/**
	 * Returns a formatted string version of this dynamic array.
	 * 
	 * @return the formatted string
	 */
	public String toString() {
		String result = "[";
		if(size() > 0) 
			result += get(0);
		
		for(int i = 1; i < size(); i++) 
			result += ", " + get(i);
		
		return result + "] backing size: " + data.length;
	}
}
