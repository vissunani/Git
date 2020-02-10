package second;

public class Sweets implements Features{
	
	
	int weight;
	int sweetness;
	int cost;
	String name;
	
	public void namethem(int weight,int sweetness,int cost,String name)
	{
		this.weight=weight;
		this.sweetness=sweetness;
		this.cost=cost;
		this.name=name;
	}
	
	
	
	public int showsugar()
	{
		return sweetness;
	}

}
