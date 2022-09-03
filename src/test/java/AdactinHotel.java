import java.io.IOException;

import org.openqa.selenium.WebElement;

public class AdactinHotel extends BaseClass {

	public static void main(String[] args) throws IOException, InterruptedException {
		AdactinHotel adactinHotel=new AdactinHotel();
		adactinHotel.bookHotel();

	}

	public void bookHotel() throws IOException, InterruptedException {
		getDriver();
		url("https://adactinhotelapp.com//");
		maximizeWindow();
		

	WebElement txtUser=elementFindById("username");
	String data = getData("Datas", 1, 0);
	sendkeys(txtUser, data);
	
	WebElement txtpassword=elementFindById("password");
	String data1 = getData("Datas", 1, 1);
	sendkeys(txtpassword, data1);
	
	WebElement btnClick=elementFindById("login");
	btnClick(btnClick);
	
	WebElement location=elementFindById("location");
	String data2 = getData("Datas", 1, 2);
	sendkeys(location, data2);
	
	WebElement hotels=elementFindById("hotels");
	String data3 = getData("Datas", 1, 3);
	sendkeys(hotels, data3);
	
	WebElement roomType=elementFindById("room_type");
	String data4 = getData("Datas", 1, 4);
	sendkeys(roomType, data4);
	
	WebElement noOfRooms=elementFindById("room_nos");
	String data5 = getData("Datas", 1, 5);
	sendkeys(noOfRooms, data5);
	
	WebElement checkInDate=elementFindById("datepick_in");
	clearMethod(checkInDate);
	String data6 = getData("Datas", 1, 6);
	sendkeys(checkInDate, data6);
	
	WebElement checkOutDate=elementFindById("datepick_out");
	clearMethod(checkOutDate);
	String data7 = getData("Datas", 1, 7);
	sendkeys(checkOutDate, data7);
	
	WebElement adultPerRoom=elementFindById("adult_room");
	String data8 = getData("Datas", 1, 8);
	sendkeys(adultPerRoom, data8);
	
	WebElement childPerRoom=elementFindById("child_room");
	String data9 = getData("Datas", 1, 9);
	sendkeys(childPerRoom, data9);
	
	WebElement btnClick1=elementFindById("Submit");
	btnClick(btnClick1);
	
	WebElement btnClick2=elementFindById("radiobutton_0");
	btnClick(btnClick2);
	
	WebElement btnClick3=elementFindById("continue");
	btnClick(btnClick3);
	
	WebElement frstName=elementFindById("first_name");
	String data10 = getData("Datas", 1, 18);
	sendkeys(frstName, data10);
	
	WebElement lastName=elementFindById("last_name");
	String data11 = getData("Datas", 1, 19);
	sendkeys(lastName, data11);
	
	WebElement address=elementFindById("address");
	String data12 = getData("Datas", 1, 20);
	sendkeys(address, data12);
	
	WebElement crdNo=elementFindById("cc_num");
	String data13 = getData("Datas", 1, 21);
	sendkeys(crdNo, data13);
	
	WebElement crdTyp=elementFindById("cc_type");
	String data14 = getData("Datas", 1, 22);
	sendkeys(crdTyp, data14);
	
	WebElement expDate=elementFindById("cc_exp_month");
	String data15 = getData("Datas", 1, 24);
	sendkeys(expDate, data15);
	
	WebElement expYear=elementFindById("cc_exp_year");
	String data16 = getData("Datas", 1, 25);
	sendkeys(expYear, data16);
	
	WebElement cvv=elementFindById("cc_cvv");
	String data17 = getData("Datas", 1, 26);
	sendkeys(cvv, data17);
	
	WebElement btnClick21=elementFindById("book_now");
	btnClick(btnClick21);
	
	Thread.sleep(8000);
	
	WebElement orderid=elementFindById("order_no");
	String attribute = getAttribute(orderid);

	createNewCell("Datas", 0, 27, "Order Id");
	createNewCell("Datas", 1 ,27,attribute);
	System.out.println("metds1");
	System.out.println("metds1");
	
	}
	
	
	
	

	
	
	
	
	
	


}
}
