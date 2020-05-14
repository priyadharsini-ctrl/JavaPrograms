package javaPrograms;

public class ReverseEvenWordInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s2="When the world realise its own mistake, corona will dissolve automatically";
		String reverseEven="";
		String[] split = s2.split(" ");
		for (int i = 0; i < split.length; i++) {
			
		if(i%2!=0) {
			StringBuffer s = new StringBuffer(split[i]);
			split[i] = s.reverse().toString();
			//System.out.println(s1);
			//System.out.println(split[i] + s1);
			}
		
		}
		for(int i=0;i<split.length;i++)
		{
			reverseEven = reverseEven+" "+split[i];
		}
		
		
		System.out.println("Reverse of string in Even words = "+reverseEven);

		}
	}


