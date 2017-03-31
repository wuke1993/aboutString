package testString;
/**
 * @author: wuke 
 * @date  : 2016年12月20日 下午4:37:40
 * Title  : TestSplit
 * Description : 
 */
public class TestSplit {

	public static void main(String[] args) {
		//String str = "a,b,c,d,e,";
		String str = "a,b,c,d,e, ";
		
		String[] result = str.split(",");
		
		for(String s : result) {
			System.out.println("**" + s + "**");
		}
	}

}
