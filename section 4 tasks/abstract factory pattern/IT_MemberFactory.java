
public class IT_MemberFactory extends AbstractFactory{
	Staff getJob(String JobName) {
		if(JobName.equalsIgnoreCase("doctor"))
		{return new IT_Doctor();}
		else if(JobName.equalsIgnoreCase("teaching assistant"))
		{return new IT_TeachingAssistant();}
		else
			return null;
	}


}
