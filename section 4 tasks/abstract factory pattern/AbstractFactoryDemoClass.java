
public class AbstractFactoryDemoClass {

	public static void main(String[] args) {
		AbstractFactory memberFactory_1 = FactoryProducer.getFactory("IS");
		Staff staff_1 = memberFactory_1.getJob("doctor");
		staff_1.GetSalary();
		staff_1.getYearsOfWork();
		Staff staff_2 = memberFactory_1.getJob("teaching assistant");
		staff_2.GetSalary();
		staff_2.getYearsOfWork();
		AbstractFactory memberFactory_2 = FactoryProducer.getFactory("CS");
		Staff staff_3 = memberFactory_2.getJob("doctor");
		staff_3.GetSalary();
		staff_3.getYearsOfWork();
		Staff staff_4 = memberFactory_1.getJob("teaching assistant");
		staff_4.GetSalary();
		staff_4.getYearsOfWork();
		AbstractFactory memberFactory_3 = FactoryProducer.getFactory("IT");
		Staff staff_5 = memberFactory_3.getJob("doctor");
		staff_5.GetSalary();
		staff_5.getYearsOfWork();
		Staff staff_6 = memberFactory_1.getJob("teaching assistant");
		staff_6.GetSalary();
		staff_6.getYearsOfWork();


	}

}
