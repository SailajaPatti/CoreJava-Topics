package JavaConcepts;

public class ChildForInheritance extends Inheritance {
 String name="QA Automation";
	public void getStringData() {
		System.out.println(name);
		System.out.println(super.name);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		ChildForInheritance obj=new ChildForInheritance();
		obj.getStringData();
		obj.getdata();
	}

}
