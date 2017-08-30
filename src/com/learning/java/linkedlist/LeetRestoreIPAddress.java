package com.learning.java.linkedlist;

import java.util.ArrayList;
import java.util.List;

public class LeetRestoreIPAddress {

	  
	  public boolean validBlock(int value){
		return (value >= 0 && value <= 255);
	  }
	  public void validateBlock(String ip, int start, int block, String currentIP, List<String> list){
	        if(start == ip.length())
	        	return ;
	        int end;
	        Integer value;
	    
	        if(block == 3){
	        	
	          end = ip.length();
	          if(ip.charAt(start) == '0' && (end - start) > 1){
	        	  return ;
	          }
	          System.out.println(start + "," + (end - 1));
	          value = Integer.parseInt(ip.substring(start, end));
	          
	          if(validBlock(value)){
	                currentIP = currentIP + "." + ip.substring(start, end);
	                list.add(currentIP.substring(1));
	          }
	          return ;
	        }
	        for(int length = 3; length > 0; length--){
	          end = start + length;
	          
	          if(start + length > ip.length()){
	              continue ;
	          }
	          System.out.println(start + "," + (end - 1));
	          if(ip.charAt(start) == '0' && (end - start) > 1){
	        	  continue;
	          }
	          value = Integer.parseInt(ip.substring(start, end));
	          if(validBlock(value)){
	              validateBlock(ip, end, block + 1, currentIP + "." + ip.substring(start, end), list);
	          }
	          
	        }
	  }
	  public List<String> restoreIpAddresses(String s) {
	        List<String> list = new ArrayList<>();
	    
	        if(s.length() < 4 || s.length() > 12){
	          return list;
	        }
	        validateBlock(s, 0, 0, "", list);
	        return list;
	  }


	public static void main(String[] args) {
		LeetRestoreIPAddress l = new LeetRestoreIPAddress();
		for( String ip : l.restoreIpAddresses("010010")){
			System.out.println(ip);
		}

	}

}
