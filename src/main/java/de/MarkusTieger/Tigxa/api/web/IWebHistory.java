package de.MarkusTieger.Tigxa.api.web;

public interface IWebHistory {

    public boolean hasBackwards();

    public boolean hasForwards();

    public void backward();

    public void forward();

}
