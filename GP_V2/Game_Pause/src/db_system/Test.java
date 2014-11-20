package db_system;

import java.sql.SQLException;

import containers.Account;

public class Test {

	public static void main(String[] args) {
		//LoginDB pop = new LoginDB();
		//Account kop = new Account();
		/*
		try {
			pop.connect();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		pop.login(kop, "elcholo", "pass90rd");
		System.out.println(kop.getLastname());
		System.out.println(kop.getPhonenumber());
		
		LoginDB p1 = new LoginDB();
		Account p2 = new Account();
		
		try {
			p1.connect();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		pop.disconnect();
		
		p1.login(p2, "jontron@java02.org", "passord");
		System.out.println(p2.getLastname());
		System.out.println(p2.getPhonenumber());
		p1.disconnect();
		
		*/
		
		SearchDB sop = new SearchDB();
		
		//sop.test("Hello","this is","hello","world in the make");

	}

}
