package JavaConcepts;

public class IndiaTrafficRule implements NationalTrafficRules {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//to call those methoads need to create object
		NationalTrafficRules NTR=new IndiaTrafficRule();
		NTR.goGreen();
		NTR.flashyellow();
		NTR.redStop();
		//to call it's own methods create object only specified to the class
		IndiaTrafficRule In=new IndiaTrafficRule();
		In.own();
	}

	@Override
	public void goGreen() {
		// TODO Auto-generated method stub
		System.out.println("allow to go");
	}

	@Override
	public void redStop() {
		// TODO Auto-generated method stub
		System.out.println("stop the vehicle");
	}

	@Override
	public void flashyellow() {
		// TODO Auto-generated method stub
		System.out.println("wait some time");
	}
    public void own() {
    	System.out.println("my own rule");
    }
}
