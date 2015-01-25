
public class HospitalFactory implements HospitalFactoryMethod {
 
	public Hospital buildHospital (int floor, int bedroom , char IntensiveCareUnit, char WaitingRoom , char EmergencyRoom, char MaternityWard, char Elevator,
			char OperatingRoom, char RecoveryRoom){
		
		 if ((bedroom < 20 ) && (IntensiveCareUnit == 'N' )) {
			 
			 return new PublicHospital(floor, bedroom, IntensiveCareUnit, WaitingRoom, EmergencyRoom, MaternityWard, Elevator, OperatingRoom, RecoveryRoom);
			 
		 }
		
		 else {
			    return new PrivateHospital(floor, bedroom, IntensiveCareUnit, WaitingRoom, EmergencyRoom, MaternityWard, Elevator, OperatingRoom, RecoveryRoom);	 }
	} 
	 
}
