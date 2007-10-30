/*
 * $Id: ForumLayoutHandler.java,v 1.6 2007/10/30 10:24:36 gimmi Exp $
 *
 * Copyright (C) 2001 Idega hf. All Rights Reserved.
 *
 * This software is the proprietary information of Idega hf.
 * Use is subject to license terms.
 *
 */
package com.idega.block.forum.business;

import java.util.List;

import com.idega.core.builder.presentation.ICPropertyHandler;
import com.idega.presentation.IWContext;
import com.idega.presentation.PresentationObject;
import com.idega.presentation.ui.DropdownMenu;

/**
 * @author <a href="tryggvi@idega.is">Tryggvi Larusson</a>
 * @version 1.0
 */
public class ForumLayoutHandler implements ICPropertyHandler {
  /**
   *
   */
  public ForumLayoutHandler() {
  }

  /**
   *
   */
  public List getDefaultHandlerTypes() {
    return(null);
  }

  /**
   *
   */
  public PresentationObject getHandlerObject(String name, String value, IWContext iwc, boolean oldGenerationHandler, String instanceId, String method) {
    DropdownMenu menu = new DropdownMenu(name);
    menu.addMenuElement("","Select:");
    menu.addMenuElement(ForumBusiness.FORUM_TOPICS,"Topics view");
    menu.addMenuElement(ForumBusiness.FORUM_COLLECTION,"Thread collection");
    menu.addMenuElement(ForumBusiness.TOPIC_COLLECTION,"Topic collection");
    menu.setSelectedElement(value);
    return(menu);
  }

  /**
   *
   */
  public void onUpdate(String values[], IWContext iwc) {
  }

	public PresentationObject getHandlerObject(String name, String stringValue, IWContext iwc) {
		return getHandlerObject(name, stringValue, iwc, false, null, null);
	}
}
