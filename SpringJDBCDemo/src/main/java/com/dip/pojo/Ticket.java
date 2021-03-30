package com.dip.pojo;

public class Ticket {

	private Integer id;
	private String doj;
	private String destination_station;
	private String email_id;
	private String passenger_name;
	private String source_station;
	
	

	public Ticket() {
		super();
	}

	public Ticket(Integer id, String doj, String destination_station, String email_id, String passenger_name,
			String source_station) {
		super();
		this.id = id;
		this.doj = doj;
		this.destination_station = destination_station;
		this.email_id = email_id;
		this.passenger_name = passenger_name;
		this.source_station = source_station;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDoj() {
		return doj;
	}

	public void setDoj(String doj) {
		this.doj = doj;
	}

	public String getDestination_station() {
		return destination_station;
	}

	public void setDestination_station(String destination_station) {
		this.destination_station = destination_station;
	}

	public String getEmail_id() {
		return email_id;
	}

	public void setEmail_id(String email_id) {
		this.email_id = email_id;
	}

	public String getPassenger_name() {
		return passenger_name;
	}

	public void setPassenger_name(String passenger_name) {
		this.passenger_name = passenger_name;
	}

	public String getSource_station() {
		return source_station;
	}

	public void setSource_station(String source_station) {
		this.source_station = source_station;
	}

	@Override
	public String toString() {
		return "Ticket [id=" + id + ", doj=" + doj + ", destination_station=" + destination_station + ", email_id="
				+ email_id + ", passenger_name=" + passenger_name + ", source_station=" + source_station + "]";
	}

}
