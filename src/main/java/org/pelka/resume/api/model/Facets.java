package org.pelka.resume.api.model;

import java.util.ArrayList;
import java.util.Collection;

import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Defines model for <strong>facets</strong> artifacts. Used for defining
 * content that will display in bullets within the body of a resume/CV.
 * 
 * @author arnoldpelka
 *
 */
@Document(collection = "facets")
public class Facets {
	private String section;
	// All belong to highlights
	private ArrayList<Collection<Object>> highlights;
	private ArrayList<String> tagLines;
	private String job;
	private String loc;
	private String level;
	private String company;
	private String timeFrame;
	private ArrayList<Object> qualifiers;
	private ArrayList<String> inlineJob;
	private ArrayList<String> acheivements;

	public String getSection() {
		return section;
	}

	public void setSection(String section) {
		this.section = section;
	}

	public ArrayList<Collection<Object>> getHighlights() {
		return highlights;
	}

	public void setHighlights(ArrayList<Collection<Object>> highlights) {
		this.highlights = highlights;
	}

	public ArrayList<String> getTagLines() {
		return tagLines;
	}

	public void setTagLines(ArrayList<String> tagLines) {
		this.tagLines = tagLines;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public String getLoc() {
		return loc;
	}

	public void setLoc(String loc) {
		this.loc = loc;
	}

	public String getLevel() {
		return level;
	}

	public void setLevel(String level) {
		this.level = level;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getTimeFrame() {
		return timeFrame;
	}

	public void setTimeFrame(String timeFrame) {
		this.timeFrame = timeFrame;
	}

	public ArrayList<Object> getQualifiers() {
		return qualifiers;
	}

	public void setQualifiers(ArrayList<Object> qualifiers) {
		this.qualifiers = qualifiers;
	}

	public ArrayList<String> getInlineJob() {
		return inlineJob;
	}

	public void setInlineJob(ArrayList<String> inlineJob) {
		this.inlineJob = inlineJob;
	}

	public ArrayList<String> getAcheivements() {
		return acheivements;
	}

	public void setAcheivements(ArrayList<String> acheivements) {
		this.acheivements = acheivements;
	}

}
