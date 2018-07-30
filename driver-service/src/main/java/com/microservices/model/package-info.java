/**
 * 
 */
/**
 * @author Pankaj Bhushan
 *
 */
@org.hibernate.annotations.GenericGenerator(
		name = "driverid_generator",
		strategy = "enhanced-sequence",
		parameters = {
			@org.hibernate.annotations.Parameter(
					name = "sequence_name",
					value = "DRIVER_SEQUENCE"
			),
			@org.hibernate.annotations.Parameter(
					name="initial_value",
					value="105"
			)
			
})

package com.microservices.model;

