package de.MarkusTieger.Tigxa.api.media;

public interface IMediaEngine {

    public int getMaxFrame();

    public int getFrame();

    public int getVolume();

    public void setVolume(int volume);

    public void pause();

    public void play();

    public void setFrame(int frame);

}
