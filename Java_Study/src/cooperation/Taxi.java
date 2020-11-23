package cooperation;

public class Taxi {
	
	int taxiNumber;
	int passengerCount;
	int money;
	
	public Taxi(int taxiNumber)
	{
		this.taxiNumber = taxiNumber;
	}
	
	public void take(int money)
	{
		this.money += money;
		passengerCount++;
	}
	
	public void showInfo()
	{
		System.out.println(taxiNumber + "번 택시를 탄 고객은 " + passengerCount + "명 이고, 수입은 " + money + "원 입니다.");
	}
	
}
