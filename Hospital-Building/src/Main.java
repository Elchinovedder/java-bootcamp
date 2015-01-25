
public class Main {

	public static void main(String[] args) {
		
		HospitalFactoryMethod factory =  new HospitalFactory();
		Hospital hospital = factory.buildHospital(2, 19, 'N', 'Y', 'Y', 'N', 'N', 'Y', 'N');
        System.out.println(hospital.getHospitalType());
	}

}
