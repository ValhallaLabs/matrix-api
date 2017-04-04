package ua.softgroup.matrix.api.model.datamodels;

import java.io.Serializable;
import java.util.LinkedHashSet;

/**
 * @author Vadim Boitsov <sg.vadimbojcov@gmail.com>
 */
public class SynchronizationModel implements Serializable, DataModel {
    private static final long serialVersionUID = 1L;

    private LinkedHashSet<CheckPointModel> checkPointModels;

    public SynchronizationModel(LinkedHashSet<CheckPointModel> checkPointModels) {
        this.checkPointModels = checkPointModels;
    }

    public LinkedHashSet<CheckPointModel> getCheckPointModels() {
        return checkPointModels;
    }

    public void setCheckPointModels(LinkedHashSet<CheckPointModel> checkPointModels) {
        this.checkPointModels = checkPointModels;
    }

    @Override
    public String toString() {
        return "SynchronizationModel{" +
                "checkPointModels=" + checkPointModels +
                '}';
    }
}
