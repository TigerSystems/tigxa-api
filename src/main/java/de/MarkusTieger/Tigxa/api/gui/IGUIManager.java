package de.MarkusTieger.Tigxa.api.gui;

import de.MarkusTieger.Tigxa.api.action.IActionHandler;
import de.MarkusTieger.Tigxa.api.gui.context.IContextMenu;
import de.MarkusTieger.Tigxa.api.gui.registry.IScreenRegistry;
import de.MarkusTieger.Tigxa.api.window.ITab;

public interface IGUIManager {

    IContextMenu createContextMenu(boolean fxthread, IActionHandler action);

    IScreen createScreen(String title, String location);

    IScreen getScreenByTab(ITab tab);

    public boolean verify(IScreen screen);

    IScreenRegistry getScreenRegistry();

}
