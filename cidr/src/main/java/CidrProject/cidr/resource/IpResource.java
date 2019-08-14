package CidrProject.cidr.resource;
import java.util.ArrayList;
import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import CidrProject.cidr.model.CIDR;
import CidrProject.cidr.service.CreateIpAddress;


@RestController
public class IpResource {
	
	@Autowired
	CreateIpAddress service;
	
	@GetMapping(path = "/ips")
	public  HashMap<String,String> returnAllIps(){
		return service.returnAll();
	}
	
	@GetMapping(path = "/acquire/{ip}")
	public  HashMap<String,String> acquireIp(@PathVariable String ip){
		return service.acquiareIp(ip);
	}
	
	@GetMapping(path = "/release/{ip}")
	public  HashMap<String,String> releaseIp(@PathVariable String ip){
		return service.releaseIp(ip);
	}
	
}
