package validatingforminput;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class PersonForm {

	@NotNull
		@Size(min=2, max=30)
		private String name;
	
	@NotNull
		@Size(min=4, max=20)
		private String lastName;

		@NotNull
		@Min(18)
		private Integer age;

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}
		public String getlastName() {
			return this.lastName;
		}
		public void setlastName(String lastName) {
			this.lastName = lastName;
		}

		public Integer getAge() {
			return age;
		}

		public void setAge(Integer age) {
			this.age = age;
		}

		public String toString() {
			return "Person(Name: " + this.name + "lastName" + this.lastName + ", Age: " + this.age + ")";
		}
	}

