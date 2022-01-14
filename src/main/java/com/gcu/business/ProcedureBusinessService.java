package com.gcu.business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.gcu.data.IProcedureDataAccess;
import com.gcu.model.ProcedureModel;

public class ProcedureBusinessService implements IProcedureBusinessService 
{
	@Autowired
	IProcedureDataAccess procedureDAO;

	@Override
	public ProcedureModel getById(int Id) 
	{
		return procedureDAO.getById(Id);
	}

	@Override
	public List<ProcedureModel> getProcedures() 
	{
		return procedureDAO.getProcedures();
	}

	@Override
	public List<ProcedureModel> searchProcedures(String searchTerm) 
	{
		return procedureDAO.searchProcedures(searchTerm);
	}

	@Override
	public int addOne(ProcedureModel newProcedure) 
	{
		return procedureDAO.addOne(newProcedure);
	}

	@Override
	public boolean deleteOne(long id) 
	{
		return procedureDAO.deleteOne(id);
	}

	@Override
	public ProcedureModel updateOne(long idToUpdate, ProcedureModel updateProcedure)
	{
		return procedureDAO.updateOne(idToUpdate, updateProcedure);
	}

	@Override
	public void init() 
	{
		System.out.println("Init method of OrderBusinessService was just called");
	}

	@Override
	public void destroy() 
	{
		System.out.println("Destroy method of OrderBusinessService was just called");
	}

}
