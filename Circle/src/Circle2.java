
public class Circle2 {

	String m_color = null;
	double m_radius = -1;
	
	public static void main(String[] args) 
		// TODO Auto-generated method stub
		{
			Circle2 bigCircle = new Circle2(90);
			System.out.println("Big Circle's radius is " + bigCircle.m_radius);
			System.out.println("Big Circle's color is " + bigCircle.m_color);
			System.out.println("Big Circle's radius is " + bigCircle.CalculateArea());
			bigCircle.PrintColor();
			
			Circle2 smallCircle = new Circle2(3, "pink");
			System.out.println("Small Circle's radius is " + smallCircle.m_radius);
			System.out.println("Small Circle's color is " + smallCircle.m_color);
			System.out.println("Small Circle's radius is " + smallCircle.CalculateArea());
			smallCircle.PrintColor();
		}
	

	 	Circle2(int radius)
	 	{
	 		m_radius = radius;
	 		m_color = "grey";
	 	}

	 	Circle2(int radius, String color)
	 	{
	 		m_radius = radius;
	 		m_color = color;
	 		
	 	}
	 	double CalculateArea()
	 	{
	 		double area = 3.14 * m_radius * m_radius;
	 		return area;
	 		
	 	}
	 	void PrintColor()
	 	{
	 		System.out.println("My color is + m_color");
	 	}			
	 	
}