
public class IS_MemberFactory extends AbstractFactory {
	Staff getJob(String JobName) {
		if(JobName.equalsIgnoreCase("doctor"))
		{return new IS_Doctor();}
		else if(JobName.equalsIgnoreCase("teaching assistant"))
		{return new IS_TeachingAssistant();}
		else
			return null;
	}


}
