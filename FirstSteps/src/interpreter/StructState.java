package interpreter;

import node.AStructStruct;

public class StructState {
	private AStructStruct struct = null;
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (constrCreated ? 1231 : 1237);
		result = prime * result + ((struct == null) ? 0 : struct.hashCode());
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
		StructState other = (StructState) obj;
		if (constrCreated != other.constrCreated)
			return false;
		if (struct == null) {
			if (other.struct != null)
				return false;
		} else if (!struct.equals(other.struct))
			return false;
		return true;
	}
	public StructState(AStructStruct struct) {
		super();
		this.struct = struct;
	}
	public boolean isConstrCreated() {
		return constrCreated;
	}
	public void setConstrCreated(boolean constrCreated) {
		this.constrCreated = constrCreated;
	}
	public AStructStruct getStruct() {
		return struct;
	}
	private boolean constrCreated = false;
}
