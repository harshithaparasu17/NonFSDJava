package p4.enumeration;

public class DriverClass {
	public static void main(String[] args) {
		
		//TrafficLightSimulation trafficLight = TrafficLightSimulation.GREEN;
		//trafficLight.setNum(2);
		//System.out.println(trafficLight + " : " + trafficLight.getNum());
		for(TrafficLightSimulation trafficLight : TrafficLightSimulation.values())
		{
			System.out.println(trafficLight + " : " + trafficLight.getNum());
		}
		
	}
}
