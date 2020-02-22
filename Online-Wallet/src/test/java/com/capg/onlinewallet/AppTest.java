package com.capg.onlinewallet;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.HashMap;
import java.util.Map;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.capg.onlinewallet.dao.WalletAccountDao;
import com.capg.onlinewallet.dao.WalletAccountDaoImpl;
import com.capg.onlinewallet.model.WalletAccount;




/**
 * Unit test for simple App.
 */
public class AppTest{
	 
	static Map<Long,WalletAccount> testmap=new HashMap<Long,WalletAccount>();
	static WalletAccountDao walletdao=new WalletAccountDaoImpl();
	static WalletAccount acc;
	
	@Test
	 public void testCheckDetails() {
		String name=acc.getUserName();
		String pass=acc.getPassword();
		 boolean ret=walletdao.checkDetails(name,pass);
		 assertEquals(true,ret);
		 
	 }
	
	
	 
	@BeforeAll 
	 public static void addAccount() {
		 acc=new WalletAccount("CapGemini","sai","147",2086436108L);

		 testmap.put(acc.getAccountId(), acc);
		 
		 }
	
	
	 
}





