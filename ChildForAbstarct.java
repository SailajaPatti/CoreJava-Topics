package JavaConcepts;

public class ChildForAbstarct extends AbstractClass{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     AbstractClass obj=new ChildForAbstarct();
     obj.engine();
     obj.guideLines();
     obj.bodycolour();
    ChildForAbstarct obj1=new ChildForAbstarct();
    obj1.ownMethod();
	
	}

	@Override
	public void bodycolour() {
		// TODO Auto-generated method stub
		System.out.println("boduclour:green");
	}
    public void ownMethod()
    {
    	System.out.println("ChildAbstractClass own method");
    }
}
