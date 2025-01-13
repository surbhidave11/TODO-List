package todolist1.hello;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class ToDoController{
	
@Autowired
private ToDoService toDoService;

@GetMapping("/todos")
public List<ToDo> getAllToDos()
{
return toDoService.getAllToDos();
}

@GetMapping("/todos/{id}")
public ToDo getToDo(@PathVariable Integer id)
{
return toDoService.getToDo(id);
}
	
@PostMapping("/todos")
public void createToDo(@RequestBody ToDo todo)
{
toDoService.createToDo(todo);
}

@PutMapping("/todos")
public void updateToDo(@RequestBody ToDo todo)
{
toDoService.updateToDo(todo);
}
	
@DeleteMapping("/todos/{id}")
public void updateToDo(@PathVariable Integer id )
{
toDoService.deleteToDo(id);
}

}
	

