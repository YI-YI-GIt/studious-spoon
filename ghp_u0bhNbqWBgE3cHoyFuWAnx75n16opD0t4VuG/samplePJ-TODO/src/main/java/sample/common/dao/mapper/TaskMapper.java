package sample.common.dao.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.scheduling.config.Task;

@Mapper
public interface TaskMapper {
List<Task> findPagedByUsername(@Param("username") String username, @Param("offset") int offset, @Param("limit") int limit);
int countAllByUsername(@Param("username") String username);
Task findById(@Param("id") Long id);
void insert(Task task);
void update(@Param("task") Task task, @Param("username") String username);
void delete(@Param("id") Long id, @Param("username") String username);
}
