package week3.day1;
public class SmartPhone extends Mobile{
	public void accessWhatsApp()
	{
		System.out.println("AccessWhatsapp from Smartphone Class");
	}
	public static void main(String[] args) {
		AndroidPhone smart=new AndroidPhone();
		smart.takeVideo();
	}

}
