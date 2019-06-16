package small;

public class Basic10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 String a[][]=new String [3][4];
 a[0][0]="arun";
 a[0][1]="run";
 a[0][2]="kumar";
 a[0][3]="babloo";
 a[1][0]="ram";
 a[1][1]="ram";
 a[1][2]="ram";
 a[1][3]="ram";
 a[2][0]="babloo";
 a[2][1]="babloo";
 a[2][2]="babloo";
 a[2][3]="babloo";
	System.out.println("number of rows is" +a.length);
			System.out.println("number of colums is" +a[0].length);//dobt
			for(int x=0;x<a.length;x++)
			{
				for(int y=0;y<a[0].length;y++)
				{
					System.out.println(a[x][y]);
				}
			}
	}
	

}
