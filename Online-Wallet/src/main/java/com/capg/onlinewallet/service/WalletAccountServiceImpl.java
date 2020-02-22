      package com.capg.onlinewallet.service;

import java.util.Random;
import com.capg.onlinewallet.dao.WalletAccountDaoImpl;
import com.capg.onlinewallet.model.WalletAccount;
import com.capg.onlinewallet.ui.ExistingException;

import com.capg.onlinewallet.dao.WalletAccountDao;

public class WalletAccountServiceImpl implements WalletAccountService {
     WalletAccountDao walletdao=new WalletAccountDaoImpl();

	public WalletAccount createAccount(String s1,String s2,String pass) throws ExistingException{
		// TODO Auto-generated method stub
		
			Random rand=new Random();
		long x=(long)Math.abs(rand.nextInt());
		
		
		 return walletdao.createAccount(s1,s2,pass,x);
		
	}
	
	public void checkDetails(String s1,String s2) throws ExistingException  {
		    boolean x=walletdao.checkDetails(s1,s2);
			if(x==false) {
				throw new ExistingException("Invalid Credentials\n");
				 }
			
	}
}


	

