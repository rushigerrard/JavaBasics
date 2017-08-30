package com.learning.java.string;

public class LeetValidIPaddress {

	public String validIPAddress(String IP) {
        if(IP.length() == 0 || IP.endsWith(":") || IP.endsWith("."))
        	return "Neither";
        if(isIPv4(IP)){
        	return "IPv4";
        }
        if(isIPv6(IP)){
        	return "IPv6";
        }
        return "Neither";
    }
	private boolean isIPv6(String IP) {
		String[] tokens = IP.split(":");
		if(tokens.length != 8){
			return false;
		}
		for(String s : tokens){
			if(s.length() != 4){
				if(s.equals("0"))
					continue;
				return false;
			}
			if(!s.matches("-?[0-9a-f-A-F]+")){
				return false;
			}
		}
		return true;
	}
	private boolean isIPv4(String IP) {
		String[] tokens = IP.split("\\.");
		if(tokens.length != 4){
			return false;
		}
		for(String s : tokens){
			try{
				if(s.startsWith("0") && s.length() > 1)
					return false;
				
				Integer i = Integer.parseInt(s);
				
				if(i < 0 || i > 255){
					return false;
				}
			}catch(NumberFormatException e){
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		LeetValidIPaddress lip = new LeetValidIPaddress();
		System.out.println(lip.validIPAddress("2001:0db8:85a3:0:0:8A2E:0370:7334"));
	}

}
