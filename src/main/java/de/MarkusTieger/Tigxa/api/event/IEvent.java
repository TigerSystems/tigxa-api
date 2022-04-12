package de.MarkusTieger.Tigxa.api.event;

import de.MarkusTieger.Tigxa.api.permission.Permission;

public interface IEvent {

    public String getName();

    public Permission[] getRequiredPermissions();

}
