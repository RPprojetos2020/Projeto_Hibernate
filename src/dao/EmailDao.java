package dao;

import java.util.ArrayList;

import javax.persistence.EntityManager;

import model.Editora;
import model.Email;

public class EmailDao {
	
EntityManager em = new ConnectionFactory().getConnection();
	
	public void save(Email e) {
		
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
			em.remove(em.find(Email.class, id));
			em.getTransaction().commit();
			
		}catch(Exception ex) {
			
			em.getTransaction().rollback();
			
		}finally {
			
			em.close();
			
		}
		
	}
	
	public Email find(Integer id){
		
		try {
			
			em.getTransaction().begin();
			Email e = em.find(Email.class, id);
			return e;
			
		}catch(Exception e) {
			
			em.getTransaction().rollback();
			
		}finally {
			
			em.close();
			
		}
		
		return null;
		
	}
	
	public void update(Email e ) {
		
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
	
	public void saveAll(ArrayList<Email> list) {
		
		try {
			
			for(Email e:list) {
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
