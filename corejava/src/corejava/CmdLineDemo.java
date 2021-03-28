package corejava;

public class CmdLineDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*for(String arg :args)
		{
			System.out.println(arg);
		}
		*/
		int sum=0;
		for(String num :args)
		sum+=Integer.parseInt(num);
		System.out.println("Sum "+sum);

	}

}
