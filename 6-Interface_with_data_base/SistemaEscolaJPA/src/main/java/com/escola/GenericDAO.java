package com.escola;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

// E: Entidade, K: Chave
public abstract class GenericDAO<E, K> {

    // A fábrica é pesada, criada apenas uma vez (Singleton)
    private static final EntityManagerFactory EMF = 
        Persistence.createEntityManagerFactory("EscolaPU"); // Nome do persistence.xml

    protected EntityManager getEntityManager() {
        return EMF.createEntityManager();
    }
    
    // -------------------------------------------------------------------
    // CONTRATO DAO (JPA) - MÉTODOS EM INGLÊS
    // -------------------------------------------------------------------

    public void create(E entidade) {
        EntityManager em = getEntityManager();
        try {
            em.getTransaction().begin(); 
            em.persist(entidade);       
            em.getTransaction().commit(); 
        } catch (Exception e) {
            if (em.getTransaction().isActive()) {
                em.getTransaction().rollback(); 
            }
            throw new RuntimeException("Error creating entity: " + e.getMessage(), e);
        } finally {
            em.close(); 
        }
    }

    public void delete(K chave, Class<E> classe) {
        EntityManager em = getEntityManager();
        try {
            E entidade = em.find(classe, chave);
            if (entidade != null) {
                em.getTransaction().begin();
                em.remove(entidade);
                em.getTransaction().commit();
            }
        } catch (Exception e) {
            if (em.getTransaction().isActive()) {
                em.getTransaction().rollback();
            }
            throw new RuntimeException("Error deleting entity: " + e.getMessage(), e);
        } finally {
            em.close();
        }
    }
    
    public void update(E entidade) {
        EntityManager em = getEntityManager();
        try {
            em.getTransaction().begin();
            em.merge(entidade); 
            em.getTransaction().commit();
        } catch (Exception e) {
            if (em.getTransaction().isActive()) {
                em.getTransaction().rollback();
            }
            throw new RuntimeException("Error updating entity: " + e.getMessage(), e);
        } finally {
            em.close();
        }
    }
    
    public E read(K chave, Class<E> classe) {
        EntityManager em = getEntityManager();
        try {
            return em.find(classe, chave); 
        } finally {
            em.close();
        }
    }

    public List<E> readAll(Class<E> classe) {
        EntityManager em = getEntityManager();
        try {
            // JPQL: Usa o nome da classe (Aluno) e não o nome da tabela (ALUNO)
            String jpql = "SELECT e FROM " + classe.getSimpleName() + " e";
            return em.createQuery(jpql, classe).getResultList();
        } finally {
            em.close();
        }
    }
}