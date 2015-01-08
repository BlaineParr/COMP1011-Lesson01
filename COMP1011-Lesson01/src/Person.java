public class Person
	{
		private float height;
		private float weight;
		private String name;
		
		//Getters and Setters
		public float getHeight() {
			return height;
		}

		public void setHeight(float height) {
			this.height = height;
		}

		//constructor
		public Person(String name, float weight, float height)
		{
			this.height = height; //removed setter and used direct property access
			this.weight = weight;
			this.name = name;
		}
		
		public void walks()
		{
			this.weight *= 0.9;
			System.out.println(this.name + " lost weight!");
			System.out.println(this.name + " weighs: " + this.weight + "lbs");
		}
		
		public void eats()
		{
			this.weight *= 1.2;
			System.out.println(this.name + " gained weight!");
			System.out.println(this.name + " weigh: " + this.weight + "lbs");
		}
	}
