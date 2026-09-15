
public abstract class Employee {

	protected String name;
	protected String address;
	protected int age;
	protected boolean gender;
	protected double basicSalary;
	
	Employee(String name,String address,int age,boolean gender,double basicSalary){
		this.name = name;
		this.address = address;
		this.age = age;
		this.gender = gender;
		this.basicSalary = basicSalary;
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		if(age < 18 || age >58)
			this.age = 21;
			else
			this.age = age;
	}
	
	public boolean isGender() {
		return gender;
	}
	public void setGender(boolean gender) {
		this.gender = gender;
	}
	
//	public char getGender() {
//		return gender;
//	}
//	public void setGender(char gender) {
//		this.gender = gender;
//	}
	public double getBasicSalary() {
		return basicSalary;
	}
	public void setBasicSalary(double basicSalary) {
		this.basicSalary = basicSalary;
	}

	public void display() {
		System.out.println("Name : " + name);
		System.out.println("Address : " + address);
		System.out.println("Age : " + age);
		System.out.println("Gender : " + gender);
		System.out.println("BasicSalary : " + basicSalary);
	}

	
	
	
}
