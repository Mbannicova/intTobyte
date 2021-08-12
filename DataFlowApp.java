
public class DataFlowApp {

	public static void main(String[] args) {

	DataTransformer.integerToByte(10);	
	}

}

// secondary class
class DataTransformer {
	
	static  byte integerToByte( int value ) {
		if ( value >= -127 & value <= 127) {
			byte value1 = (byte)value;
			return value1;

			}
		else {
			System.out.println("WARNING! The value \" + value + \" overflows \"byte\" range. DATA will was lost!");
		}
				
		}
	}
	//
	
	//
	

	


