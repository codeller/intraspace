package com.codeller.model;

import java.util.List;

public interface Mentionable<F extends FeedBack> {
	/**
	 * Method is used to determine all user's feedbacks
	 * 
	 * @return List<FeedBack> -all user's feedbacks
	 */
	List<F> getFeedBacks();

	/**
	 * Method is used to specify list of feedbacks to the certain user
	 * 
	 * @param feedBacks list of feedbacks to the certain user
	 */
	void setFeedBacks(List<F> feedBacks);

	/**
	 * Method is used to add a feedback to the list of user's feedback
	 * 
	 * @param feedBack list of feedbacks to the certain user
	 */
	void addFeedBack(F feedBack);
}
