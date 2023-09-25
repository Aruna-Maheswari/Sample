package com.servicetest;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
//import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
//import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import com.products.ProductDetails;
import com.products.ProductRepository;
import com.products.ProductService;

@SpringBootTest
public class ProductServiceTest {
	@Autowired
	ProductService productservice;
	@MockBean
	ProductRepository productrepository;
     
   @Test 
   public void addingProduct()
   {
	   ProductDetails pd=new ProductDetails(1,"jsgdhh",878);
	   when(productrepository.save(pd)).thenReturn(pd);
	  assertEquals(pd,productservice.addingProduct(pd));
	   
   }
   
   @Test
   public void updateProduct()
   {
	   ProductDetails pd1=new ProductDetails(1,"jsgjshj",87897);
	   when(productrepository.save(pd1)).thenReturn(pd1);
	   assertEquals(pd1,productservice.updateProduct(pd1));
   }
   @Test
   public void

private void assertEquals(ProductDetails pd, String addingProduct) {
	// TODO Auto-generated method stub
	
}
  
   
}
