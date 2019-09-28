
public abstract class Namirnica extends Energent{

	private String ime;
	private int id;
	public static int globalId = 0;

	public Namirnica(String ime) {
		super();
		this.ime = ime;
		id = globalId;
		globalId++;
	}

	public String getIme() {
		return ime;
	}
	public int getId() {
		return id;
	}

	public String toString(){
		StringBuilder sb = new StringBuilder();
		sb.append("[" + Integer.toString(id) + "]").append(ime);
		return sb.toString();
	}
}
