

public class BoxedItem implements Sellable, Transportable {
	private String descript;
	private int price; 
	private int weight;
	private boolean haz;
	private int height = 0;
	private int width = 0;
	private int depth = 0;
	
	public BoxedItem(String desc, int p, int w, boolean h) {
		descript = desc;
		price = p;
		weight = w;
		haz = h;
	}

	public int weight() {
		// TODO Auto-generated method stub
		return weight;
	}

	@Override
	public boolean isHazardous() {
		// TODO Auto-generated method stub
		return haz;
	}

	@Override
	public String description() {
		// TODO Auto-generated method stub
		return descript;
	}

	@Override
	public int listPrice() {
		// TODO Auto-generated method stub
		return price;
	}

	@Override
	public int lowestPrice() {
		// TODO Auto-generated method stub
		return price / 2;
	}
	
	public void setBox(int h, int w, int d) {
		height = h;
		width = w;
		depth = d;
	}

	public int getDepth() {
		return depth;
	}

	public void setDepth(int depth) {
		this.depth = depth;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

}
