package de.MarkusTieger.Tigxa.api.gui;

import de.MarkusTieger.Tigxa.api.action.IActionHandler;
import de.MarkusTieger.Tigxa.api.gui.context.IContextMenu;

public interface IGUIManager {

    IContextMenu createContextMenu(boolean fxthread, IActionHandler action);

}
