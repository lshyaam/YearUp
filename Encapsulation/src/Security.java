
public class Security 
{
	private String m_name = null;
	private int m_age = 1;
	private String m_phoneNumber = null;
	private String m_address = null;
	
	Security(String name, int age, String phoneNumber, String address)
	{
		SetName(name);
		SetAge(age);
		SetPhoneNumber(phoneNumber);
		SetAddress(address);	
	}
	
	String GetName()
	{
		return m_name;
	}

	private void SetName(String name)
	{
		m_name = name;
	}
	
	int GetAge()
	{
		return m_age;
	}
	
	private void SetAge(int age)
	{
		m_age = age;
	}
	
	String GetPhoneNumber()
	{
		return m_phoneNumber;
	}
	
	private void SetPhoneNumber(String phoneNumber)
	{
		m_phoneNumber = phoneNumber;
	}
	
	String GetAddress()
	{
		return m_address;
	}
	
	private void SetAddress (String Address)
	{
		m_address = Address;
	}
	
	void GrowsOlder()
	{
		//int currentAge = GetAge();
		//SetAge(currentAge + 1);
		
		m_age++;
	}
}