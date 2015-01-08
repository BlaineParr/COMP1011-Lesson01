public class Person
	{
		private float height;
		private float weight;
		
		//Getters and Setters
		public float getHeight() {
			return height;
		}

		public void setHeight(float height) {
			this.height = height;
		}

		//constructor
		public Person()
		{
			this.setHeight(6);
			this.weight = 200;
		}
		
		public void walks()
		{
			this.weight *= 0.9;
			System.out.println("You lost weight!");
			System.out.println("You weigh: " + this.weight + "lbs");
		}
		
		public void eats()
		{
			this.weight *= 1.2;
			System.out.println("You gained weight!");
			System.out.println("You weigh: " + this.weight + "lbs");
		}
	}