package Singleinheritance;

public class student extends citizen {
	
	public student() {
		super();
	}
     private int rollno;
     private String collagename;
     
     //override
     //public String toString(){
     //return"student[rollno="rollno+",collagename="+collagename+"]";
     //}
     public student(String name,long adharno, String address,long phno) {
    	 super(name, adharno, address, phno);
    	 this.rollno=rollno;
    	 this.collagename=collagename;//TODO Auto-generated constructor stub
     }
     public int getRollno() {
    	 return rollno;
     }
     public void setgetRollno(int rollno) {
    	 this.rollno=rollno;
     }
     public String getcollagename() {
    	return collagename;
     } 
     public void setcollagename(String collagename) {
    	 this.collagename=collagename;
     }
}
