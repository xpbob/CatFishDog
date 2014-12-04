package river.animal;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;


public class Go {
	public List<Animal> leftList=new LinkedList<>();
	public List<Animal> rightList=new LinkedList<>();
;
	
	public final void run(Animal m[])
	{
			for(int i=0;i<m.length;i++)
			{
				leftList.add(m[i]);
			}
			
			
			Animal a=null;
			Left(a);
			
	}
	
	
	
	private boolean isSafe(List<Animal> list)
	{
		
		
		Animal test[]=list.toArray(new Animal[0]);
		if(test.length==0 || test.length==1)
		{
			return true;
		}
		Arrays.sort(test);
		for(int i=0;i<test.length-1;i++)
		{
			
			for(int j=i+1;j<test.length;j++)
			{
			
				
					if((test[j].getValue()-test[i].getValue())==1)
					{
						return false;
					}
				
				
				
			}
			
			
		}
		return true;
		
	}
	
	public void testLeft(Animal tmp)
	{
		Animal a=null;
		for(int i=0;i<leftList.size();i++)
		{
			
			if(leftList.get(i).equals(tmp))
			{
				continue;
			}
			a=leftList.get(i);
			leftList.remove(i);
			if(isSafe(leftList))
			{
				System.out.println(a.getName()+"被带到河右边");
				Right(a);
				break;
				
			}
			else 
			{
				leftList.add(i, a);
			}
			
		}
	}
	public void testRight(Animal tmp)
	{
		Animal a=null;
		for(int i=0;i<rightList.size();i++)
		{
			
			if(rightList.get(i).equals(tmp))
			{
				continue;
			}
			a=rightList.get(i);
			rightList.remove(i);
			if(isSafe(rightList))
			{
				System.out.println(a.getName()+"被带到河左边");
				Left(a);
				break;
				
			}
			else
			{
				rightList.add(i, a);
			}
			
		}
	}
	private void Left(Animal a) {
		// TODO Auto-generated method stub
	
		if(leftList.size()==0)
		{
			System.out.println("左岸空");
			return;
			
		}
		
		if(a==null)
		{
			testLeft(a);
		}
		else
		{
			leftList.add(a);
			
		
			testLeft(a);
			
		}
		
	}

	private void Right(Animal a) {
		// TODO Auto-generated method stub
		Animal tmp=null;
		
		rightList.add(a);
		if(rightList.size()==3)
		{
			System.out.println("全部过河完毕");
			return ;
		}
		
		if(isSafe(rightList))
		{
			Left(tmp);
		}
		else
		{
			testRight(a);
		}
			
	}
}
