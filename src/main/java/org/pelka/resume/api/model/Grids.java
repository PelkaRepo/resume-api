package org.pelka.resume.api.model;

import java.util.ArrayList;
import java.util.Collection;

import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Defines model for <strong>grids</strong> artifacts. Used for defining content
 * that will display within a grid in the body of a resume/CV.
 * 
 * @author arnoldpelka
 *
 */
@Document(collection = "grids")
public class Grids {
	private String section;
	private String categories;
	// All belong to skills
	private ArrayList<Collection<Object>> skills;
	private ArrayList<String> rows;

	public String getSection() {
		return section;
	}

	public void setSection(String section) {
		this.section = section;
	}

	public String getCategories() {
		return categories;
	}

	public void setCategories(String categories) {
		this.categories = categories;
	}

	public ArrayList<Collection<Object>> getSkills() {
		return skills;
	}

	public void setSkills(ArrayList<Collection<Object>> skills) {
		this.skills = skills;
	}

	public ArrayList<String> getRows() {
		return rows;
	}

	public void setRows(ArrayList<String> rows) {
		this.rows = rows;
	}
}
