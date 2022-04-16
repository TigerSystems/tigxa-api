package de.MarkusTieger.Tigxa.api.window;

import de.MarkusTieger.Tigxa.api.gui.IScreen;

import java.util.List;

public interface IWindow {

    ITab add(String url, boolean autoselect);

    ITab addMedia(String mrl, boolean autoselect);

    ITab add(IScreen screen);

    List<ITab> listTabs();

    void remove();

    boolean isActive();

    ITab getSelectedTab();

    ITab setSelectedTab(ITab tab);

}
