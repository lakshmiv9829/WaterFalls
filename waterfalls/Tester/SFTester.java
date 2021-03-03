package com.xworkz.waterfalls.Tester;

import org.hibernate.SessionFactory;

import com.xworkz.waterfalls.dao.WaterFallsDAO;
import com.xworkz.waterfalls.dao.WaterFallsDAOImpl;
import com.xworkz.waterfalls.entity.WaterFlassEntity;
import com.xworkz.waterfalls.util.SFSingleTon;

public class SFTester {

	public static void main(String[] args) {
		SessionFactory factory = SFSingleTon.getFactory();
		System.out.println(factory);
		WaterFallsDAO dao = new WaterFallsDAOImpl();
		WaterFlassEntity entity = new WaterFlassEntity();
		entity.setName("hogenikal");
		entity.setHeight(434);
		entity.setDestinatation("Indian Ocean");
		entity.setDepth(1000);
		entity.setElectricityGenerated(true);
		entity.setLocation("tamilnadu");
		entity.setSourceriver("kaveri");
		entity.setEntryFee(800);
		entity.setNoOfDeath(5);
		entity.setRating(5);
		entity.setNoOfVisitors(308390);
		//dao.create(entity);
		WaterFlassEntity entity1 = new WaterFlassEntity();
		entity1.setName("jog");
		entity1.setHeight(675);
		entity1.setDestinatation("Indian Ocean");
		entity1.setDepth(1009);
		entity1.setElectricityGenerated(true);
		entity1.setLocation("shivamoga");
		entity1.setSourceriver("thunga");
		entity1.setEntryFee(200);
		entity1.setNoOfDeath(1);
		entity1.setRating(4);
		entity1.setNoOfVisitors(3082424);
		//dao.create(entity1);
		//dao.deleteById(4);
		//dao.deleteById(5);
		//dao.deleteById(6);
		dao.updateHeightAndDepthById(3, 347, 34);
		dao.deleteById(3);
	}

}
