package com.testersconnect.contacts;

public class ContactManager {

	Contact[] myFriends = new Contact[5];
	int i = 0;
	boolean updateFlag = false;
	boolean foundFlag = false;
	
	

	public static void main(String[] args) {

		System.out.println("Welcome to this app, you can now store your contacts");

		ContactManager conManager = new ContactManager();

		Contact con1 = new Contact();
		con1.name = "Smith";
		con1.mobile = "9638527412";
		con1.email = "Smith@tc.com";

		conManager.addContact(con1);

		Contact con2 = new Contact();
		con2.name = "John";
		con2.mobile = "9876543211";
		con2.email = "john@tc.com";

		conManager.addContact(con2);

		conManager.modifyContact("Smith", "9876543222");
		System.out.println(con1.mobile);

		try {
			Contact sCon = conManager.searchContact("Smith");
			System.out.println(sCon.name + " " + sCon.email + " " + sCon.mobile);
		} catch (NullPointerException e) {
			System.out.println("Contact Does not exist");
		}

	}

	public void addContact(Contact con) {
		myFriends[i] = con;
		i++;
		System.out.println("Contact Added: " + con.name);
	}

	public Contact modifyContact(String name, String mobile) {
		for (int i = 0; i <= myFriends.length - 1; i++) {

			try {
				if (myFriends[i].name == name) {
					myFriends[i].mobile = mobile;
					updateFlag = true;
					break;

				}
			} catch (NullPointerException e) {
				updateFlag = false;
			}

		}
		if (updateFlag == false) {
			System.out.println("The Contact you want update (" + name + ") does not exist in the Contact List");
		}
		return myFriends[i];
	}

	public Contact searchContact(String name) {
		Contact con = null;
		for (int i = 0; i <= myFriends.length - 1; i++) {
			if (myFriends[i].name.equals(name)) {
				foundFlag = true;
				con = myFriends[i];
				break;
			}
		}

		if (foundFlag == false) {
			System.out.println("Contact not found");
		}

		return con;

	}

	public boolean deleteContact(String name) {
		boolean isDeleted = false;

		return isDeleted;

	}

}
