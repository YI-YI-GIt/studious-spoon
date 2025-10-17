package sample.common.service;

import java.util.List;

import sample.common.dao.entity.Task;

public interface TaskService {
	List<Task> getTasksPaged(String username, int page, int size);
	int getTaskCount(String username);
	Task getTaskById(Long id, String username);
	void insertTask(Task task);
	void updateTask(Task task, String username);
	void deleteTask(Long id, String username);

}
