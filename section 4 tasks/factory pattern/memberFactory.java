
public class memberFactory {

	public Staff getJob (String JobName)
	{
		String s=JobName.toLowerCase();
		if(s=="doctor")
		{return new Doctor(); }
		else if (s=="teaching assestant")
		{return new TeachingAssistant(); }
		else
			return null;
		
	}
}
