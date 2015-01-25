
 public abstract  class Hospital {
	
	private int floor;
	private int bedroom;
	private char IntensiveCareUnit;
	private char WaitingRoom;
	private char EmergencyRoom;
	private char MaternityWard;
	private char Elevator;
	private char OperatingRoom;
	private char RecoveryRoom;

	public Hospital() {
		floor = 4;
		bedroom = 40;
		IntensiveCareUnit = 'Y';
		WaitingRoom = 'Y';
		EmergencyRoom = 'Y';
		MaternityWard = 'N';
		Elevator = 'N';
		OperatingRoom = 'Y';
		RecoveryRoom = 'N';
	}
	
	public int getFloor() {
		return floor;
	}

	public void setFloor(int floor) {
		this.floor = floor;
	}

	public int getBedroom() {
		return bedroom;
	}

	public void setBedroom(int bedroom) {
		this.bedroom = bedroom;
	}

	public char getIntensiveCareUnit() {
		return IntensiveCareUnit;
	}

	public void setIntensiveCareUnit(char intensiveCareUnit) {
		IntensiveCareUnit = intensiveCareUnit;
	}

	public char getWaitingRoom() {
		return WaitingRoom;
	}

	public void setWaitingRoom(char waitingRoom) {
		WaitingRoom = waitingRoom;
	}

	public char getEmergencyRoom() {
		return EmergencyRoom;
	}

	public void setEmergencyRoom(char emergencyRoom) {
		EmergencyRoom = emergencyRoom;
	}

	public char getMaternityWard() {
		return MaternityWard;
	}

	public void setMaternityWard(char maternityWard) {
		MaternityWard = maternityWard;
	}

	public char getElevator() {
		return Elevator;
	}

	public void setElevator(char elevator) {
		Elevator = elevator;
	}

	public char getOperatingRoom() {
		return OperatingRoom;
	}

	public void setOperatingRoom(char operatingRoom) {
		OperatingRoom = operatingRoom;
	}

	public char getRecoveryRoom() {
		return RecoveryRoom;
	}

	public void setRecoveryRoom(char recoveryRoom) {
		RecoveryRoom = recoveryRoom;
	}

	public String toString() {
		return "Hospital [floor=" + floor + ", bedroom=" + bedroom
				+ ", IntensiveCareUnit=" + IntensiveCareUnit + ", WaitingRoom="
				+ WaitingRoom + ", EmergencyRoom=" + EmergencyRoom
				+ ", MaternityWard=" + MaternityWard + ", Elevator=" + Elevator
				+ ", OperatingRoom=" + OperatingRoom + ", RecoveryRoom="
				+ RecoveryRoom + "]";
	}
	
	public abstract String getHospitalType() ;
	
	public Hospital  (int floor, int bedroom , char IntensiveCareUnit, char WaitingRoom , char EmergencyRoom, char MaternityWard, char Elevator,
			char OperatingRoom, char RecoveryRoom) {
		
		this.floor = floor;
		this.bedroom = bedroom;
		this.IntensiveCareUnit= IntensiveCareUnit;
		this.WaitingRoom= WaitingRoom;
		this.EmergencyRoom=EmergencyRoom;
		this.MaternityWard= MaternityWard;
		this.Elevator=Elevator;
		this.OperatingRoom= OperatingRoom;
		this.RecoveryRoom= RecoveryRoom;
		
		
	}

	public interface HospitalFactory {

		public void buildFloor();

		public void buildBedRoom();

		public void buildIntensiveCareUnit();

		public void buildWaitingRoom();

		public void buildEmergencyRoom();

		public void buildMaternityWard();

		public void buildElevator();

		public void buildOperatingRoom();

		public void buildRecoveryRoom();
		
		public Hospital getHospital();
	}
	
			
}



	 

