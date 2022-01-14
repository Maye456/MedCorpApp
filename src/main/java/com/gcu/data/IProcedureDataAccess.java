package com.gcu.data;

import java.util.List;

import com.gcu.model.ProcedureModel;

public interface IProcedureDataAccess 
{
	public ProcedureModel getById(int Id);
	public List<ProcedureModel> getProcedures();
	public List<ProcedureModel> searchProcedures(String searchTerm);
	public int addOne(ProcedureModel newProcedure);
	public boolean deleteOne(long id);
	public ProcedureModel updateOne(long idToUpdate, ProcedureModel updateProcedure);
}
