

/** Interface for objects that can be sold. */
public interface Sellable {
	
	/** Description of the object. */
	public String description();
	
	/** List price in cents. */
	
	public int listPrice();
	
	/** Lowest price in cents we will accept */
	public int lowestPrice();
}
