package ua.softgroup.matrix.api.model.requestmodels;

import com.google.common.base.Optional;
import ua.softgroup.matrix.api.model.datamodels.DataModel;

import java.io.Serializable;



/**
 * @author Vadim Boitsov <sg.vadimbojcov@gmail.com>
 */
public class RequestModel<T extends DataModel> implements Serializable {
    private static final long serialVersionUID = 1L;

    private String token;

    private long projectId;

    private Optional<T> dataContainer;

    public RequestModel(String token, long projectId) {
        this.token = token;
        this.projectId = projectId;
    }

    public RequestModel(T dataModel) {
        dataContainer = Optional.of(dataModel);
    }

    public RequestModel(String token, long projectId, T dataModel) {
        this.token = token;
        this.projectId = projectId;
        dataContainer = Optional.of(dataModel);
    }

    public RequestModel(String token, T dataModel) {
        this.token = token;
        dataContainer = Optional.of(dataModel);
    }



    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public long getProjectId() {
        return projectId;
    }

    public void setProjectId(long projectId) {
        this.projectId = projectId;
    }

    public Optional<T> getDataContainer() {
        return dataContainer;
    }

    public void setDataContainer(Optional<T> dataContainer) {
        this.dataContainer = dataContainer;
    }

    @Override
    public String toString() {
        return "RequestModel{" +
                "token='" + token + '\'' +
                ", projectId=" + projectId +
                ", dataContainer=" + dataContainer +
                '}';
    }
}
