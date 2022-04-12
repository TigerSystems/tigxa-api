package de.MarkusTieger.Tigxa.api.gui;

import javax.swing.*;
import java.util.function.Supplier;

public interface IScreen {

    public String getTitle();
    public String getLocation();

    public void setTitleSupplier(Supplier<String> supplier);
    public void setLocationSupplier(Supplier<String> supplier);

    public JPanel getContentPane();

}
