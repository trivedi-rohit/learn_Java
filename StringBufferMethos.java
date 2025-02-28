public class StringBufferMethos {

	public static void main(String[] args) {
		StringBuffer sv =new StringBuffer();
		sv.append(" The value of PIE is : ");
		sv.append(3.1414); //double data
		sv.insert(0,"Hello,"); 
		sv.append(", This is exactly ");
		sv.append(true);
		System.out.println(sv+".");
		sv.setLength(27); // It will delete the character after after 27
		System.out.println(sv+".");
		sv.reverse(); //reverse the stringBuffer data.
		sv.delete(16,26);
		sv.setLength(27);
		sv.deleteCharAt(25);
		System.out.println(sv+".");
		System.out.println(sv.length());
	}
}
