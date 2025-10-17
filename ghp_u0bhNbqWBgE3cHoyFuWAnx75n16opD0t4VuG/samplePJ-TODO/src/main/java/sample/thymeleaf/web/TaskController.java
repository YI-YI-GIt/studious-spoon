package sample.thymeleaf.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import jakarta.servlet.http.HttpSession;
import sample.common.dao.entity.Login;
import sample.common.dao.entity.Task;
import sample.common.service.TaskService;

@Controller
@RequestMapping("/tasks")
public class TaskController {

    private final TaskService taskService;

    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }

    @GetMapping
    public String list(@RequestParam(defaultValue = "1") int page,Model model, HttpSession session) {
        String username = getUsername(session);
        int pageSize = 10;
        var tasks = taskService.getTasksPaged(username, page, pageSize);
        int totalTasks = taskService.getTaskCount(username);
        int totalPages = (int) Math.ceil((double) totalTasks / pageSize);

        model.addAttribute("tasks", tasks);
        model.addAttribute("currentPage", page);
        model.addAttribute("totalPages", totalPages);
        return "tasks/list";
    }

    @GetMapping("/new")
    public String showNewForm(Model model) {
        model.addAttribute("task", new Task());
        return "tasks/form-new";
    }

    @PostMapping
    public String createTask(@ModelAttribute Task task, HttpSession session) {
        String username = getUsername(session);
        task.setUsername(username); // ログインユーザーの名前をセット
        taskService.insertTask(task);
        return "redirect:/tasks";
    }

    @GetMapping("/edit/{id}")
    public String showEditForm(@PathVariable Long id, Model model, HttpSession session) {
        String username = getUsername(session);
        Task task = taskService.getTaskById(id, username);
        if(task == null) {
        return "redirect:/tasks"; // 他人のタスクならリダイレクト
    }
    
    model.addAttribute("task, task");
    return "tasks/form-edit";
    }

    @PostMapping("/update/{id}")
    public String updateTask(@PathVariable Long id, @ModelAttribute Task task, HttpSession session) {
        String username = getUsername(session);
        task.setId(id);
        task.setUsername(username);
        taskService.updateTask(task, username);
        return "redirect:/tasks";
    }

    @PostMapping("/delete/{id}")
    public String deleteTask(@PathVariable Long id, HttpSession session) {
        String username = getUsername(session);
        taskService.deleteTask(id, username);
        return "redirect:/tasks";
    }

    private String getUsername(HttpSession session) {
        Login login = (Login) session.getAttribute("login");
        return login.getUsername();
    }
}
