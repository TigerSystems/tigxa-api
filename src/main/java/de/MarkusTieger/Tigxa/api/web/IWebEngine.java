package de.MarkusTieger.Tigxa.api.web;

import org.w3c.dom.Document;

public interface IWebEngine {

    void setZoom(double factor);

    void print();

    void load(String location);

    Document getDocument();

}
