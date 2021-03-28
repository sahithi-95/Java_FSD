package corejava;

public class StringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="Hello";
		String s2=new String ("Hello");
		String s3= "Hello";
		
		System.out.println(s1);
		// here we are comparing the address not the content
		System.out.println(s1==s2);
		System.out.println(s1==s3);
		
		//when manipulated a new memory location is assigned to the new modified string
		s1=s1+"World";
		
		System.out.println(s1);
		System.out.println(s1.length());
		System.out.println(s1.indexOf('o'));
		System.out.println(s1.lastIndexOf('o'));
		System.out.println(s1.charAt(5));
		System.out.println(s1.substring(3));
		System.out.println(s1.substring(3,7));
		System.out.println(s1.replace('o','a'));
		System.out.println(s1);
		
		String week="mon-tue-wed-thu-fri-sat-sun";
		String[] days=week.split("-");
		/*for(int i =0;i<days.length;i++)
		{
			System.out.println(days[i]);
		}
        */
		for(String day:days)
		{
			System.out.println(day);
		}

	}

}
