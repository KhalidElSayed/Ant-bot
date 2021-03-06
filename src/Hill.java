public abstract class Hill {
	private Field field;

	public Hill(Field field) {
		this.field = field;
		field.setHill(this);
	}

	public abstract int getOwner();

	public int getX() {
		return this.field.getX();
	}

	public int getY() {
		return this.field.getY();
	}

	public Field getField() {
		return this.field;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((field == null) ? 0 : field.hashCode());
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
		Hill other = (Hill) obj;
		if (field == null) {
			if (other.field != null)
				return false;
		} else if (!field.equals(other.field))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Hill at " + this.field;
	}
}
