
public class FactoryProducer {
	public static AbstractFactory getFactory(String Department)
	{
		if(Department.equalsIgnoreCase("cs"))
		{
			return new CS_MemberFactory();
		}
		else if(Department.equalsIgnoreCase("is"))
		{
			return new IS_MemberFactory();
		}
		else if(Department.equalsIgnoreCase("it"))
		{
			return new IT_MemberFactory();
		}
		else 
			return null;
	}

}
