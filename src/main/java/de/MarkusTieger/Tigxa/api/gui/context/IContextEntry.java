package de.MarkusTieger.Tigxa.api.gui.context;

public interface IContextEntry {

    IContextEntry addEntry(String name, String actionId, boolean allowSubs);

    void addSeperator();

}
