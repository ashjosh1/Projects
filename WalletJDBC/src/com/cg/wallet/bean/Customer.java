package com.cg.wallet.bean;

public class Customer {
	
		private long accountnumber;
		private String name;
		private String mobile;
		private String email;
		private String address;
	    private double balance;	
	    private String accounttype;
	    private String age;
	    private String gender;
	    private String pin;
	    public Customer() {}
	    
		public Customer(long accountnumber, String name, String mobile, String email, String address, double balance,
				String accounttype,String age,String gender,String pin) {
			super();
			this.accountnumber = accountnumber;
			this.name = name;
			this.mobile = mobile;
			this.email = email;
			this.address = address;
			this.balance = balance;
			this.accounttype = accounttype;
			this.age=age;
			this.gender=gender;
			this.pin=pin;
		}
		public String getGender() {
			return gender;
		}

		public void setGender(String gender) {
			this.gender = gender;
		}

		public String getPin() {
			return pin;
		}

		public void setPin(String pin) {
			this.pin = pin;
		}

		public String getAge() {
			return age;
		}

		public void setAge(String age) {
			this.age = age;
		}

		public long getAccountnumber() {
			return accountnumber;
		}
		public void setAccountnumber(long accountnumber) {
			this.accountnumber = accountnumber;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getMobile() {
			return mobile;
		}
		public void setMobile(String mobile) {
			this.mobile = mobile;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public String getAddress() {
			return address;
		}
		public void setAddress(String address) {
			this.address = address;
		}
		public double getBalance() {
			return balance;
		}
		public void setBalance(double balance) {
			this.balance = balance;
		}
		public String getAccounttype() {
			return accounttype;
		}
		public void setAccounttype(String accounttype) {
			this.accounttype = accounttype;
		}
		@Override
		public String toString() {
			return "Customer [accountnumber=" + accountnumber + ", name=" + name + ", balance="  +balance+ ",   pin="+pin+ "]";
		}

	}


