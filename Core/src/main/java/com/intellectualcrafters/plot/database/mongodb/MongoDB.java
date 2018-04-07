package com.intellectualcrafters.plot.database.mongodb;

import com.intellectualcrafters.plot.database.AbstractDB;
import com.intellectualcrafters.plot.flag.Flag;
import com.intellectualcrafters.plot.object.Plot;
import com.intellectualcrafters.plot.object.PlotArea;
import com.intellectualcrafters.plot.object.PlotCluster;
import com.intellectualcrafters.plot.object.PlotId;
import com.intellectualcrafters.plot.object.RunnableVal;
import com.intellectualcrafters.plot.object.comment.PlotComment;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;

/**
 * MongoDB database implementation.
 *
 * For MongoDB terminology compared to MySQL:
 * https://www.mongodb.com/compare/mongodb-mysql
 */
public class MongoDB implements AbstractDB {

    private final String host;
    private final String prefix;
    private final String port;
    private final String user;
    private final String password;
    private final boolean ssl;

    public MongoDB(String host, String prefix, String port, String user, String password, boolean ssl) {
        this.host = host;
        this.prefix = prefix;
        this.port = port;
        this.user = user;
        this.password = password;
        this.ssl = ssl;
    }

    @Override
    public void setOwner(Plot plot, UUID uuid) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void createPlotsAndData(List<Plot> plots, Runnable whenDone) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void createPlotSafe(final Plot plot, final Runnable success, final Runnable failure) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void createTables() throws Exception {
        // Do nothing. MongoDB creates collections automatically on first insert.
    }

    @Override
    public void delete(Plot plot) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void deleteSettings(Plot plot) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void deleteHelpers(Plot plot) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void deleteTrusted(Plot plot) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void deleteDenied(Plot plot) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void deleteComments(Plot plot) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void deleteRatings(Plot plot) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void delete(PlotCluster cluster) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void addPersistentMeta(UUID uuid, String key, byte[] meta, boolean delete) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void removePersistentMeta(UUID uuid, String key) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void getPersistentMeta(UUID uuid, RunnableVal<Map<String, byte[]>> result) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void createPlotSettings(int id, Plot plot) {
        throw new UnsupportedOperationException();
    }

    @Override
    public int getId(Plot plot) {
        throw new UnsupportedOperationException();
    }

    @Override
    public int getClusterId(PlotCluster cluster) {
        throw new UnsupportedOperationException();
    }

    @Override
    public HashMap<String, HashMap<PlotId, Plot>> getPlots() {
        throw new UnsupportedOperationException();
    }

    @Override
    public void validateAllPlots(Set<Plot> toValidate) {
        throw new UnsupportedOperationException();
    }

    @Override
    public HashMap<String, Set<PlotCluster>> getClusters() {
        throw new UnsupportedOperationException();
    }

    @Override
    public void setMerged(Plot plot, boolean[] merged) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void swapPlots(Plot plot1, Plot plot2) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void setFlags(Plot plot, HashMap<Flag<?>, Object> flags) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void setFlags(PlotCluster cluster, HashMap<Flag<?>, Object> flags) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void setClusterName(PlotCluster cluster, String name) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void setAlias(Plot plot, String alias) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void purgeIds(Set<Integer> uniqueIds) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void purge(PlotArea area, Set<PlotId> plotIds) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void setPosition(Plot plot, String position) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void setPosition(PlotCluster cluster, String position) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void removeTrusted(Plot plot, UUID uuid) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void removeHelper(PlotCluster cluster, UUID uuid) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void removeMember(Plot plot, UUID uuid) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void removeInvited(PlotCluster cluster, UUID uuid) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void setTrusted(Plot plot, UUID uuid) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void setHelper(PlotCluster cluster, UUID uuid) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void setMember(Plot plot, UUID uuid) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void setInvited(PlotCluster cluster, UUID uuid) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void removeDenied(Plot plot, UUID uuid) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void setDenied(Plot plot, UUID uuid) {
        throw new UnsupportedOperationException();
    }

    @Override
    public HashMap<UUID, Integer> getRatings(Plot plot) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void setRating(Plot plot, UUID rater, int value) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void removeComment(Plot plot, PlotComment comment) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void clearInbox(Plot plot, String inbox) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void setComment(Plot plot, PlotComment comment) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void getComments(Plot plot, String inbox, RunnableVal<List<PlotComment>> whenDone) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void createPlotAndSettings(Plot plot, Runnable whenDone) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void createCluster(PlotCluster cluster) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void resizeCluster(PlotCluster current, PlotId min, PlotId max) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void movePlot(Plot originalPlot, Plot newPlot) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void replaceUUID(UUID old, UUID now) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean deleteTables() {
        throw new UnsupportedOperationException();
    }

    @Override
    public void close() {
        throw new UnsupportedOperationException();
    }

    @Override
    public void replaceWorld(String oldWorld, String newWorld, PlotId min, PlotId max) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void updateTables(int[] oldVersion) {
        // Do nothing. No previous data-structure versions exists with MongoDB yet.
    }
}
