package org.ashina.mycontact.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "language",schema="audit")
public class LanguagePackage implements Serializable{

	
	private static final long serialVersionUID = 1L;
	
    @Id
    @Column(name = "language_id", nullable = false)
    private Integer languageId;

    @Basic(optional = false)
    @Column(name = "resource_id", nullable = false, length = 100)
    private String resourceName;
	
    @Basic(optional = false)
    @Column(name = "language_identifier", nullable = false)
    private String languageIdentifier;
   
   /* @Column(name = "package_identifier", length = 2)
    private String packageIdentifier;*/
    
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "languagePackage")
	private List<LanguagePackageMain> languagePackageMainList;

	public Integer getLanguageId() {
		return languageId;
	}

	public void setLanguageId(Integer languageId) {
		this.languageId = languageId;
	}

	public String getResourceName() {
		return resourceName;
	}

	public void setResourceName(String resourceName) {
		this.resourceName = resourceName;
	}

	public String getLanguageIdentifier() {
		return languageIdentifier;
	}

	public void setLanguageIdentifier(String languageIdentifier) {
		this.languageIdentifier = languageIdentifier;
	}

	/*public String getPackageIdentifier() {
		return packageIdentifier;
	}

	public void setPackageIdentifier(String packageIdentifier) {
		this.packageIdentifier = packageIdentifier;
	}*/

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((languageId == null) ? 0 : languageId.hashCode());
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
		LanguagePackage other = (LanguagePackage) obj;
		if (languageId == null) {
			if (other.languageId != null)
				return false;
		} else if (!languageId.equals(other.languageId))
			return false;
		return true;
	}

	public List<LanguagePackageMain> getLanguagePackageMainList() {
		return languagePackageMainList;
	}

	public void setLanguagePackageMainList(List<LanguagePackageMain> languagePackageMainList) {
		this.languagePackageMainList = languagePackageMainList;
	}
    
	
	
}
