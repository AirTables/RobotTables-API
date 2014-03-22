package net.daboross.airtables.api.listeners;

import net.daboross.airtables.api.AirTable;
import net.daboross.airtables.api.TableType;

public interface ClientUpdateListener {

    /**
     * Fired when a table's type changes. Typically this happens when a remote client takes over publishing a table this client used to publish.
     * @param table Table who's type changed
     * @param oldType Type table is changing from
     * @param newType Type table is changing to
     */
    public void onTableChangeType(AirTable table, TableType oldType, TableType newType);

    /**
     * Fired when a new table is created. Note that this is fired for both local and remote tables.
     *
     * @param table New table created
     */
    public void onNewTable(AirTable table);
}
