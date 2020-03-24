package epamTDDJunit_disha.junit;

public class DeleteA {

	public String delete(String string) {
		String string1=string;
		if(string.charAt(0)=='A'&&string.charAt(1)=='A')
		{
			string1=string1.substring(2,string1.length());
		}
			
		return string1;
	}

}
