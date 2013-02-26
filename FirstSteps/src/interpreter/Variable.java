package interpreter;

public class Variable {
	@Override
	public String toString() {
		return "Variable [id=" + id + ", type=" + type + ", used=" + used
				+ ", initialized=" + initialized + "]";
	}

	private String id;
	private String type;
	private boolean used = false;
	public boolean isInitialized() {
		return initialized;
	}

	public void setInitialized(boolean initialized) {
		this.initialized = initialized;
	}

	private boolean initialized = false;

	public Variable(String id) {
		super();
		this.id = id;
	}

	public Variable(String id, String type) {
		super();
		this.id = id;
		this.type = type;
		this.used = false;
	}

	public Variable(String id, String type, boolean used) {
		super();
		this.id = id;
		this.type = type;
		this.used = used;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public boolean isUsed() {
		return used;
	}

	public void setUsed(boolean used) {
		this.used = used;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + (initialized ? 1231 : 1237);
		result = prime * result + ((type == null) ? 0 : type.hashCode());
		result = prime * result + (used ? 1231 : 1237);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Variable other = (Variable) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (initialized != other.initialized)
			return false;
		if (type == null) {
			if (other.type != null)
				return false;
		} else if (!type.equals(other.type))
			return false;
		if (used != other.used)
			return false;
		return true;
	}

	public void Use() {
		used = true;
	}

	public void initialize() {
		initialized = true;
	}
}
