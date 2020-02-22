package com.capg.onlinewallet.dao;
import java.util.*;
import com.capg.onlinewallet.model.WalletAccount;
import com.capg.onlinewallet.ui.ExistingException;


public class WalletAccountDaoImpl implements WalletAccountDao {
	WalletAccount account=new WalletAccount();
	Map<Long,WalletAccount> mapaccounts=new HashMap<Long,WalletAccount>();

	WalletAccount a1=new WalletAccount("sai","krishna","123",2086436106L);
	WalletAccount a2=new WalletAccount("saikii","krish","456",1105576327L);
	WalletAccount a3=new WalletAccount("Cap Gemini","capgemini","789",222146408L);
	
	

	public WalletAccount createAccount(String s1,String s2,String pass,long accId) throws ExistingException {
		// TODO Auto-generated method stub

		mapaccounts.put(2086436106L,a1);  //
		mapaccounts.put(1105576327L,a2);  //
		mapaccounts.put(222146408L, a3);  //
		for(long k: mapaccounts.keySet()) {  
			WalletAccount s=mapaccounts.get(k);
			String p=s.getUserName();
			if(s2.equals(p)) {
				throw new ExistingException("UserName Already Exists\n");
			}
		}
		
		WalletAccount a=new WalletAccount();
		a.setName(s1);
		a.setUserName(s2);
		a.setPassword(pass);
		a.setAccountId(accId);
		mapaccounts.put(accId, a);
		return a;
	
	}
	
	

	public boolean checkDetails(String s1,String s2) {
		mapaccounts.put(2086436106L, a1);
		mapaccounts.put(1105576327L, a2);
		mapaccounts.put(222146408L, a3);
         
		for(long k: mapaccounts.keySet()) {  
			WalletAccount s=mapaccounts.get(k);
			String unme=s.getUserName();
            String pass=s.getPassword();
            
           
			if(pass.equalsIgnoreCase(s1) || unme.equalsIgnoreCase(s2)) {
				System.out.println("correct");
				return true;
				
				
				}
			
			}
		 return true;
	}

}
