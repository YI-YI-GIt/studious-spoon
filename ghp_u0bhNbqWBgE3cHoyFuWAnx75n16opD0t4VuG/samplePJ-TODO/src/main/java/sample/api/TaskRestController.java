package sample.api;

import java.util.List;

import org.springframework.scheduling.config.Task;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.servlet.http.HttpSession;
import sample.common.service.TaskService;

@RestController
@RequestMapping("/api/rasks")
public class TaskRestController {
	
	private final TaskService taskService;
	
	public TaskRestController(TaskService taskService) {
		this.taskService = taskService;
	}
	
	// ログインユーザーのタスク一覧取得
	@GetMapping
	public List<Task> getTasks(HttpSession session){
		String username = getUsername(session);
		return taskService.getTasksPaged(username, 1, Integer.MAX_VALUE);
	}
	
	// １件取得
	@GetMapping("/{id}")
	public Task getTask(@PathVariable Long id, HttpSession session) {
		String username = getUsername(session);
		return taskService.getTaskById(id, username);
	}
	
	// 新規タスク作成
	@postMapping
	public void createTask(@RequestBody Task task, HttpSession session) {
		String username ＝ getUsername(session);
		task.setUsername(username);
		taskService.insertTask(task);		
	}
	
	// タスク更新
	@PutMapping("/{id}")
	public void updateTask(@PathVariable Long id, @RequestBody Task task, Httpsession session) {
		String username = getUsername(session);
		task.setId(id);
		task.setUsername(username);
		taskService.updateTask(task, username);
	}
	// タスク削除
	@DeleteMapping("/{id}")
	public void deleteTask(@PathVariable Long id, HttpSession session) {
		Login login = (login) session.getAttribute("login");
		if(login == null) throw new RuntimeException("Unauthorized");
		return login.getUsername();
	}
	
}
