package com.nt;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.nt.dto.EmpDto;
import com.nt.service.EmpService;

@SpringBootApplication
public class ProjSbWorkingWithDateTimeApplication {

	public static void main(String[] args) {
ApplicationContext ctx=SpringApplication.run(ProjSbWorkingWithDateTimeApplication.class, args);
   EmpService bean = ctx.getBean("ser",EmpService.class);    
 
    EmpDto dto=new EmpDto();
      dto.setName("shakil");

      //dto.setDob(LocalDateTime.of(92,8,5,10,20,11));
	  dto.setDoj(LocalDate.of(119,11,20));
	
	String s= bean.insertData(dto);
	 System.out.println(s);
	 
	 
 /* List<EmpDto> dtolist=	bean.getAllRecord();
	 dtolist.forEach(dto1->{
		 System.out.println(dto1);
	 });
	}*/

}
}