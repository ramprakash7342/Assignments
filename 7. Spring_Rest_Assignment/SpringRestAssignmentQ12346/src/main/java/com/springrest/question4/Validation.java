package com.springrest.question4;

import org.springframework.stereotype.Service;

@Service
public class Validation {

	public String validateVisa(String cardNo) {
		if(cardNo.length()<=19&&checkChar(cardNo.charAt(0),'4')==0)
			return "Valid visa Card";
		return "Invalid visa Card";
	}
	public String validateMasterCard(String cardNo) {
		if(cardNo.length()==16&&checkChar(cardNo.charAt(0),'5')==0&&
				(checkChar(cardNo.charAt(1),'1')>=01&&checkChar(cardNo.charAt(1),'5')<=0))
			return "Valid master Card";
		return "Invalid master Card";
	}
	public String validateJCB(String cardNo) {
		int subStr=Integer.parseInt(cardNo.substring(0, 4));
		if((cardNo.length()>=16&&cardNo.length()<=19)&&(subStr>=3528&&subStr<=3589))
			return "Valid jcb Card";
		return "Invalid jcb Card";
	}
    public String validatEnRoute(String cardNo) {
    	if(cardNo.length()==15&&(cardNo.substring(0, 4).equals("2014")||cardNo.substring(0, 4).equals("2149")))
			return "Valid enRoute Card";
		return "Invalid enRoute Card";
	}
    public String validateAmericanExpress(String cardNo) {
	
    	if(cardNo.length()==16&&checkSubStr(cardNo))
			return "Valid Card";
		return "Invalid Card";
    }
    
    public boolean checkSubStr(String str) {
         int sub=Integer.parseInt(str.substring(0, 6));
    	if(sub>=601100 &&sub<= 601109)
    	return true;
    	if(sub>=601120 && sub<= 601149)
    	return true;
    	if(sub>=601177&&sub<=601179)
    		return true;
    	if(sub>=601186&&sub<=601199)
    		return true;
    	if(sub>=644000 && sub<=659999)
    		return true;

    	return false;
    }
    public int checkChar(char a,char b) {
    	return Character.compare(a,b);
    		
    }
}
