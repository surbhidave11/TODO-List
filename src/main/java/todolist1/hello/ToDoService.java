package todolist1.hello;

import java.util.ArrayList;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ToDoService {
	
@Autowired
private ToDoRepository toDoRepository;
	
public List<ToDo> getAllToDos()
{
return toDoRepository.findAll();
}
	
public ToDo getToDo(Integer id)
{
return toDoRepository.findById(id).orElse(null);
}

public void createToDo(ToDo todo)
{
toDoRepository.save(todo);
}

public void updateToDo(ToDo todo)
{
ToDo toDo2 = getToDo(todo.getId());
toDo2.setDescription(todo.getDescription());
toDo2.setName(todo.getName());
toDo2.setSummary(todo.getSummary());
toDoRepository.save(toDo2);
}
//	for (int i=0 ; i <todos.size(); i++)
//{
//ToDo t=todos.get(i);
//if(t.getId().equals(id))
//{
//	todos.set(i, todo);
//	return;
//}
public void deleteToDo(Integer id) 
{
toDoRepository.deleteById(id);
}

}
