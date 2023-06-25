package TY;

public class StringValid {
	

	public static boolean isvalid(int var, String s) {
		boolean flag=false;
		
		
		
		for(int i=0;i<s.length();i++) {
			int res=count(s,i);
			if(res==var) {
				flag=true;
				System.out.println(res);
			}
			else
				flag=false;
			
		}
		return flag;
	}
			
		
	
	public static int count(String st,int pos) {
		int var=pos;
		char c=st.charAt(var);
		int count=0;
		for(int i=0;i<st.length();i++) {
			try{if (st.charAt(i)==c) {
				count++;
			}
			}
			catch(Exception e) {
				
			}
		}
		return count;
	}
		
		public static void main(String [] arg) 
		
		{
			String s="aaabbbcccdddeeeab";
			int length=count(s,0);
			System.out.println(length);
			System.out.println(count(s,0));
			System.out.println(count(s,5));
			boolean statement=isvalid(length, s);
			if(statement==false) {
				System.out.println("invalid");
			}
			else {
				System.out.println("valid");
			}	
		}
}



