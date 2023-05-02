package p4.enumeration;

public enum TrafficLightSimulation {
	RED(3),YELLOW(2),GREEN(1);

	private int num;

	private TrafficLightSimulation(int num)
	{
		this.num=num;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}
	
	
}