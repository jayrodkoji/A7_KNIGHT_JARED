package a7;

// A StringSet is a collection of non-null strings, with no duplicates
// (i.e., no two elements may be equal).  
public class StringSet {
      
    // Creates an empty StringSet object
    public StringSet() {
    	// FILL IN
    }
    
    // Throws an IllegalArgumentException if e is null, otherwise adds
    // e to the set if there is not already an element in the set equal
    // to e
    public void insert(String e) {
    	// FILL IN
    }
    
    // Throws an IllegalArgumentException if e is null, otherwise
    // indicates whether the set contains e
    public boolean contains(String e) {
    	// FILL IN
    	
	// DO NOT return false, unless appropriate. The following 
    	// statement is a temporary placeholder to prevent a 
    	// compiler error.  Remove when you implement this method.
        return false;
    }
    
    // Throws an IllegalArgumentException if e is null, otherwise
    // removes e from the set
    public void remove(String e) {
    	// FILL IN
    }
    
    // Returns the number of strings in the set
    public int size() {
    	// FILL IN
    	
	// DO NOT return 0. The following statement is a temporary 
	// placeholder to prevent a compiler error.  Remove when you 
	// implement this method.
        return 0;
    }  
    
    // Computes and returns the union of the StringSet that calls this method and the 
    // StringSet argument to the method.
    // The original StringSets should not be changed. The union set contains every 
    // element of each of the original StringSets.
    // Throws an IllegalArgumentException if other is null.
    public StringSet union(StringSet other) {
    	// FILL IN
    	// modify the return to return the union.
    	return new StringSet();
    }

    // Computes and returns the intersection of the StringSet that calls this method 
    // and the StringSet argument to the method.
    // The original StringSets should not be changed. The intersection set contains 
    // only the elements that are in both of the StringSets.
    // Throws an IllegalArgumentException if other is null.
    public StringSet intersection(StringSet other) {
    	// FILL IN
    	// modify the return to return the intersection.
    	return new StringSet();
    }

    // Returns a formatted string version of this set
    // Examples: If set contains "a" and "b", this method should 
    // return the string "{a, b}".  If the set is empty, this 
    // method should return the string "{}".
    public String toString() {
    	// FILL IN
    	
	// DO NOT return null. The following statement is a temporary 
	// placeholder to prevent a compiler error.  Remove when you 
	// implement this method.
    	    return null;
    }
}