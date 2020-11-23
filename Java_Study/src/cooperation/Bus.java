package cooperation;

public class Bus {

	int busNumber;
	int passengerCount;
	int money;
	
	public Bus(int busNumber)
	{
		this.busNumber = busNumber;
	}
	
	// 승차 메소드
	public void take(int money)
	{
		this.money += money;
		passengerCount++;
	}
	
	public void showBusInfo()
	{
		System.out.println(busNumber + "번 버스의 승객은 " + passengerCount + "명 이고, 수입은 " + money + "원 입니다.");
	}
	
	
}
