package enums;

public enum Event_enum {
	PUBLIC("PUBLIC"),
	PRIVATE("PRIVATE");
	
	private String str;
	Event_enum(String string) {
		this.str = string;
	}
	public String getEventEnum() {
		return str;
	}

	
};
