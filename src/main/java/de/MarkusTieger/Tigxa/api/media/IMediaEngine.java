package de.MarkusTieger.Tigxa.api.media;

import de.MarkusTieger.Tigxa.api.engine.IEngine;

public interface IMediaEngine extends IEngine {

    public int getMaxFrame();

    public int getFrame();

    public int getVolume();

    public void setVolume(int volume);

    public void pause();

    public void play();

    public void setFrame(int frame);

    public void load(String mrl);

}
