
public class SalesPerson extends Employee{

	protected float commission ;
	
	SalesPerson(String name,String address,int age,boolean gender,double basicSalary,float commission){
		super(name,address,age,gender,basicSalary);
		this.commission = commission;
	}

	public float getCommission() {
		return commission;
	}

	public void setCommission(float commission) {
		this.commission = commission;
	}
	
	@Override
	public void display() {
		super.display();
		System.out.println("Commission : " + commission);
	}
}
