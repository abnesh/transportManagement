/**
 * 
 */
/**
 * @author Pankaj Bhushan
 *
 */
@org.hibernate.annotations.GenericGenerator(
		name = "vehicleid_generator",
		strategy = "enhanced-sequence",
		parameters = {
			@org.hibernate.annotations.Parameter(
					name = "sequence_name",
					value = "VEHICLE_SEQUENCE"
			),
			@org.hibernate.annotations.Parameter(
					name="initial_value",
					value="9005"
			)
			
})

@org.hibernate.annotations.GenericGenerator(
		name = "vehiclecapid_generator",
		strategy = "enhanced-sequence",
		parameters = {
			@org.hibernate.annotations.Parameter(
					name = "sequence_name",
					value = "VEHICLECAP_SEQUENCE"
			),
			@org.hibernate.annotations.Parameter(
					name="initial_value",
					value="100005"
			)
			
})

package com.microservices.vehicleservice.model;

