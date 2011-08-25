package com.codeller.model;

/**
 * Interface MentionableUser describes user's feedbacks
 * 
 * @author Orest Volkov
 * 
 */

public interface MentionableUser<P extends PersonalInfo, C extends ContactInfo, L extends LoginInfo, B extends BusinessInfo, F extends FeedBack>
		extends User<P, C, L, B>, Mentionable<F> {

}
