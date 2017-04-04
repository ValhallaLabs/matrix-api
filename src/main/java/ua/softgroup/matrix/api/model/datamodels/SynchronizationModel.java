package ua.softgroup.matrix.api.model.datamodels;

import java.io.Serializable;
import java.util.Set;

/**
 * @author Vadim Boitsov <sg.vadimbojcov@gmail.com>
 */
public class SynchronizationModel implements Serializable, DataModel {
    private static final long serialVersionUID = 1L;

    private Set<CheckPointModel> checkPointModels;

    public SynchronizationModel(Set<CheckPointModel> checkPointModels, long idleTime) {
        this.checkPointModels = checkPointModels;
    }

    public Set<CheckPointModel> getCheckPointModels() {
        return checkPointModels;
    }

    public void setCheckPointModels(Set<CheckPointModel> checkPointModels) {
        this.checkPointModels = checkPointModels;
    }

    @Override
    public String toString() {
        return "SynchronizationModel{" +
                "checkPointModels=" + checkPointModels +
                '}';
    }
}
