package com.ty.Todolist1;

import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoRepository extends JpaRepository <TodoItem, Long>{

}
