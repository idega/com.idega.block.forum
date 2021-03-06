/*
 * Created on Oct 8, 2004
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package com.idega.block.forum.presentation;

import com.idega.idegaweb.IWBundle;
import com.idega.idegaweb.IWResourceBundle;
import com.idega.presentation.Image;

/**
 * @author Anna
 */
public class ThreadNewLink extends TopicLink {
	
	private Image iImage;

	public boolean hasPermission() {
		return hasAddPermission();
	}

	public String getLinkName(IWResourceBundle resourceBundle) {
		return resourceBundle.getLocalizedString("new_thread", "New thread");
	}

	public Image getLinkImage(IWBundle bundle) {
		if (this.iImage != null) {
			return this.iImage;
		}
		else {
			return bundle.getImage("shared/new.gif");
		}
	}

	public Class getWindowClassToOpen() {
		return ForumThreadEditor.class;
	}

	public boolean addTopicIDToLink() {
		return true;
	}

	public String getState() {
		return null;
	}
	
	public void setImage(Image image) {
		this.iImage = image;
	}
}