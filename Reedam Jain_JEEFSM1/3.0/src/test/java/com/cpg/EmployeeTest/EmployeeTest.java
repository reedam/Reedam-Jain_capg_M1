package com.cpg.EmployeeTest;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import com.cpg.EmployeeMain.Employee;

public class EmployeeTest {
	
	@Test
	void calPayTest() {
		Employee obj=new Employee(101,"Ashish",25000.00,4.0);
		 assertEquals(25000.00,obj.calNetPay());  	
	}

}
