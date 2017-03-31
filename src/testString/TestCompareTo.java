package testString;
/**
 * @author: wuke 
 * @date  : 2016年12月21日 上午10:36:32
 * Title  : TestCompareTo
 * Description : 
 */
public class TestCompareTo {

	public static void main(String[] args) {
		// == & equals
		String str1 = "aaa";
		String str2 = "aaa";
		System.out.println(str1 == str2); // true
		
		String str3 = new String("aaa");
		String str4 = new String("aaa");
		System.out.println(str3 == str4); // false
		
		String str5 = str3;
		System.out.println(str3 == str5); // true
		
		// compareTo()
		String str6 = "aaa";
		String str7 = "aaa";
		String str8 = "aa";
		String str9 = "a";
		String str10 = "aba";
		String str11 = "abz";
		String str12 = "z";
		
		System.out.println(str6.compareTo(str7)); // 0
		
		System.out.println(str6.compareTo(str8)); // 1
		System.out.println(str6.compareTo(str9)); // 2
		
		System.out.println(str6.compareTo(str10)); // -1
		System.out.println(str6.compareTo(str11)); // -1
		System.out.println(str6.compareTo(str12)); // -25
	}

}
