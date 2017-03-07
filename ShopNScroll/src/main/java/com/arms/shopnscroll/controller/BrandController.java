package com.arms.shopnscroll.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.arms.shopnscroll.model.Brand;
import com.arms.shopnscroll.service.BrandService;

@Controller
public class BrandController 
{
	@Autowired
	BrandService brandService;
	
	@RequestMapping(value="/brand")
	public String getBrand(Model model)
	{
		model.addAttribute("brandList", brandService.fetchAllBrand());
		model.addAttribute("brand",new Brand());
		model.addAttribute("btnLabel","Add");

		return "admin-brand";
	}
	
	@RequestMapping("/updatebrand-{brandId}")
	public String updateBrand(@PathVariable("brandId")int brandId, Model model)
	{
		model.addAttribute("brandList", brandService.fetchAllBrand());
		model.addAttribute("brand", brandService.fetchOneBrand(brandId));
		model.addAttribute("btnLabel","Update");
		
		return "admin-brand";
	}
	
	@RequestMapping("/addbrand")
	public String addBrand(@Valid @ModelAttribute("brand")Brand brand,BindingResult result,Model model)
	{
		if(result.hasErrors())
		{
			model.addAttribute("brandList", brandService.fetchAllBrand());
			model.addAttribute("btnLabel","Add");
			
			return "admin-brand";
		}
		
		brandService.addBrand(brand);
		return "redirect:/brand";
	}
	
	@RequestMapping("/removebrand-{brandId}")
	public String removeBrand(@PathVariable("brandId")int brandId)
	{
		brandService.removeBrand(brandId);
		return "redirect:/brand";
	}
	
}
