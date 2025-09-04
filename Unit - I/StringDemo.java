class StringDemo
{
	public static void main(String args[])
	{
		String str=new String("Bhavana");
		System.out.println("Value of str ="+str);
		System.out.println("Length of str ="+str.length());
		System.out.println("To Lower Case ="+str.toLowerCase());
		System.out.println("To Upper Case ="+str.toUpperCase());
		System.out.println("Character present at 2 index ="+str.charAt(2));
		System.out.println("Concatenation="+str.concat("Patil"));
		System.out.println("Index of v character ="+str.indexOf('v'));
		System.out.println("Equals method ="+str.equals("Bhavana"));
		System.out.println("CompareTo method ="+str.compareTo("Bhavana"));
	}
}