package week3.day1;

public class AndroidPhone extends SmartPhone{
	public void takeVideo()
	{
		System.out.println("takevideo mathod from AndroidPhone class");
	}
public static void main(String[] args) {
	AndroidPhone android=new AndroidPhone();
	android.sendMsg();
	android.makeCall();
	android.saveContact();
	android.accessWhatsApp();
	android.takeVideo();
	
}
}
