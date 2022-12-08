package test_1207;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Main4 {
	
	public static void main(String[] args) {
		
		Company company = Company.builder()
				.companyId(100)
				.companyName("Apple")
				.address("Apple Computer Inc. 1 infinite Loop")
				.city("Cupertino")
				.state("CA")
				.zipCode("95014")
				.build();

		
		Gson gson = new GsonBuilder()
		.setPrettyPrinting()
		.create();
				
		String companyJson = gson.toJson(company);
		
		System.out.println(companyJson);
	}

}