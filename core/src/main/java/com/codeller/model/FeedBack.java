package com.codeller.model;

/**
 * Interface Feedback describes user's feedback
 * 
 * @author Orest Volkov
 * 
 */
public interface FeedBack<U extends User,I extends Info> extends Post<U,I> {
	/**
	 * Method is used to determine users's feedback to smth (ex. case, offer) Could be: POZITIVE, NEGATIVE
	 * 
	 * @return FeedbackType users's feedback
	 */
	FeedbackType getFeedbackType();

	/**
	 * Method is used to specify user's feedback Could be: POZITIVE, NEGATIVE
	 * 
	 * @param feedbackType FeedbackType - users's feedback
	 */
	void setFeedbackType(FeedbackType feedbackType);

}
