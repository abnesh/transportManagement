/**
 * 
 */
/**
 * @author Pankaj Bhushan
 *
 */

@org.hibernate.annotations.GenericGenerator(
		name="routeid_generator",
		strategy="enhanced-sequence",
		parameters= {
			@org.hibernate.annotations.Parameter(
				name = "sequence_name",
				value = "ROUTE_SEQUENCE"
			),
			@org.hibernate.annotations.Parameter(
				name = "initial_value",
				value= "1006"
			)
})

@org.hibernate.annotations.GenericGenerator(
		name="stopid_generator",
		strategy="enhanced-sequence",
		parameters= {
			@org.hibernate.annotations.Parameter(
				name = "sequence_name",
				value = "STOP_SEQUENCE"
			),
			@org.hibernate.annotations.Parameter(
				name = "initial_value",
				value= "10007"
			)
})

@org.hibernate.annotations.GenericGenerator(
		name="routemapid_generator",
		strategy="enhanced-sequence",
		parameters= {
			@org.hibernate.annotations.Parameter(
				name = "sequence_name",
				value = "ROUTEMAP_SEQUENCE"
			),
			@org.hibernate.annotations.Parameter(
				name = "initial_value",
				value= "7"
			)
})
package com.microservices.domain;