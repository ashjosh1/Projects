package com.cg.wallet.pi;
import java.util.Scanner;
import java.util.logging.Logger;


import com.cg.wallet.bean.Customer;
import com.cg.wallet.service.Service;
import com.cg.wallet.service.SeviceImpl;

public class MainClass {

	static Scanner sc = new Scanner(System.in);
	static Service Service = null;
	static SeviceImpl ServiceImpl = null;
	//static Logger logger = Logger.getRootLogger();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer c=new Customer();
		
	String  i=null ;
		while(true) {
			System.out.println("========BankingSystem========");
			System.out.println("1.Create an account");
            System.out.println("2. Show balance");
			System.out.println("3.Deposit");
			System.out.println("4.WithDraw");
			System.out.println("5.FundTransactions");
			System.out.println("6.Print Transactions");
			System.out.println("");
	 	    i=sc.next();
			switch(i) {
			case "1" :
				c.CreateAccount();
				break;
			case "2" :
				
				break;
			case "3" :
				
				break;
			case "4":
				
				break;
			case "5":
				
				break;
			case  "6":
				
				break;
				case "7":
					
					break;
					

	}

}}}
