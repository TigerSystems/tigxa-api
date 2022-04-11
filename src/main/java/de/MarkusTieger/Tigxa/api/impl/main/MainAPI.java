package de.MarkusTieger.Tigxa.api.impl.main;

import de.MarkusTieger.Tigxa.api.IAPI;
import de.MarkusTieger.Tigxa.api.action.IActionHandler;
import de.MarkusTieger.Tigxa.api.event.IEventManager;
import de.MarkusTieger.Tigxa.api.gui.IGUIManager;
import de.MarkusTieger.Tigxa.api.impl.main.gui.MainGuiManager;
import de.MarkusTieger.Tigxa.api.impl.main.gui.window.MainWindowManager;
import de.MarkusTieger.Tigxa.api.permission.IPermissionManager;
import de.MarkusTieger.Tigxa.api.window.IWindowManager;

import java.io.File;

public class MainAPI implements IAPI {

    private final IWindowManager window;
    private final IGUIManager gui;

    public MainAPI(File configRoot) {
        window = new MainWindowManager(this, configRoot);
        gui = new MainGuiManager();
    }

    @Override
    public IWindowManager getWindowManager() {
        return window;
    }

    @Override
    public IEventManager getEventManager() {
        return null;
    }

    @Override
    public IGUIManager getGUIManager() {
        return gui;
    }

    @Override
    public IActionHandler getActionHandler() {
        return null;
    }

    @Override
    public IPermissionManager getPermissionManager() {
        return null;
    }
}
