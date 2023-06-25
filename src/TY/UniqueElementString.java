package TY;

public class UniqueElementString {
	public static void main(String[] args) {
		String s="school";
		int count=1;
		//int var=0;
		
		char[] st=s.toCharArray();
		char c=st[0];
		for(int i=1;i<st.length;i++) {
			if(st[i]==c) {
				count++;
			}
			else {
				System.out.println(c+".."+count);
				c=st[i];
				count=1;
			}
		}
		System.out.println(c+".."+count);
	}

}
