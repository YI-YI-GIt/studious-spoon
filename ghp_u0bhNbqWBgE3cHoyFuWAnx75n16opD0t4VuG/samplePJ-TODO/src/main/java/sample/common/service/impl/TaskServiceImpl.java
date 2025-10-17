package sample.common.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;
import sample.common.dao.entity.Task;
import sample.common.dao.mapper.TaskMapper;
import sample.common.service.TaskService;

@Service
public class TaskServiceImpl implements TaskService {
	
	private final TaskMapper taskMapper;
	
	public TaskServiceImpl(TaskMapper taskMapper) {
		this.taskMapper = taskMapper;
	}

	@Override
	public List<Task> getTasksPaged(String username, int page, int size) {
		int offset = (page -1)*size;
		return taskMapper.findPagedByUsername(username, offset, size);
	}

	@Override
	public int getTaskCount(String username) {
		return taskMapper.countAllByUsername(username);
	}

	@Override
	public Task getTaskById(Long id, String username) {
		Task task = taskMapper.findById(id);
		return (task !=null && task.getUsername().equals(username)? task : null);;
	}

	@Transactional
	@Override
	public void insertTask(Task task, String name) {
		taskMapper.insert(task);
		
	}

	@Transactional
	@Override
	public void updateTask(Task task, String username) {
		taskMapper.update(task, username);
		
	}

	@Transactional
	@Override
	public void deleteTask(Long id, String username) {
		taskMapper.delete(id, username);
	}

}
