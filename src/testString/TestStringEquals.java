package testString;

import java.util.Objects;

/**
 * @author: wuke 
 * @date  : 2017年3月3日 下午4:09:27
 * Title  : TestEquals
 * Description : 
 */
public class TestStringEquals {
	public static void main(String[] args) {
		String a = "aaa";
        String b = null;
		String c = "aaa";
		
		System.out.println(c.equals(a)); // true
		//System.out.println(b.equals(a)); // java.lang.NullPointerException
	    System.out.println(Objects.equals(a, b)); // false
	}

}
