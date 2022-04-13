package de.MarkusTieger.Tigxa.api.gui.registry;

import de.MarkusTieger.Tigxa.api.gui.IScreen;

public interface IScreenRegistry {

    public IScreen getRegistredScreen(String namespace, String id);

    public IScreen registerScreen(IScreen screen, String id);

    public void unregisterScreen(String id);

}
