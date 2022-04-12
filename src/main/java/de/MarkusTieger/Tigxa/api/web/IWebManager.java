package de.MarkusTieger.Tigxa.api.web;

import de.MarkusTieger.Tigxa.api.window.ITab;
import de.MarkusTieger.Tigxa.api.window.IWindow;

public interface IWebManager {

    public IWebEngine getEngineByTab(ITab tab);

    public IWebEngine getEngineFromCurrentTab(IWindow window);
}
