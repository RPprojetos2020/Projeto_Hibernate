//Aplicação desenvolvida para aula de ALPOO ministrada pelo professor Stefano Mathias
//Aluno: Rafael Luz RA:F100170 E Aluno: Pedro Gabriel RA: N522BC8 da Turma: CC3P48
//IDE utilizada: Eclipse, Versão: 2020, Versão da JDK: 13, JDBC: SqlServer, Versão: 18, Versão da JPA: 2.0, ORM: Hibernate

package livraria.main;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import dao.AutoresDao;
import dao.ConnectionFactory;
import dao.EditoraDao;
import dao.EmailDao;
import dao.LivroDao;
import model.Autores;
import model.Editora;
import model.Email;
import model.Livro;

public class Main {

	public static void main(String[] args) {
		
		EntityManager em = new ConnectionFactory().getConnection();
		
		//Intanciaçãos dos Dao's
		
		LivroDao ld = new LivroDao();
		
		//Criação das listas que receberão os objetos a serem persistidos
		ArrayList<Livro> list4 = new ArrayList();
				
		
		Editora a = new Editora("Editora São Domingos");
		
		Editora b = new Editora("Editora Stefano");
		
		Editora c = new Editora("Editora meninosRP");
		
		Editora d = new Editora("Editora Unip");
		
		Editora e = new Editora("Editora CC3P48");
		
		
		Email email1 = new Email("k@outlook.com");
		Email email2 = new Email("k@gmail.com");
		Autores k = new Autores("k nome");
		k.list.add(email1);
		k.list.add(email2);
		
		
		email1 = new Email("l@outlook.com");
		email2 = new Email("l@gmail.com");
		Autores l = new Autores("l nome");
		l.list.add(email1);
		l.list.add(email2);
		
		
		email1 = new Email("m@outlook.com");
		email2 = new Email("m@gmail.com");
		Autores m = new Autores("m nome");
		m.list.add(email1);
		m.list.add(email2);
		
		
		email1 = new Email("n@outlook.com");
		email2 = new Email("n@gmail.com");
		Autores n = new Autores("n nome");
		n.list.add(email1);
		n.list.add(email2);
		
		
		email1 = new Email("o@outlook.com");
		email2 = new Email("o@gmail.com");
		Autores o = new Autores("o nome");
		o.list.add(email1);
		o.list.add(email2);
		
		
		Livro l1 = new Livro(a, 10.00, "Livro do k", k);
		list4.add(l1);
		
		Livro l2 = new Livro(b, 20.00, "Livro do l", l);
		list4.add(l2);
		
		Livro l3 = new Livro(c, 30.00, "Livro do m", m);
		list4.add(l3);
		
		Livro l4 = new Livro(d, 40.00, "Livro do n", n);
		list4.add(l4);
		
		Livro l5 = new Livro(e, 50.00, "Livro do o", o);
		list4.add(l5);
		
		
		
		ld.saveAll(list4);
		
		System.out.println("----------------------Consulta hql de autores------------------------------------------------------------");
		
		String consulta = "from Autores autores";
		Query q = em.createQuery(consulta);
		List<Object> resultado = q.getResultList();
		
		for(int i = 0; i<=resultado.size() -1; i++) {
			
			Autores autores = (Autores) resultado.get(i);
			
			System.out.println("Nome: " + autores.getNome() + " Codigo: " + autores.getCodigo());
			
		}
		
		System.out.println("----------------------Consulta hql Editoras --------------------------------------------");

		String consulta1 = "from Editora editora";
		Query q1 = em.createQuery(consulta1);
		List<Object> resultado1 = q1.getResultList();
		
		for(int i = 0; i<=resultado1.size() -1; i++) {
			
			Editora editora = (Editora) resultado1.get(i);
			
			System.out.println("Nome: " + editora.getNome() + "Codigo: " + editora.getCodigo());
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
