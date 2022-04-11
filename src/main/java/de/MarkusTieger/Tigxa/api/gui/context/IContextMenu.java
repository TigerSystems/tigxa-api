package de.MarkusTieger.Tigxa.api.gui.context;

import de.MarkusTieger.Tigxa.api.gui.IGUIWindow;

public interface IContextMenu extends IContextEntry {

    void show(IGUIWindow window, int x, int y);

}
