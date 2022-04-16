package de.MarkusTieger.Tigxa.api.web;

import de.MarkusTieger.Tigxa.api.engine.IEngine;
import org.w3c.dom.Document;

public interface IWebEngine extends IEngine {

    void setZoom(double factor);

    void print();

    void load(String location);

    Document getDocument();

    Object executeScript(String script);

    IWebHistory getHistory();

    void loadContent(String content, String type);

    void reload();

    String getLocation();

}
