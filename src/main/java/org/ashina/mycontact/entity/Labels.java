package org.ashina.mycontact.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

@Entity
@Table(name = "labels",schema="audit")
public class Labels implements Serializable {

	
	private static final long serialVersionUID = 1L;

	@GenericGenerator(name = "sequence", strategy = "sequence", parameters={@Parameter(name="sequence",value="audit.labels_seq_id")})
     @Id
     @GeneratedValue(generator = "sequence")
     @Column(name="label_id", unique=true, nullable=false)
	 private Integer labelId;
	 
	 @Column(name="label_name")
     private String labelName;
	 
	 @Column(name="label_text")
     private String labelText;
	 
	 @ManyToOne
	 @JoinColumn(name = "language_id",referencedColumnName="language_id")
	 private LanguagePackage languagePackage;

	public Integer getLabelId() {
		return labelId;
	}

	public void setLabelId(Integer labelId) {
		this.labelId = labelId;
	}

	public String getLabelName() {
		return labelName;
	}

	public void setLabelName(String labelName) {
		this.labelName = labelName;
	}

	public String getLabelText() {
		return labelText;
	}

	public void setLabelText(String labelText) {
		this.labelText = labelText;
	}

	

	public LanguagePackage getLanguagePackage() {
		return languagePackage;
	}

	public void setLanguagePackage(LanguagePackage languagePackage) {
		this.languagePackage = languagePackage;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((labelId == null) ? 0 : labelId.hashCode());
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
		Labels other = (Labels) obj;
		if (labelId == null) {
			if (other.labelId != null)
				return false;
		} else if (!labelId.equals(other.labelId))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Labels [labelId=" + labelId + ", labelName=" + labelName
				+ ", labelText=" + labelText + ", LanguagePackage="
				+ languagePackage + "]";
	}
	 
	 
	 
	 
	 
}
