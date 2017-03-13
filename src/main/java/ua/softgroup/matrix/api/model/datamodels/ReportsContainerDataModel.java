package ua.softgroup.matrix.api.model.datamodels;

import java.io.Serializable;
import java.util.Set;

/**
 * @author Vadim Boitsov <sg.vadimbojcov@gmail.com>
 */
public class ReportsContainerDataModel implements Serializable, DataModel {
    private static final long serialVersionUID = 1L;

    private Set<ReportModel> reportModels;

    public ReportsContainerDataModel(Set<ReportModel> reportModels) {
        this.reportModels = reportModels;
    }

    public Set<ReportModel> getReportModels() {
        return reportModels;
    }

    public void setReportModels(Set<ReportModel> reportModels) {
        this.reportModels = reportModels;
    }

    @Override
    public String toString() {
        return "ReportsContainerDataModel{" +
                "reportModels=" + reportModels +
                '}';
    }
}
