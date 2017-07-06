
public class Jumble {
	public static void main(String[] args) {
		String str1 = "good";
		String str2 = "ogdo";
		
		char[] chr1 = str1.toCharArray();
		char[] chr2 = str2.toCharArray();
		for(int i=0; i<chr1.length; i++) {
			for(int j=i+1; j<chr1.length; j++) {
				if (chr1[j] < chr1[i]) {
			          char temp = chr1[i];
			          chr1[i]=chr1[j];
			          chr1[j]=temp;
			      }
				if (chr2[j] < chr2[i]) {
			          char temp = chr2[i];
			          chr2[i]=chr2[j];
			          chr2[j]=temp;
			      }
			}
		}
		String s1 = new String(chr1);
		
		String s2 = new String(chr2);
		if(s1.equalsIgnoreCase(s2))
			System.out.println("yes");
		else
			System.out.println("not");
	}
}
