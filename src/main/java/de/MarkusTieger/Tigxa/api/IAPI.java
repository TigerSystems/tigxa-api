package de.MarkusTieger.Tigxa.api;

import de.MarkusTieger.Tigxa.api.action.IActionHandler;
import de.MarkusTieger.Tigxa.api.event.IEventManager;
import de.MarkusTieger.Tigxa.api.gui.IGUIManager;
import de.MarkusTieger.Tigxa.api.permission.IPermissionManager;
import de.MarkusTieger.Tigxa.api.window.IWindowManager;

public interface IAPI {

    IWindowManager getWindowManager();

    IGUIManager getGUIManager();

    IActionHandler getActionHandler();

    IEventManager getEventManager();

    IPermissionManager getPermissionManager();
}
