package river.animal;


public class Animal implements Comparable<Animal>{

	private int value;
	private String name;
	public Animal(int value,String name)
	{
		this.value=value;
		this.name=name;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	@Override
	public int compareTo(Animal o) {
		// TODO Auto-generated method stub
		
		if(o==null)
		{
			return 1;
		}
		else	if(value>o.value)
		{
			return 1;
		}
		else if(this.value<o.value)
		{
			return -1;
		}
		else
		{
			return 0;
		}
	}
	
	


}
