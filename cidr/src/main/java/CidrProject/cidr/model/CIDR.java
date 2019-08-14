package CidrProject.cidr.model;

public class CIDR {

	String ip;
	String status;

	

	public CIDR(String ip) {
		super();
		this.ip = ip;
	}

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	
}
