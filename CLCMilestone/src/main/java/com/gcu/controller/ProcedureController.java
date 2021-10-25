package com.gcu.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.gcu.business.IProcedureBusinessService;
import com.gcu.model.ProcedureModel;

@Controller
@RequestMapping("/procedure")
public class ProcedureController 
{
	/*
	 * @Autowired private IProcedureBusinessService procedureService;
	 */
	
	@GetMapping("/")
	public String display(Model model)
	{
		// Display Procedure View
		model.addAttribute("title", "Procedure Form");
		model.addAttribute("procedureModel", new ProcedureModel());
		return "procedure";
	}
	
	@PostMapping("/doProcedureCreate")
	public String doLogin(@Valid ProcedureModel procedureModel, BindingResult bindingResult, Model model)
	{
		// Check for validation errors
		if (bindingResult.hasErrors())
		{
			model.addAttribute("title", "Procedure Form");
			return "procedure";
		}
				
		model.addAttribute("procedureModel", procedureModel);
		return "procedureSuccess";
	}
}
