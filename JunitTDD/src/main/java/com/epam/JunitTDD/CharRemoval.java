package com.epam.JunitTDD;

public class CharRemoval {
public String testremove(String input) {
	String str=input;
	if(input.length()==0) {
		str=" ";
	}
	if(input.length()==1) {
		if(input.charAt(0)=='A') {
			str=" ";
		}
		else {
			str=input;
		}
	}
	if(input.length()==2) {
		if(input.charAt(0)=='A' && input.charAt(1)=='A') {
			str=" ";
		}
	}
	if(input.length()>2) {
		if(input.charAt(0)=='A' && input.charAt(1)=='A') {
			str=input.substring(2);
		}
		else if(input.charAt(0)!='A' && input.charAt(1)=='A') {
			str=input.charAt(0)+input.substring(2);
		}
		else if(input.charAt(0)=='A' && input.charAt(1)!='A') {
			
		    str=input.substring(1);
	}
}

return str;
}
}