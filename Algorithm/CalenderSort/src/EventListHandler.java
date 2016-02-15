import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class EventListHandler {

	private ObjectInputStream objIn; 
	
	public EventListHandler(){}
	
	public void EventListInputStream(String filename) throws IOException {
		FileInputStream fi = new FileInputStream(filename);
		this.objIn = new ObjectInputStream(fi);     
	}
	
	public StaticEventList readStaticEventList() {
		StaticEventList result = null; 
		try {
			result = (StaticEventList) this.objIn.readObject();
		} catch (ClassNotFoundException | IOException e) {
			e.printStackTrace();
		}
		
	    return result;
	}

}