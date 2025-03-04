	class Student
	{
		private int age;      //instance variable//Data Member//Fields
		private String name;   //properties
		private String city;
		
		void setAge(int age)  //Setters
		{
			this.age=age;
		}
		int getAge()   //getters
		{
			return age;
		}
		void setName(String name)
		{
			this.name=name;
		}
		String getName()
		{
			return name;
		}
		void setCity(String city)
		{
			this.city=city;
		}
		String getCity()
		{
			return city;
		}
		
	}
	//


	public class EncapsulationTheory {

		public static void main(String[] args) {
			
			Student st=new Student();
			/*
			 * st.age=-28; st.name="Lucknow"; st.city="Lucknow";
			 */
			//st.age=-28; error bcoz age is private 
			st.setAge(28);
			int age=st.getAge();
			System.out.println(age);
			
			st.setName("Rohit");
			System.out.println(st.getName());
			
		}

	}
