package max;

public final class ImmutableClass {
       
	final String otp;

	ImmutableClass()
	{
		otp=A.getOTP();
	}
	
	public static ImmutableClass setValue()
	{
		return new ImmutableClass();
	}
	
	
	
	public String getOtp() {
		return otp;
	}

	public String toString()
	{
		return otp;
	}
	
}
