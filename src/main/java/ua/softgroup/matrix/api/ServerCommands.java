package ua.softgroup.matrix.api;

import ua.softgroup.matrix.api.model.requestmodels.RequestModel;
import ua.softgroup.matrix.api.model.responsemodels.ResponseModel;
import ua.softgroup.matrix.api.model.responsemodels.ResponseStatus;
import ua.softgroup.matrix.api.model.datamodels.CheckPointModel;
import ua.softgroup.matrix.api.model.datamodels.ProjectsContainerDataModel;
import ua.softgroup.matrix.api.model.datamodels.ReportsContainerDataModel;
import ua.softgroup.matrix.api.model.datamodels.SynchronizationModel;
import ua.softgroup.matrix.api.model.datamodels.ReportModel;
import ua.softgroup.matrix.api.model.datamodels.TimeModel;

public enum ServerCommands {

    /**
     * The command for a user authentication. The server expects to read the {@link RequestModel <AuthModel>} object
     * and then return a {@link ResponseModel < InitializeModel >} with a {@link ResponseStatus#SUCCESS}
     * in the case of successful authentication, a {@link ResponseStatus#INVALID_CREDENTIALS} otherwise.
     */
    AUTHENTICATE,

    /**
     * That command indicates that a user starts his work. The server expects to read the {@link RequestModel} object
     * and then return a {@link ResponseModel} with a {@link ResponseStatus#SUCCESS} in the case of successful start,
     * {@link ResponseStatus#FAIL} otherwise.
     */
    START_WORK,

    /**
     * That command indicates a period of user's work. The server expects to read the {@link RequestModel< CheckPointModel >}
     * object and then return a {@link ResponseModel< TimeModel >} with a {@link ResponseStatus#SUCCESS} in the case of
     * successful start, {@link ResponseStatus#FAIL} otherwise.
     */
    CHECK_POINT,

    /**
     * That command indicates that a user ends his work. The server expects to read the {@link RequestModel} object
     * and then return a {@link ResponseModel} with a {@link ResponseStatus#SUCCESS} in the case of successful start,
     * {@link ResponseStatus#FAIL} otherwise.
     */
    END_WORK,

    /**
     * The command for syncing with client after offline. The server expects to read the
     * {@link RequestModel<  SynchronizationModel  >} object and then return a {@link ResponseModel} with a
     * {@link ResponseStatus#SUCCESS} in the case of successful start, {@link ResponseStatus#FAIL} otherwise.
     */
    SYNCHRONIZE,

    /**
     * The command for retrieving a user's reports of the specified project. The server expects
     * to read the {@link RequestModel}. Then the server returns a {@link ResponseModel< ReportsContainerDataModel >}
     * with a {@link ResponseStatus#SUCCESS} in the case of successful start, {@link ResponseStatus#FAIL} otherwise.
     */
    GET_REPORTS,

    /**
     * (Implement this command only in case of adding refresh option on client)
     * The command for retrieving a user's active projects. The server expects to read the {@link RequestModel}.
     * Then the server returns a {@link ResponseModel<ProjectsContainerDataModel>} with a {@link ResponseStatus#SUCCESS}
     * in the case of successful start, {@link ResponseStatus#FAIL} otherwise.
     */
    GET_ALL_PROJECT,

    /**
     * The command for saving/editing a user's report. The server expects to read the {@link RequestModel<ReportModel>}
     * object and then return a {@link ResponseModel} with a {@link ResponseStatus#REPORT_EXISTS} if user already saved
     * a report today or {@link ResponseStatus#REPORT_EXPIRED} if user tried to edit a report that expired,
     * {@link ResponseStatus#INVALID_TOKEN} otherwise.
     */
    SAVE_REPORT,

    /**
     * That command close socket connection.
     */
    CLOSE
}
