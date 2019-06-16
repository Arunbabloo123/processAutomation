
public class Four {
int x;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		     Four a=new Four();
		     a.x=10;
		     Four b=new Four();
		     b.x=20;
		     Four c=new Four();
		     c.x=30;
		     a=b;
		     b=c;
		     c=a;
		     System.out.println(a.x);
		     System.out.println(b.x);
			System.out.println(c.x);
			}
		}

	