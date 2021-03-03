package com.xworkz.waterfalls.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.xworkz.waterfalls.entity.WaterFlassEntity;
import com.xworkz.waterfalls.util.SFSingleTon;

public class WaterFallsDAOImpl implements WaterFallsDAO {
	private SessionFactory factory = SFSingleTon.getFactory();

	public WaterFallsDAOImpl() {
		System.out.println("created " + this.getClass());
	}

	@Override
	public void create(WaterFlassEntity entity) {
		System.out.println("invoked create");
		System.out.println("entity" + entity);
		try(Session session=factory.openSession()){
		Transaction transaction=session.beginTransaction();
		session.save(entity);
		transaction.commit();
		System.out.println("created method saved");
		
		}

	}

	

	@Override
	public void updateHeightAndDepthById(int id, double height, double depth) {
		try(Session session=factory.openSession()){
		WaterFlassEntity entity=session.get(WaterFlassEntity.class, id);
		Transaction transcation=session.beginTransaction();
		WaterFlassEntity entity1=session.get(WaterFlassEntity.class, id);
		if(entity1!=null) {
			System.out.println("can update");
			entity1.setHeight(height);
			entity1.setDepth(depth);
			transcation.commit();
			
		}
		
		else {
			System.out.println("cannot update, id not found");
		}
		}
	}

	@Override
	public void deleteById(int id) {
		System.out.println("invoked deleted");
		try(Session session=factory.openSession()){
			Transaction transaction=session.beginTransaction();
			WaterFlassEntity entity=session.get(WaterFlassEntity.class, id);
			if(entity!=null) {
				System.out.println("Can delete ");
				session.delete(entity);
				transaction.commit();
			}
			else {
				System.out.println("cannot found , cant dalete");
			}	
		}
	}
//		


	@Override
	public WaterFlassEntity getById(int id) {
		System.out.println("invoked deleteById");
		try(Session session=factory.openSession()){
		Transaction transaction=session.beginTransaction();
		WaterFlassEntity entity=session.get(WaterFlassEntity.class, id);
		if(entity!=null) {
			System.out.println("id found");
			transaction.commit();
			}
		else {
			System.out.println("cont get ");
		}
		
		return entity;
		}

	
}
}