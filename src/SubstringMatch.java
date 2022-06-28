
public class SubstringMatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("is substring ? "+isSubString("HelloWorld!", "oWor"));
	}
	
private static boolean isSubString(String mainStr, String subStr) {
		
		char[] mArr = mainStr.toCharArray();
		char[] sArr = subStr.toCharArray();
		
		// main String length should be always greater or equal 
		if(!(mArr.length>=sArr.length)) {
			return false;
		}
		
		for (int i = 0; i < mArr.length; i++) {
			
			//substring first char matches then check rest of chars
			if(mArr[i] == sArr[0] && mArr.length - i >= sArr.length) {
				
				int mi = i;
				int counter = 0;
				
				for(char s : sArr) {
					
					// count the number of matches
					if(mArr[mi] == s)  counter++;
					mi++;
				}
				
				// if matched then it is substring
				return counter == sArr.length;
			}
			
		}
		
		return false;
	}

}
