package org.pelka.resume.api.model;

import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Defines model for <strong>sections</strong> artifacts. Used for defining the
 * labels for sections within the body of a resume/CV.
 * 
 * @author arnoldpelka
 *
 */
@Document(collection = "sections")
public class Sections {
	private String[] section;

	public String[] getSection() {
		return section;
	}

	public void setSection(String[] section) {
		this.section = section;
	}
}
