package de.MarkusTieger.Tigxa.api.web;

public interface IWebHistory {

    public boolean hasBackwards();

    public boolean hasForwards();

    public int getCurrentIndex();

    public String get(int index);

    public String go(int index);

}
