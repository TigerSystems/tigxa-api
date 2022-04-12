package de.MarkusTieger.Tigxa.api;

import de.MarkusTieger.Tigxa.api.action.IActionHandler;
import de.MarkusTieger.Tigxa.api.event.IEventManager;
import de.MarkusTieger.Tigxa.api.gui.IGUIManager;
import de.MarkusTieger.Tigxa.api.permission.IPermissionManager;
import de.MarkusTieger.Tigxa.api.web.IWebManager;
import de.MarkusTieger.Tigxa.api.window.IWindowManager;
import de.MarkusTieger.Tigxa.extension.IExtension;

public interface IAPI {

    IWindowManager getWindowManager();

    IGUIManager getGUIManager();

    IActionHandler getActionHandler();

    IEventManager getEventManager();

    IWebManager getWebManager();

    IPermissionManager getPermissionManager();

    IExtension getExtension();
}
