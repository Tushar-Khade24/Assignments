
public class Engineer extends Employee {
	protected String overtime;

	Engineer(String name,String address,int age,boolean gender,double basicSalary,String overtime){
		super(name,address,age,gender,basicSalary);
		this.overtime = overtime;
	}
	public String getOvertime() {
		return overtime;
	}

	public void setOvertime(String overtime) {
		this.overtime = overtime;
	}
	
	@Override
	public void display() {
		super.display();
		System.out.println("overtime" + overtime);
	}
	
	
}
