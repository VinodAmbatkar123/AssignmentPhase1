packagecom.project.SportyShoes.controller;

importjava.util.List;

importorg.springframework.beans.factory.annotation.Autowired;
importorg.springframework.stereotype.Controller;
importorg.springframework.ui.Model;
importorg.springframework.web.bind.annotation.ModelAttribute;
importorg.springframework.web.bind.annotation.RequestMapping;
importorg.springframework.web.bind.annotation.RequestMethod;

importcom.project.SportyShoes.entity.Categories;
importcom.project.SportyShoes.entity.Product;
importcom.project.SportyShoes.service.ProductService;

@Controller
publicclassProductController {
	@Autowired
	publicProductServiceprodserv;
	
	@RequestMapping("/listprod")
	public String viewListProductPage(Model model)
	{
		List<Product>listProduct= prodserv.listAll();
		model.addAttribute("listProduct", listProduct);
		return"product_manage";
		
	}
	
	@RequestMapping("/newproduct")
	public String addNewProductPage(Model model)
	{
		Product product= newProduct();
		model.addAttribute("product", product);
		
		return"new_product";
	}
	
	@RequestMapping(value = "/saveproduct", method = RequestMethod.POST)
	public String saveCategory(@ModelAttribute("product") Product product, Model md) 
	{   
		
		prodserv.save(product);
		List<Product>listProduct= prodserv.listAll();
		md.addAttribute("listProduct", listProduct);
		
		return"product_manage";
	
	}
	

}
