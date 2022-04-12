package de.MarkusTieger.Tigxa.api.event;

public interface IEventManager {

    public void registerListener(IEventHandler listener);

    public void unregisterListener(IEventHandler listener);

    public IEventHandler[] getListeners();

}
