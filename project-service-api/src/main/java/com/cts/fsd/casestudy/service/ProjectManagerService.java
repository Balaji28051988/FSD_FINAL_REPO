package com.cts.fsd.casestudy.service;

/**
 * Interface for service methods of Project Manager
 * 
 * @author 456206
 *
 */

import java.util.List;

import com.cts.fsd.casestudy.exception.TaskException;
import com.cts.fsd.casestudy.model.ParentTaskInfo;
import com.cts.fsd.casestudy.model.ProjectInfo;
import com.cts.fsd.casestudy.model.TaskInfo;
import com.cts.fsd.casestudy.model.UserInfo;

public interface ProjectManagerService {

	List<ProjectInfo> getProjectInfo() throws TaskException;

	List<UserInfo> getUserInfo() throws TaskException;

	List<TaskInfo> getTaskInfo(int projectId) throws TaskException;

	Boolean updateUserInfo(UserInfo userInfo) throws TaskException;

	Boolean updateProjectInfo(ProjectInfo projectInfo) throws TaskException;

	Boolean updateTaskInfo(TaskInfo taskInfo) throws TaskException;

	List<ParentTaskInfo> getParentTasks(int projectId) throws TaskException;

	Boolean deleteUser(int userId) throws TaskException;

	Boolean deleteProject(int projectId) throws TaskException;
}
