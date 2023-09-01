class Employee {

	//instance varible
	int eid;
	String ename;
	long phone;

	//static varible
	static String mgr = "Banu";
	static int salary = 30000;
	Employee(int eid, String ename, long phone){

	this.eid = eid;
	this.ename = ename;
	this.phone = phone;
	}

	void display(){

	System.out.println("id :" +eid +" ename :" +ename +" phone :" +phone +" mgr :" +mgr +"salary :" +incentive());
	}

	static int incentive(){
	return(salary + (salary*(10 / 100)));
	}
	public static void main(String args[]){
	
	Employee Vijay = new Employee(101,"Vijay",9876543210l);
	Employee Afrith = new Employee(102,"Afrith",6376532216l);
	Employee Bharathi = new Employee(103,"Bharathi",9876543267l);
	Employee Prakash = new Employee(104,"Prakash",9236543212l);
	Employee Mani = new Employee(105,"Mani",8076543210l);
	Vijay.display();
	Afrith.display();
	Bharathi.display();
	Prakash.display();
	Mani.display();

	
	}
	

}