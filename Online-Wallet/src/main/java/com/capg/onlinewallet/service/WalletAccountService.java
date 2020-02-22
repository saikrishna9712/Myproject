package com.capg.onlinewallet.service;

import com.capg.onlinewallet.model.WalletAccount;
import com.capg.onlinewallet.ui.ExistingException;


public interface WalletAccountService {
  
	 public WalletAccount createAccount(String s1,String s2,String pass) throws ExistingException;
		public void checkDetails(String s1,String s2) throws ExistingException;

}
