package org.system;

public class Deesktop extends Computer 
{
	public void desktopSize()
	{
		System.out.println("DesktopSize method in Desktop Class");
	}
	public static void main(String[] args) {
		
		Deesktop desktop=new Deesktop();
		desktop.computerModel();
		desktop.desktopSize();
		
	}

}
