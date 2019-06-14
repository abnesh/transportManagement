/**
 * 
 */
/**
 * @author Alice
 *
 */

@org.hibernate.annotations.GenericGenerator(
		name="emp_generator",
		strategy="enhanced-sequence",
		parameters= {
			@org.hibernate.annotations.Parameter(
				name = "sequence_name",
				value = "EMP_SEQUENCE"
			),
			@org.hibernate.annotations.Parameter(
				name = "initial_value",
				value= "11111114"
			)
})
package com.microservices.employeeservice.model;