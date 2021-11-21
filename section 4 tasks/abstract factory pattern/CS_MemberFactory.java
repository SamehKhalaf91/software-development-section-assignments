
public class CS_MemberFactory extends AbstractFactory{
	Staff getJob(String JobName) {
		if(JobName.equalsIgnoreCase("doctor"))
		{return new CS_Doctor();}
		else if(JobName.equalsIgnoreCase("teaching assistant"))
		{return new CS_TeachingAssistant();}
		else
			return null;
	}

}
