package CidrProject.cidr.service;
import java.awt.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

import org.springframework.stereotype.Component;

import CidrProject.cidr.model.CIDR;

@Component
public class CreateIpAddress {

	private static HashMap<String,String> list = new HashMap<String, String>();
	static CIDR ip = new CIDR("192.168.0.1");
	static CIDR ip1 = new CIDR("192.168.0.2");
	static CIDR ip2 = new CIDR("192.168.0.3");
	static CIDR ip3 = new CIDR("192.168.0.4");
	static {
		list.put(ip.getIp(),"avaiable");
		list.put(ip1.getIp(), "avaiable");
		list.put(ip2.getIp(),"avaiable");
		list.put(ip3.getIp(),"avaiable");
	}
	
	public HashMap<String,String> returnAll(){
		return list;
	}
	
	public  HashMap<String,String>  acquiareIp(String ip) {
		for(String name : list.keySet()) {
			if(name.equals(ip)) {
				list.remove(ip);
				break;
			}
		}
		list.put(ip,"acquired");
		return list;
	}
	public  HashMap<String,String>  releaseIp(String ip) {
		for(String name : list.keySet()) {
			if(name.equals(ip)) {
				list.remove(ip);
				break;
			}
		}
		list.put(ip,"avaiable");
		return list;
	}
	
	
	
}
