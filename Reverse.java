

class Reverse{
	public static String reverse(String str){
		if(str==null || str.equals(" ")){
			return str;
		}
		char[] c = str.toCharArray();
		for(int i=0,j=str.length()-1;i<j;i++,j--){
			char temp = c[i];
			c[i] = c[j];
			c[j] = temp;
		}
		return String.copyValueOf(c);
	}
	
	public static void main(String[] args){
		String str = "Manikandan";
		System.out.println("Given String is: " +str);
		System.out.println();
		System.out.println("Reversed String is: " +reverse(str));
	}
	
}