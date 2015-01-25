
public class PrivateHospital extends Hospital {

	public PrivateHospital (int floor, int bedroom , char IntensiveCareUnit, char WaitingRoom , char EmergencyRoom, char MaternityWard, char Elevator,
			char OperatingRoom, char RecoveryRoom) {
		  
		super( floor,  bedroom ,  IntensiveCareUnit,  WaitingRoom ,  EmergencyRoom,  MaternityWard,  Elevator,
				 OperatingRoom,  RecoveryRoom);
		
			
	}

	@Override
	public String getHospitalType() {
				return " this is an Private Hospital " ;
	}
}

