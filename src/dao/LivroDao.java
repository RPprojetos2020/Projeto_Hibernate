package dao;

import java.util.ArrayList;

import javax.persistence.EntityManager;

import model.Editora;
import model.Livro;

public class LivroDao {
	
	EntityManager em = new ConnectionFactory().getConnection();
	
	public void save(Livro e) {
		
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
			em.remove(em.find(Livro.class, id));
			em.getTransaction().commit();
			
		}catch(Exception ex) {
			
			em.getTransaction().rollback();
			
		}finally {
			
			em.close();
			
		}
		
	}
	
	public Livro find(Integer id){
		
		try {
			
			em.getTransaction().begin();
			Livro e = em.find(Livro.class, id);
			return e;
			
		}catch(Exception e) {
			
			em.getTransaction().rollback();
			
		}finally {
			
			em.close();
			
			
			
		}
		
		return null;
		
	}
	
	public void update(Livro e ) {
		
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
	
	public void saveAll(ArrayList<Livro> list) {
		
		try {
			
			for(Livro e:list) {
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
