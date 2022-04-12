package de.MarkusTieger.Tigxa.api.gui.context;

import de.MarkusTieger.Tigxa.api.window.IWindow;

public interface IContextMenu extends IContextEntry {

    void show(IWindow window, int x, int y);

}
