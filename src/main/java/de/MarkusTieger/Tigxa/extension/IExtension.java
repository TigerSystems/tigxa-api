package de.MarkusTieger.Tigxa.extension;

import de.MarkusTieger.Tigxa.api.event.IEventHandler;
import de.MarkusTieger.Tigxa.api.window.IWindow;

import java.awt.*;

public interface IExtension extends IEventHandler {

    String getName();

    String getVersion();

    String[] getAuthors();

    Image getIcon();

    Image getDarkIcon();

    void onLoad();

    void onEnable();

    void onDisable();

    void onAction(IWindow window, int relativeX, int relativeY, int absoluteX, int absoluteY);

    void onAction(IWindow window, String id);

}
