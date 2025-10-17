package sample.common.dao.entity;

import java.time.LocalDateTime;

import lombok.Data;

@Data
public class Login {
	public long id;
	public String username;
	public String password;
	public LocalDateTime createdAt;
	public LocalDateTime updatedAt;

}
