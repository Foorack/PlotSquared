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

public class MongoDB implements AbstractDB {

    public void setOwner(Plot plot, UUID uuid) {
        throw new UnsupportedOperationException();
    }

    public void createPlotsAndData(List<Plot> plots, Runnable whenDone) {
        throw new UnsupportedOperationException();
    }

    public void createPlotSafe(final Plot plot, final Runnable success, final Runnable failure) {
        throw new UnsupportedOperationException();
    }

    public void createTables() throws Exception {
        throw new UnsupportedOperationException();
    }

    public void delete(Plot plot) {
        throw new UnsupportedOperationException();
    }

    public void deleteSettings(Plot plot) {
        throw new UnsupportedOperationException();
    }

    public void deleteHelpers(Plot plot) {
        throw new UnsupportedOperationException();
    }

    public void deleteTrusted(Plot plot) {
        throw new UnsupportedOperationException();
    }

    public void deleteDenied(Plot plot) {
        throw new UnsupportedOperationException();
    }

    public void deleteComments(Plot plot) {
        throw new UnsupportedOperationException();
    }

    public void deleteRatings(Plot plot) {
        throw new UnsupportedOperationException();
    }

    public void delete(PlotCluster cluster) {
        throw new UnsupportedOperationException();
    }

    public void addPersistentMeta(UUID uuid, String key, byte[] meta, boolean delete) {
        throw new UnsupportedOperationException();
    }

    public void removePersistentMeta(UUID uuid, String key) {
        throw new UnsupportedOperationException();
    }

    public void getPersistentMeta(UUID uuid, RunnableVal<Map<String, byte[]>> result) {
        throw new UnsupportedOperationException();
    }

    public void createPlotSettings(int id, Plot plot) {
        throw new UnsupportedOperationException();
    }

    public int getId(Plot plot) {
        throw new UnsupportedOperationException();
    }

    public int getClusterId(PlotCluster cluster) {
        throw new UnsupportedOperationException();
    }

    public HashMap<String, HashMap<PlotId, Plot>> getPlots() {
        throw new UnsupportedOperationException();
    }

    public void validateAllPlots(Set<Plot> toValidate) {
        throw new UnsupportedOperationException();
    }

    public HashMap<String, Set<PlotCluster>> getClusters() {
        throw new UnsupportedOperationException();
    }

    public void setMerged(Plot plot, boolean[] merged) {
        throw new UnsupportedOperationException();
    }

    public void swapPlots(Plot plot1, Plot plot2) {
        throw new UnsupportedOperationException();
    }

    public void setFlags(Plot plot, HashMap<Flag<?>, Object> flags) {
        throw new UnsupportedOperationException();
    }

    public void setFlags(PlotCluster cluster, HashMap<Flag<?>, Object> flags) {
        throw new UnsupportedOperationException();
    }

    public void setClusterName(PlotCluster cluster, String name) {
        throw new UnsupportedOperationException();
    }

    public void setAlias(Plot plot, String alias) {
        throw new UnsupportedOperationException();
    }

    public void purgeIds(Set<Integer> uniqueIds) {
        throw new UnsupportedOperationException();
    }

    public void purge(PlotArea area, Set<PlotId> plotIds) {
        throw new UnsupportedOperationException();
    }

    public void setPosition(Plot plot, String position) {
        throw new UnsupportedOperationException();
    }

    public void setPosition(PlotCluster cluster, String position) {
        throw new UnsupportedOperationException();
    }

    public void removeTrusted(Plot plot, UUID uuid) {
        throw new UnsupportedOperationException();
    }

    public void removeHelper(PlotCluster cluster, UUID uuid) {
        throw new UnsupportedOperationException();
    }

    public void removeMember(Plot plot, UUID uuid) {
        throw new UnsupportedOperationException();
    }

    public void removeInvited(PlotCluster cluster, UUID uuid) {
        throw new UnsupportedOperationException();
    }

    public void setTrusted(Plot plot, UUID uuid) {
        throw new UnsupportedOperationException();
    }

    public void setHelper(PlotCluster cluster, UUID uuid) {
        throw new UnsupportedOperationException();
    }

    public void setMember(Plot plot, UUID uuid) {
        throw new UnsupportedOperationException();
    }

    public void setInvited(PlotCluster cluster, UUID uuid) {
        throw new UnsupportedOperationException();
    }

    public void removeDenied(Plot plot, UUID uuid) {
        throw new UnsupportedOperationException();
    }

    public void setDenied(Plot plot, UUID uuid) {
        throw new UnsupportedOperationException();
    }

    public HashMap<UUID, Integer> getRatings(Plot plot) {
        throw new UnsupportedOperationException();
    }

    public void setRating(Plot plot, UUID rater, int value) {
        throw new UnsupportedOperationException();
    }

    public void removeComment(Plot plot, PlotComment comment) {
        throw new UnsupportedOperationException();
    }

    public void clearInbox(Plot plot, String inbox) {
        throw new UnsupportedOperationException();
    }

    public void setComment(Plot plot, PlotComment comment) {
        throw new UnsupportedOperationException();
    }

    public void getComments(Plot plot, String inbox, RunnableVal<List<PlotComment>> whenDone) {
        throw new UnsupportedOperationException();
    }

    public void createPlotAndSettings(Plot plot, Runnable whenDone) {
        throw new UnsupportedOperationException();
    }

    public void createCluster(PlotCluster cluster) {
        throw new UnsupportedOperationException();
    }

    public void resizeCluster(PlotCluster current, PlotId min, PlotId max) {
        throw new UnsupportedOperationException();
    }

    public void movePlot(Plot originalPlot, Plot newPlot) {
        throw new UnsupportedOperationException();
    }

    public void replaceUUID(UUID old, UUID now) {
        throw new UnsupportedOperationException();
    }

    public boolean deleteTables() {
        throw new UnsupportedOperationException();
    }

    public void close() {
        throw new UnsupportedOperationException();
    }

    public void replaceWorld(String oldWorld, String newWorld, PlotId min, PlotId max) {
        throw new UnsupportedOperationException();
    }

    public void updateTables(int[] oldVersion) {
        throw new UnsupportedOperationException();
    }
}
