import java.io.Serializable;


public class StaticEvent implements CalendarEvent, Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String name;
	private Slot slot;
	private boolean isStatic;
	private boolean isPeriodic;
	private boolean isFinished;
	private String comment = "";

	
public StaticEvent(String name, Slot slot, boolean isStatic, boolean isPeriodic, boolean isFinished, String comment) throws CalendarError {
		
		if (name == "")
			throw new CalendarError("Invalid Event Name");
		if (slot == null){
			throw new CalendarError("Invalid time");
		}
			
		this.setName(name);
		this.setStatic(isStatic);
		this.setComment(comment);
		this.setFinished(isFinished);
		this.setPeriodic(isPeriodic);
		this.setSlot(slot);
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Slot getSlot() {
		return slot;
	}

	public void setSlot(Slot slot) {
		this.slot = slot;
	}

	public boolean isStatic() {
		return isStatic;
	}

	public void setStatic(boolean isStatic) {
		this.isStatic = isStatic;
	}

	public boolean isPeriodic() {
		return isPeriodic;
	}

	public void setPeriodic(boolean isPeriodic) {
		this.isPeriodic = isPeriodic;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public boolean isFinished() {
		return isFinished;
	}

	public void setFinished(boolean isFinished) {
		this.isFinished = isFinished;
	}

	
}