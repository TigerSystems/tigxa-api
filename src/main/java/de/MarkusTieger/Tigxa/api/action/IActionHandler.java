package de.MarkusTieger.Tigxa.api.action;

import de.MarkusTieger.Tigxa.api.window.IWindow;

public interface IActionHandler {

    void onAction(IWindow window, String id);

}
