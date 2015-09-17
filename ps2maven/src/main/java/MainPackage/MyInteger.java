package MainPackage;

public class MyInteger {
	
	private int value;
	
	public int getValue() {
		return value;
	}
	
	
	public MyInteger(int value){
		      this.value= value;
		   }
	
	public boolean isEven(){
		if (this.getValue()%2==0){
		return true;
	}
		else{
			return false;
		}
	}
	public boolean isOdd(){
		if (this.getValue()%2==0){
		return false;
	}
		else{
			return true;
		}
	}
	public boolean isPrime(){
		return isPrime(value);
	}
	public static boolean isEven(int value){
		if (value %2==0){
			return true;
		}
			else{
				return false;
			}
}
	public static boolean isOdd(int value){
		if (value %2==0){
			return false;
		}
			else{
				return true;
			}
		}
	public static boolean isPrime(int value) {
	    for(int a=2;a<value;a++) 
	        if(value % a !=0){
	            return true;}
	    return false;    
	}
	public static boolean isOdd(MyInteger MyInt){
		if (MyInt.getValue() %2==0){
			return false;
		}
			else{
				return true;
			}
		}
	public static boolean isEven(MyInteger MyInt){
		if ( MyInt.getValue() %2==0){
			return true;
		}
			else{
				return false;
			}
		}
	public static boolean isPrime(MyInteger MyInt){
	    for(int a=2;a<MyInt.getValue();a++) 
	        if(MyInt.getValue() % a !=0){
	            return true;}
	    return false;    
	}
	
	    public boolean equals(int number) {
	    	if (value==number){
				return true;
			}
				else{
					return false;
				}
			}
		public  boolean equals(MyInteger MyInt){
			if ( value==MyInt.getValue()){
				return true;
			}
				else{
					return false;
				}
			}
		public static int parseInt(String str) {
			return Integer.parseInt(str);
			}
		

}
