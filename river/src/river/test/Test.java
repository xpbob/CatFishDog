package river.test;
import river.animal.*;
public class Test {
	
	public static void main(String[] args)
	{
	Animal a[]={new Animal(0,"��"),new Animal(1,"è"),new Animal(2,"��")};
	
	Go go=new Go();
	go.run(a);
	}

}
