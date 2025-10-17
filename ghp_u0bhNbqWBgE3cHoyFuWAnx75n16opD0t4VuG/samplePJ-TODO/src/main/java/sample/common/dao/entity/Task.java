package sample.common.dao.entity;

import java.time.LocalDate;
import java.time.LocalDateTime;

import lombok.Data;

@Data
public class Task {
	public String username;
	public long id;
	public String title;
	public String content;
	public String name;
	public LocalDate startDate;
	public LocalDate endDate;
	public LocalDateTime createdAt;
	public LocalDateTime updatedAt;

}
