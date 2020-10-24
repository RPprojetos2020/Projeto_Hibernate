package dao;

import java.util.ArrayList;

import javax.persistence.EntityManager;

import model.Autores;
import model.Editora;

public class AutoresDao {
	
	EntityManager em = new ConnectionFactory().getConnection();
	
	public void save(Autores e) {
		
		try {
			
			em.getTransaction().begin();
			em.persist(e);
			em.getTransaction().commit();
			
			System.out.println("Editora salva com sucesso!!!");
			
		}catch(Exception ex) {
			
			em.getTransaction().rollback();
			
		}finally {
			
			em.close();
			
		}
		
	}
	
	public void delet(Integer id) {
		
		try {
			
			em.getTransaction().begin();
			em.remove(em.find(Autores.class, id));
			em.getTransaction().commit();
			
		}catch(Exception ex) {
			
			em.getTransaction().rollback();
			
		}finally {
			
			em.close();
			
		}
		
	}
	
	public Autores find(Integer id){
		
		try {
			
			em.getTransaction().begin();
			Autores e = em.find(Autores.class, id);
			return e;
			
		}catch(Exception e) {
			
			em.getTransaction().rollback();
			
		}finally {
			
			em.close();
			
			
			
		}
		
		return null;
		
	}
	
	public void update(Autores e ) {
		
		try {
			
			em.getTransaction().begin();
			em.merge(e);
			em.getTransaction().commit();
			
		}catch(Exception ex) {
			
			em.getTransaction().rollback();
			
		}finally {
			
			em.close();
			
		}
		
	}
	
	public void saveAll(ArrayList<Autores> list) {
		
		try {
			
			for(Autores e:list) {
				em.getTransaction().begin();
				em.persist(e);
				em.getTransaction().commit();
			}
			
			
		}catch(Exception ex) {
			
			em.getTransaction().rollback();
			
		}finally {
			
			em.close();
			
		}
	
	}


}
