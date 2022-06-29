
public class Main {

	public static void main(String[] args) {
//		Declaring and assign
		String sentence = "A wizard’s job is to vex chumps quickly in fog.";
		Boolean a,b,c,d,e,f,g,h,i,j,k,l,m,n,o,p,q,r,s,t,u,v,w,x,y,z;
		a=b=c=d=e=f=g=h=i=j=k=l=m=n=o=p=q=r=s=t=u=v=w=x=y=z = false;
//		all letters lower case
		sentence = sentence.toLowerCase();
//		array of 26 values=0 to count each letter
		int[] array = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
//		alphabet for listing letters count and missing letters
		String alphabet = "abcdefghijklmnopqrstuvwxyz";
//		iterate through sentence
		for (int letter=0; letter<sentence.length(); letter++) {
//			switch statement to compare letter, set booleans value and count letter
			switch (sentence.charAt(letter)) {
			case 'a':
				a=true;
				array[0]++;
				break;
			case 'b':
				b=true;
				array[1]++;
				break;
			case 'c':
				c=true;
				array[2]++;
				break;
			case 'd':
				d=true;
				array[3]++;
				break;
			case 'e':
				e=true;
				array[4]++;
				break;
			case 'f':
				f=true;
				array[5]++;
				break;
			case 'g':
				g=true;
				array[6]++;
				break;
			case 'h':
				h=true;
				array[7]++;
				break;
			case 'i':
				i=true;
				array[8]++;
				break;
			case 'j':
				j=true;
				array[9]++;
				break;
			case 'k':
				k=true;
				array[10]++;
				break;
			case 'l':
				l=true;
				array[11]++;
				break;
			case 'm':
				m=true;
				array[12]++;
				break;
			case 'n':
				n=true;
				array[13]++;
				break;
			case 'o':
				o=true;
				array[14]++;
				break;
			case 'p':
				p=true;
				array[15]++;
				break;
			case 'q':
				q=true;
				array[16]++;
				break;
			case 'r':
				r=true;
				array[17]++;
				break;
			case 's':
				s=true;
				array[18]++;
				break;
			case 't':
				t=true;
				array[19]++;
				break;
			case 'u':
				u=true;
				array[20]++;
				break;
			case 'v':
				v=true;
				array[21]++;
				break;
			case 'w':
				w=true;
				array[22]++;
				break;
			case 'x':
				x=true;
				array[23]++;
				break;
			case 'y':
				y=true;
				array[24]++;
				break;
			case 'z':
				z=true;
				array[25]++;
				break;
			}
		}
//	check if all booleans are true and print out result	
		if (a&&b&&c&&d&&e&&f&&g&&h&&i&&h&&j&&k&&l&&m&&n&&o&&p&&q&&r&&s&&t&&u&&v&&w&&x&&y&&z) {
			System.out.println("<sentence> is a pangram!");
		} else System.out.println("<sentence> is not a pangram!");
// Listing all letters with relative count and missing letters if sentence is not pangram		
		System.out.println("In your this sentence there are:");
		for (int count=0 ; count<26; count++) {
			if (array[count]==0) {
				System.out.println(alphabet.charAt(count)+":missing");
			}else System.out.println(alphabet.charAt(count)+":"+array[count]);
		}
	}
}
