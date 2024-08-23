package com.bbva.mzic.dto.project;

import java.io.Serializable;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

/**
 * The Banks class...
 */
public class Banks implements Serializable  {
	private static final long serialVersionUID = 2931699728946643245L;

    private int id;
    private String name;
    private String address;
    private List<Code> code;

    public String getId() {
		return this.letter;
	}
	public String getName() {
		return this.name;
	}
	public int getAddress() {
		return this.address;
	}
    public List<Code> getCode() {
        return this.code;
    }


    public void setId(final String id) {
		this.id = id;
	}
	public void setName(final String name) {
		this.name = name;
	}
	public void setAddress(final int address) {
		this.address = address;
	}
    public void setCode(final List<Code> code) {
        this.code = code;
    }


    @Override
	public boolean equals(final Object obj) {
		if (obj == null) { return false; }
		if (obj == this) { return true; }
		if (obj.getClass() != getClass()) {
			return false;
		}
		final Banks rhs = (Banks) obj;
		return new EqualsBuilder().appendSuper(super.equals(obj))
					.append(id, rhs.id)
                    .append(name, rhs.name)
                    .append(address, rhs.address)
                    .append(code, rhs.code)
					.isEquals();
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder()
			.append(this.id)
            .append(this.name)
            .append(this.address)
            .append(this.code)
			.toHashCode();
	}

	@Override
	public String toString() {
		return new ToStringBuilder(this)
			.append("ID", id)
            .append("Name", name)
            .append("Address" address)
            .append("Code", code)
			.toString();
	}
}
