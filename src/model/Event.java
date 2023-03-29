package model;

import java.io.Serializable;
import java.time.LocalDate;
import javax.persistence.*;
import enums.Event_enum;

@Entity
@Table(name = "event_management")
@NamedQuery(name="Event.findAll",query="SELECT u FROM Event u")
public class Event implements Serializable{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String title;
	private LocalDate event_data;
	@Enumerated(EnumType.STRING)
	private Event_enum event_type;
	private int max_partecipants;
	
	public Event() {
		
	}

	public Event(String title, LocalDate event_data, Event_enum event_type, int max_partecipants) {
		this.title = title;
		this.event_data = event_data;
		this.event_type = event_type;
		this.max_partecipants = max_partecipants;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public LocalDate getEvent_data() {
		return event_data;
	}

	public void setEvent_data(LocalDate event_data) {
		this.event_data = event_data;
	}

	public Event_enum getEvent_type() {
		return event_type;
	}

	public void setEvent_type(Event_enum event_type) {
		this.event_type = event_type;
	}

	public int getMax_partecipants() {
		return max_partecipants;
	}

	public void setMax_partecipants(int max_partecipants) {
		this.max_partecipants = max_partecipants;
	}

	public int getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Event [id=" + id + ", title=" + title + ", event_data=" + event_data + ", event_type=" + event_type
				+ ", max_partecipants=" + max_partecipants + "]";
	}

}
