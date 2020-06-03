package com.ipc;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import com.ipc.dao.BomHeadRepository;
import com.ipc.dao.BomItemsRepository;
import com.ipc.dao.IdocStatusRepository;
import com.ipc.entities.BomHead;
import com.ipc.entities.BomItems;
import com.ipc.entities.IdocStatus;



@SpringBootApplication
public class BomtestApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(BomtestApplication.class, args);
		/*---------------------- IdocStatus --------------------------------*/
		IdocStatusRepository idocStatusRepository =  ctx.getBean(IdocStatusRepository.class);
		//idocStatusRepository.save(new IdocStatus("",new Date(),"",1,1,new Date(),1,1,new Date(),new Timestamp(15154)));
		
		/*---------------------- BomHead --------------------------------*/
		BomHeadRepository bomHeadRepository =  ctx.getBean(BomHeadRepository.class);
		//bomHeadRepository.save(new BomHead("","","",new Date(),"","","",1,1,new Date(),new Date(),1,""));
		
		/*---------------------- BomItems --------------------------------*/
//		BomItemsRepository bomItemsRepository =  ctx.getBean(BomItemsRepository.class);
//		bomItemsRepository.save(new BomItems("",1,"","","",new Date(),"","",1,"","",1,new Date(),""));
//		List<BomHead> boms = bomHeadRepository.findAll();
//		for (BomHead bom : boms) {
//			//System.out.println(" bom_id : " + bom.getBom_id() + " - Bom_status : " + bom.getBom_status()+"-bom.getBom_version_erp"+bom.getBom_version_erp());
//		}
		
		System.out.println(bomHeadRepository.getNextSequenceValue());
		
	}

}
