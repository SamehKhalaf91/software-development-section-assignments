
public class memberFactory {

	public Staff getJob (String JobName)
	{
		String s=JobName.toLowerCase();
		if(s=="doctor")
		{return new Doctor(); }
		else
		{return new TeachingAssistant(); }
	}
}
