package com.hcl.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcl.dao.TskRepository;
import com.hcl.exception.FailedDatabaseActionException;
import com.hcl.model.Task;

@Service
public class TaskService {

	@Autowired
	private TskRepository repo;

	public boolean saveTask(Task tsk) throws FailedDatabaseActionException {
		try {
			repo.save(tsk);
			return true;
		} catch (Exception e) {
			throw new FailedDatabaseActionException("Couldn't insert to database... check your connection", e);
		}
	}

	public List<Task> findAllTasks() {
		return (List<Task>) repo.findAll();
	}

	public Optional<Task> findTaskById(long id) {
		return repo.findById(id);
	}

	public boolean deleteTask(Task tsk) throws FailedDatabaseActionException {
		try {
			repo.delete(tsk);
			return true;
		} catch (Exception e) {
			throw new FailedDatabaseActionException("Couldn't delete from database... check your connection", e);
			//System.out.println("Couldn't delete");
			//return false;
		}
	}

}
