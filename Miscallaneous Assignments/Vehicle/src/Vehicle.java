
 class Vehicle {

	 	private double currentSpeed; 							//Instance Members
	 	private double currentDirection;
	 	private String ownername;
	 	private static int highestvehicleidentificationnumber;
	 	private int vehicleID;
	 	private static final int Turn_left=90 ;
	 	private static final int Turn_right=-90 ;
	 	
	 	Vehicle()						//nonparameterised constructor
	 	{}
	 	
	 	Vehicle(String ownername)			//parameterised constructor
	 	{
	 		this.ownername=ownername;
	 		
	 	}

		public int getVehicleID() {   //getter method to get the vehicleId
			return vehicleID;
		}

		public void setVehicleID(int vehicleID) {		//setter method to set the vehicleId
			this.vehicleID = vehicleID;
		}

		public double getCurrentSpeed() {				//getter method to get the CurrentSpeed
			return currentSpeed;
		}

		public void setCurrentSpeed(double currentSpeed) {		//setter method to set the currentspeed
			this.currentSpeed = currentSpeed;
		}

		public double getCurrentDirection() {					//getter method to get the currentdirection
			return currentDirection;
		}

		public void setCurrentDirection(double currentDirection) {
			this.currentDirection = currentDirection;
		}
	 	void changeSpeed(double speed)
	 	{
	 		
	 	this.currentSpeed=speed;
	 	}
	 	void stop()
	 	{
	 		this.currentSpeed=0;
	 	}
	 	void turn(double degree,String direction) 		//function to turn by degrees
	 	
	 	{
	 		if(direction.equals("left"))
	 		currentDirection+=degree;
	 		if(direction.equals("right"))
		 		currentDirection-=degree;
	 		
	 	}
	 	void turndirection(String direction)  		//function to turn by direction
	 	{
	 		if(direction.equals("left"))
	 			currentDirection+=Turn_left;
	 		if(direction.equals("right"))
	 			currentDirection+=Turn_left;
	 	}

		public static int getHighestvehicleidentificationnumber() {
			return highestvehicleidentificationnumber;
		}

		public static void setHighestvehicleidentificationnumber(int highestvehicleidentificationnumber) {
			Vehicle.highestvehicleidentificationnumber = highestvehicleidentificationnumber;
			
			
		}
	 	
	 
}
 
 
 
 
 

