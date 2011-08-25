package com.codeller.model.impl;

import com.codeller.model.BusinessObject;
import com.codeller.model.Main;

/**
 * Implementation of business object which should be root for all versioned objects.
 * 
 * @author Orest Volkov
 * 
 */
public class BusinessObjectImpl extends BaseItem implements BusinessObject {


	/* (non-Javadoc)
	 * @see com.legalbistro.model.MainSnanpshot#getMain()
	 */
	@Override
	public Main getMain() {
		return main;
	}


	/* (non-Javadoc)
	 * @see com.legalbistro.model.MainSnanpshot#setMain(com.legalbistro.model.Main)
	 */
	@Override
	public void setMain(Main main) {
		this.main = main;
	}

	@Override
	public boolean equals(Object arg0) {
		// TODO write to be generic for each child
		return super.equals(arg0);
	}
	
	/** The main. */
	private Main main;
}
