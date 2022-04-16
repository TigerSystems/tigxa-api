package de.MarkusTieger.Tigxa.api.media;

import de.MarkusTieger.Tigxa.api.web.IWebEngine;
import de.MarkusTieger.Tigxa.api.window.ITab;
import de.MarkusTieger.Tigxa.api.window.IWindow;

public interface IMediaManager {

    public IMediaEngine getEngineByTab(ITab tab);

    public IMediaEngine getEngineFromCurrentTab(IWindow window);

}
