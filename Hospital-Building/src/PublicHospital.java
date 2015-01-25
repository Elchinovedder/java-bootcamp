
public class PublicHospital extends Hospital {

	public PublicHospital (int floor, int bedroom , char IntensiveCareUnit, char WaitingRoom , char EmergencyRoom, char MaternityWard, char Elevator,
			char OperatingRoom, char RecoveryRoom) {
		  
		super( floor,  bedroom ,  IntensiveCareUnit,  WaitingRoom ,  EmergencyRoom,  MaternityWard,  Elevator,
				 OperatingRoom,  RecoveryRoom);
		
			
	}

	@Override
	public String getHospitalType() {
				return " this is an Public Hospital " ;
	}
}
