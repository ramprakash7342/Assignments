package com.casestudy.profileservice.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "database_sequences")
public class DatabaseSequence {

    @Id
    private String profileId;

    private int seq;

	public DatabaseSequence() {
		super();
	}

	public DatabaseSequence(String profileId, int seq) {
		super();
		this.profileId =profileId;
		this.seq = seq;
	}

	public String getId() {
		return profileId;
	}

	public void setId(String profileId) {
		this.profileId =profileId;
	}

	public int getSeq() {
		return seq;
	}

	public void setSeq(int seq) {
		this.seq = seq;
	}    
}