package iQ;

public class RandomMethod {

	public static double ranodNumber()
	{
		long ranLong = System.currentTimeMillis();
	//	String tenp=""+ranlong;
		System.out.println(System.currentTimeMillis());
		String ranStr = ranLong+"";
		char ca[] = ranStr.toCharArray();
		
		double doblRan = ca[ca.length-1]*(0.01);
	//	System.out.println("math rnd ="+Math.random());
		return doblRan;
		//return ranStr.substring(ranStr.length()-2, ranStr.length());//ca[ca.length-1];
	}
	public static void main(String[] args) {
		
		System.out.println("random nuber = "+ranodNumber());

	}

}
