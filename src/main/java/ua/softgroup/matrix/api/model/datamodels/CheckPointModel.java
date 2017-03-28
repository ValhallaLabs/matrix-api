package ua.softgroup.matrix.api.model.datamodels;

import java.io.Serializable;
import java.util.Set;

/**
 * @author Vadim Boitsov <sg.vadimbojcov@gmail.com>
 */
public class CheckPointModel implements Serializable, DataModel {
    private static final long serialVersionUID = 1L;

    private long order; // just an order of checkpoint

    private byte[] screenshot;

    private String keyboardLogs;

    private double mouseFootage;

    private Set<ActiveWindowModel> activeWindows;

    private int idleTime;

    public CheckPointModel(long order, byte[] screenshot, String keyboardLogs,
                           double mouseFootage, Set<ActiveWindowModel> activeWindows, int idleTime) {
        this.order = order;
        this.screenshot = screenshot;
        this.keyboardLogs = keyboardLogs;
        this.mouseFootage = mouseFootage;
        this.activeWindows = activeWindows;
        this.idleTime = idleTime;
    }

    public long getOrder() {
        return order;
    }

    public void setOrder(long order) {
        this.order = order;
    }

    public byte[] getScreenshot() {
        return screenshot;
    }

    public void setScreenshot(byte[] screenshot) {
        this.screenshot = screenshot;
    }

    public String getKeyboardLogs() {
        return keyboardLogs;
    }

    public void setKeyboardLogs(String keyboardLogs) {
        this.keyboardLogs = keyboardLogs;
    }

    public double getMouseFootage() {
        return mouseFootage;
    }

    public void setMouseFootage(double mouseFootage) {
        this.mouseFootage = mouseFootage;
    }

    public Set<ActiveWindowModel> getActiveWindows() {
        return activeWindows;
    }

    public void setActiveWindows(Set<ActiveWindowModel> activeWindows) {
        this.activeWindows = activeWindows;
    }

    public int getIdleTime() {
        return idleTime;
    }

    public void setIdleTime(int idleTime) {
        this.idleTime = idleTime;
    }

    @Override
    public String toString() {
        return "CheckPointModel{" +
                "order=" + order +
                ", screenshot=" + (screenshot != null) +
                ", keyboardLogs='" + keyboardLogs + '\'' +
                ", mouseFootage=" + mouseFootage +
                ", activeWindows=" + activeWindows +
                ", idleTime=" + idleTime +
                '}';
    }
}
