package testString;
/**
 * @author: wuke 
 * @date  : 2016��11��24�� ����10:41:08
 * Title  : StringStringBufferStringBuilder
 * Description : 
 */
public class StringStringBufferStringBuilder { 
     /** Creates a new instance of testssb */ 
    final static int ttime = 30000;// ����ѭ������ 
    
    public StringStringBufferStringBuilder() { 
    }  
    
    public void test(String s){ 
        long begin = System.currentTimeMillis();
        
        for(int i=0;i<ttime;i++){ 
            s += "add"; 
        } 
        
        long over = System.currentTimeMillis(); 
        
        System.out.println(" ���� "+s.getClass().getName()+" ����ʹ�õ�ʱ��Ϊ�� " 
            + (over - begin) + " ���� " );       
    } 
    
    public void test(StringBuffer s){ 
        long begin = System.currentTimeMillis(); 
        
        for(int i=0;i<ttime;i++){ 
            s.append("add"); 
        } 
        
        long over = System.currentTimeMillis(); 
        
        System.out.println(" ���� "+s.getClass().getName()+" ����ʹ�õ�ʱ��Ϊ�� " 
            + (over - begin) + " ���� " );       
    } 
    
    public void test(StringBuilder s){ 
        long begin = System.currentTimeMillis(); 
        
        for(int i=0;i<ttime;i++){ 
            s.append("add"); 
        } 
        
        long over = System.currentTimeMillis(); 
        
        System.out.println(" ���� "+s.getClass().getName()+" ����ʹ�õ�ʱ��Ϊ�� " 
            + (over - begin) + " ���� " );       
    } 
    
    // �� String ֱ�ӽ����ַ���ƴ�ӵĲ��� 
    public void test2(){ 
        String s2 = "abadf"; 
        
        long begin = System.currentTimeMillis(); 
        
        for(int i=0;i<ttime;i++){ 
            String s = s2 + s2 + s2 ; 
        } 
        
        long over = System.currentTimeMillis(); 
        
        System.out.println(" �����ַ������������������ʹ�õ�ʱ��Ϊ�� " 
            + (over - begin) + " ���� " );       
    } 
    
    public void test3(){ 
    	
        long begin = System.currentTimeMillis(); 
        
        for(int i=0;i<ttime;i++){ 
            String s = "abadf" + "abadf" + "abadf" ; 
        } 
        
        long over = System.currentTimeMillis(); 
        
        System.out.println(" �����ַ������ʹ�õ�ʱ��Ϊ�� " 
            + (over - begin) + " ���� " );       
    } 
    
    public static void main(String[] args){ 
	    String s1 ="abc";
	    StringBuffer sb1 = new StringBuffer("abc");
	    StringBuilder sb2 = new StringBuilder("abc");
	    
	    StringStringBufferStringBuilder t = new StringStringBufferStringBuilder();
	    
	    t.test(s1);
	    t.test(sb1);
	    t.test(sb2);
	    t.test2();
	    t.test3();
    }
}