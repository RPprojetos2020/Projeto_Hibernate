package dao;

import java.util.ArrayList;

import javax.persistence.EntityManager;

import model.Editora;

public class EditoraDao {
	
	EntityManager em = new ConnectionFactory().getConnection();
	
	public void save(Editora e) {
		
		try {
			
			em.getTransaction().begin();
			em.persist(e);
			em.getTransaction().commit();
			
			
		}catch(Exception ex) {
			
			em.getTransaction().rollback();
			
		}finally {
			
			em.close();
			
		}
		
	}
	
	public void delet(Integer id) {
		
		try {
			
			em.getTransaction().begin();
			em.remove(em.find(Editora.class, id));
			em.getTransaction().commit();
			
		}catch(Exception ex) {
			
			em.getTransaction().rollback();
			
		}finally {
			
			em.close();
			
		}
		
	}
	
	public Editora find(Integer id){
		
		try {
			
			em.getTransaction().begin();
			Editora e = em.find(Editora.class, id);
			return e;
			
		}catch(Exception e) {
			
			em.getTransaction().rollback();
			
		}finally {
			
			em.close();
			
			
			
		}
		
		return null;
		
	}
	
	public void update(Editora e ) {
		
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
	
	public void saveAll(ArrayList<Editora> list) {
		
			try {
				
				for(Editora e:list) {
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
