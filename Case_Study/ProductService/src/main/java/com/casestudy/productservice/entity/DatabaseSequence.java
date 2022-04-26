package com.casestudy.productservice.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "database_sequences")
public class DatabaseSequence {

    @Id
    private String productId;

    private int seq;

	public DatabaseSequence() {
		super();
	}

	public DatabaseSequence(String productId, int seq) {
		super();
		this.productId = productId;
		this.seq = seq;
	}

	public String getId() {
		return productId;
	}

	public void setId(String productId) {
		this.productId =productId;
	}

	public int getSeq() {
		return seq;
	}

	public void setSeq(int seq) {
		this.seq = seq;
	}    
}