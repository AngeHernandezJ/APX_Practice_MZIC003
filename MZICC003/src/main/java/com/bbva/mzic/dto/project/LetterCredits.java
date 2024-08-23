package com.bbva.mzic.dto.project;

import java.io.Serializable;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

/**
 * The LetterCredits class...
 */
public class LetterCredits implements Serializable  {
	private static final long serialVersionUID = 2931699728946643245L;

	/* Attributes section for the DTO */
	private String letter;
	private String reference;
	private int secuence;
	private List<Banks> banks;
	Costumer costumer;


	public String getLetter() {
		return this.letter;
	}
	public String getReference() {
		return this.reference;
	}
	public int getSecuence() {
		return this.secuence;
	}
	public List<Banks> getBanks() {
		return this.banks;
	}
	public Costumer getCostumer() {
		return this.costumer;
	}


	public void setLetter(final String letter) {
		this.letter = letter;
	}
	public void setReference(final String reference) {
		this.reference = reference;
	}
	public void setSecuence(final int secuence) {
		this.secuence = secuence;
	}
	public void setBanks(final List<Banks> banks) {
		this.banks = banks;
	}
	public void setCostumer(final Costumer costumer) {
		this.costumer = costumer;
	}

	/**
	 * Indicates whether some other object is "equal to" this one.
	 */
	@Override
	public boolean equals(final Object obj) {
		if (obj == null) { return false; }
		if (obj == this) { return true; }
		if (obj.getClass() != getClass()) {
			return false;
		}
		final LetterCredits rhs = (LetterCredits) obj;
		return new EqualsBuilder().appendSuper(super.equals(obj))
					.append(letter, rhs.letter)
					.append(reference, rhs.reference)
					.append(secuence, rhs.secuence)
					.append(banks, rhs.banks)
					.append(costumer, rhs.costumer)
					.isEquals();
	}

	/**
	 * Returns a hash code value for the object.
	 */
	@Override
	public int hashCode() {
		return new HashCodeBuilder()
			.append(this.letter)
			.append(this.reference)
			.append(this.secuence)
			.append(this.banks)
			.append(this.costumer)
			.toHashCode();
	}

	/**
	 * Returns a string representation of the object.
	 * It is important to OBFUSCATE the attributes that are sensitive to show in the representation.
	 */
	@Override
	public String toString() {
		return new ToStringBuilder(this)
			.append("Letter", letter)
			.append("Reference", reference)
			.append("Secuence", secuence)
			.append("Banks", banks)
			.append("Costumer", costumer)
			.toString();
	}
}
