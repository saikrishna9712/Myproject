package com.capg.onlinewallet.dao;
import com.capg.onlinewallet.model.WalletAccount;
import com.capg.onlinewallet.ui.ExistingException;

public interface WalletAccountDao {
	public WalletAccount createAccount(String s1,String s2,String pass,long accId) throws ExistingException;
	public boolean checkDetails(String s1,String s2);
}
