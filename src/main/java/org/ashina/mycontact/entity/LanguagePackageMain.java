package org.ashina.mycontact.entity;

import java.io.Serializable;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name = "language_package",schema="audit")
public class LanguagePackageMain implements Serializable {
	
	    private static final long serialVersionUID = 1L;
	   
	    @Id
	    @Basic(optional = false)
	    @Column(name = "package_id")
	    private Integer packageId;

	    @Basic(optional = false)
	    @Column(name = "package_name")
	    private String packageName;
	    
	    @Column(name = "package_identifier")
	    private String packageIdentifier;
	    
	    @JoinColumn(name = "language_id", referencedColumnName = "language_id")
		@ManyToOne
		private LanguagePackage languagePackage;

		public Integer getPackageId() {
			return packageId;
		}

		public void setPackageId(Integer packageId) {
			this.packageId = packageId;
		}

		public String getPackageName() {
			return packageName;
		}

		public void setPackageName(String packageName) {
			this.packageName = packageName;
		}

		public String getPackageIdentifier() {
			return packageIdentifier;
		}

		public void setPackageIdentifier(String packageIdentifier) {
			this.packageIdentifier = packageIdentifier;
		}

		public LanguagePackage getLanguagePackage() {
			return languagePackage;
		}

		public void setLanguagePackage(LanguagePackage languagePackage) {
			this.languagePackage = languagePackage;
		}
	    
	    
	    
	    
	    
	    

}
