package com.codeller.model.impl;

import javax.persistence.Column;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.MappedSuperclass;

import com.codeller.model.FeedBack;
import com.codeller.model.FeedbackType;
import com.codeller.model.Info;
import com.codeller.model.User;

/**
 * Implementation of FeedBack interface
 * 
 * @author Orest Volkov
 * 
 * @param <A>
 *            - author
 * @param <I>
 *            - info
 */
@MappedSuperclass
public class FeedBackImpl<A extends User, I extends Info> extends
		PostImpl<A, I> implements FeedBack<A, I> {
	private FeedbackType feedbackType;

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.legalbistro.model.FeedBack#getFeedbackType()
	 */
	@Enumerated(EnumType.STRING)
	@Column(name = "feedback_type")
	public FeedbackType getFeedbackType() {
		return this.feedbackType;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.legalbistro.model.FeedBack#setFeedbackType(com.legalbistro.model.
	 * FeedbackType)
	 */
	public void setFeedbackType(FeedbackType feedbackType) {
		this.feedbackType = feedbackType;
	}
}
