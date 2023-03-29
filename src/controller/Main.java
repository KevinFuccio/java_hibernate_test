package controller;

import java.time.LocalDate;

import enums.Event_enum;
import model.Event;
import model.EventoDAO;

public class Main {

	public static void main(String[] args) {
		EventoDAO.save(new Event("DAJE ROMA DAJE",LocalDate.of(2023, 03, 31),Event_enum.PUBLIC.getEventEnum(),350));
	}

}
