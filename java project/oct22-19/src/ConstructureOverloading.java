
public class ConstructureOverloading {
	String name;
	int eid;
	long aadharno;
	ConstructureOverloading(String name,int eid,long aadharno){
		this.name = name;
		this.eid = eid;
		this.aadharno = aadharno;
	}
	ConstructureOverloading(String name,int eid){
		this.name = name;
		this.eid = eid;
	}
	ConstructureOverloading(int eid,String name){
		this.name = name;
		this.eid = eid;
	}
	void printDetails() {
		System.out.println("Hi "+name+" Welcome to ust Global");
		System.out.println("name: "+name+ " eid: " +eid);
		
	}
}
