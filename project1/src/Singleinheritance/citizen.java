package Singleinheritance;
//demonstrate single inheritance
public class citizen {
	private String name;
	private long adharno;
	private String address;
	private long phno;
	
	//override
	public String toString() {
		return "citizen[name="+name+",adharno="+adharno+",address="+address+"]";
	}
				public String getName() {
			return name;
		}
		
public void setname(String name) {
	this.name=name;
}
public long getadharno() {
	return adharno;
}
public void setadharno(long adharno) {
	this.adharno=adharno;
}
public String getaddress(String address) {
	return address;
}
	public void setaddress(String address) {
		this.address=address;
	}
		public long getphno() {
			return phno;
		}
		public void setphno(long phno) {
			this.phno=phno;
		}
		public citizen(String name,long adharno,String address,long phno) {
			super();
			this.name=name;
			this.adharno=adharno;
			this.address=address;
			this.phno=phno;
	}
	}
