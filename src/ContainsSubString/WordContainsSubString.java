package ContainsSubString;

import org.testng.annotations.Test;

public class WordContainsSubString {
	boolean flag;
	public boolean checkContainsSubstring(String s1,String s2) {
		
		if(s1.isEmpty() || s2.isEmpty()) {
			flag=false;
		}else {
		if(s1.length()<s2.length()) {
			System.out.println("s1 is shorter string");
			if(s2.contains(s1)) {
				flag=true;
			}else flag= false;
		}
		else if(s2.length()<s1.length()) {
			System.out.println("s2 is shorter string");
			if(s1.contains(s2)) {
				flag=true;
			}else flag= false;
		}
		else {
			if(s1.contains(s2)) {
				flag=true;
			}else flag=false;
		}
		}
		return flag;
	}

	
	@Test
	public void test1() {
		System.out.println(checkContainsSubstring("ab","dabcd"));
	}
	
	@Test
	public void test2() {
		System.out.println(checkContainsSubstring("dabcd","ab"));
	}
	@Test
	public void test3() {
		System.out.println(checkContainsSubstring("",""));
	}
	
	@Test
	public void test4() {
		System.out.println(checkContainsSubstring("ad","ad"));
	}
}
