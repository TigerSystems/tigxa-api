package de.MarkusTieger.Tigxa.api.window;

import javax.swing.*;

public interface ITab {

    String getTitle();

    Icon getIcon();

    boolean isActive();

    void remove();

    TabType getType();

    default boolean isType(String name){
        return getType().name().equalsIgnoreCase(name);
    }

    IWindow getWindow();

}
