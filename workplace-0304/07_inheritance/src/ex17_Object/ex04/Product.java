package ex17_Object.ex04;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Product {

	// field
	private String model;
	private String manufacturer;
	private String date;

	// override
	@Override
	public boolean equals(Object obj) {
		if(this == obj)
			return true;
		
		if(!(obj instanceof Product))
			return false;
		else {
			Product pro = (Product)obj;
			return (this.getModel()).equals(pro.getModel()) && (this.getManufacturer()).equals(pro.getManufacturer());  
		}
	}
	
}
