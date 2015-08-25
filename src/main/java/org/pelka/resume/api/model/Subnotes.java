package org.pelka.resume.api.model;

import java.util.ArrayList;

import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Defines model for <strong>subnotes</strong> artifacts. Used for defining
 * content that will display at the bottom of a resume/CV.
 * 
 * @author arnoldpelka
 *
 */
@Document(collection = "subnotes")
public class Subnotes {
	private ArrayList<String> note;

	public ArrayList<String> getNote() {
		return note;
	}

	public void setNote(ArrayList<String> note) {
		this.note = note;
	}
}
