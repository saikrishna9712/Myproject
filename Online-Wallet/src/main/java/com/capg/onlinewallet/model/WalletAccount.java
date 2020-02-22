package com.capg.onlinewallet.model;


public class WalletAccount {
	 String name;
	 String userName;
	 String password;
	 long accountId;
	double accountBalance=0;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public long getAccountId() {
		return accountId;
	}
	public void setAccountId(long accountId) {
		this.accountId = accountId;
	}
	public double getAccountBalance() {
		return accountBalance;
	}
	public void setAccountBalance(double accountBalance) {
		this.accountBalance = accountBalance;
	}
	public WalletAccount() {
		// TODO Auto-generated constructor stub
	} 
	public WalletAccount(String name, String userName, String password) {
		super();
		this.name = name;
		this.userName = userName;
		this.password = password;
	}
	public WalletAccount(String name, String userName, String password, long accountId) {
		super();
		this.name = name;
		this.userName = userName;
		this.password = password;
		this.accountId = accountId;
	}
//	@Override
//	public int hashCode() {
//		final int prime = 31;
//		int result = 1;
//		long temp;
//		temp = Double.doubleToLongBits(accountBalance);
//		result = prime * result + (int) (temp ^ (temp >>> 32));
//		result = prime * result + (int) (accountId ^ (accountId >>> 32));
//		result = prime * result + ((name == null) ? 0 : name.hashCode());
//		result = prime * result + ((password == null) ? 0 : password.hashCode());
//		result = prime * result + ((userName == null) ? 0 : userName.hashCode());
//		return result;
//	}
//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		WalletAccount other = (WalletAccount) obj;
//		if (Double.doubleToLongBits(accountBalance) != Double.doubleToLongBits(other.accountBalance))
//			return false;
//		if (accountId != other.accountId)
//			return false;
//		if (name == null) {
//			if (other.name != null)
//				return false;
//		} else if (!name.equals(other.name))
//			return false;
//		if (password == null) {
//			if (other.password != null)
//				return false;
//		} else if (!password.equals(other.password))
//			return false;
//		if (userName == null) {
//			if (other.userName != null)
//				return false;
//		} else if (!userName.equals(other.userName))
//			return false;
//		return true;
//	}
	@Override
	public String toString() {
		return "\tWalletAccount [name=" + name + ", userName=" + userName + ", password=" + password + ", accountId="
				+ accountId + ", accountBalance=" + accountBalance + "]"+"\n";
	}
	
	




}