/*package com.example.swh_back;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SwhBackApplication {

	public static void main(String[] args) {
		SpringApplication.run(SwhBackApplication.class, args);
	}

}*/
/* 
package com.example.swh_back;

//import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

import com.example.swh_back.Registration.JwtProperties;
//import com.example.swh_back.Registration.UserController;


@SpringBootApplication
@EnableConfigurationProperties(JwtProperties.class)
public class SwhBackApplication  {

	//@Autowired
	//private UserController userController;

	public static void main(String[] args) {
		SpringApplication.run(SwhBackApplication.class, args);
	}
	

	/*@Override
	public void run(String... args) throws Exception {
		// Example data for testing registration
		Map<String, String> studentData = new HashMap<>();
		studentData.put("salutation", "Ms");
		studentData.put("fname", "John");
		studentData.put("mname", " ");
		studentData.put("lname", " ");
		studentData.put("email", "suket2005@gmail.com");
		studentData.put("password", "password123");
		studentData.put("confirm_password", "password123");
		studentData.put("dob", "2000-15-08"); // Ensure the date format matches the parsing logic
		studentData.put("phone_number", "1234567890");
		studentData.put("registering_as", "recruiter");
		studentData.put("check1", "true");

		// Simulate the registration process
		try {
			userController.insertData(studentData);
			System.out.println("Registration successful. Verification email sent to " + studentData.get("email"));
		} catch (Exception e) {
			System.out.println("Registration failed: " + e.getMessage());
		}
	}*/
	package com.example.swh_back;

//import com.example.swh_back.Registration.AdminController;
//import com.example.swh_back.Registration.AdminService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SwhBackApplication {

    
    public static void main(String[] args) {
        SpringApplication.run(SwhBackApplication.class, args);
    }

}


