package de.MarkusTieger.Tigxa.api.window;

import javax.swing.*;

public interface ITab {

    String getTitle();

    Icon getIcon();

    boolean isActive();

    void remove();

    void setZoom(double factor);

    void print();
}
