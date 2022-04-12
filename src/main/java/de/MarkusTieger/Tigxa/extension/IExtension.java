package de.MarkusTieger.Tigxa.extension;

import de.MarkusTieger.Tigxa.api.event.IEventHandler;
import de.MarkusTieger.Tigxa.api.gui.IGUIWindow;

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

    void onAction(IGUIWindow window, int relativeX, int relativeY, int absoluteX, int absoluteY);

    void onAction(IGUIWindow window, String id);

}
