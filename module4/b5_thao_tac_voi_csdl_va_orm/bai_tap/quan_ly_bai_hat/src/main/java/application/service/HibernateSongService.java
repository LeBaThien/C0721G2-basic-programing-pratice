package application.service;

import application.model.Song;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.stereotype.Service;

import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.TypedQuery;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class HibernateSongService implements ISongService {
    private static SessionFactory sessionFactory;
    private static EntityManager entityManager;

    static {
        try {
            sessionFactory = new Configuration()
                    .configure("hibernate.conf.xml")
                    .buildSessionFactory();
            entityManager = sessionFactory.createEntityManager();
        } catch (HibernateException e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<Song> findAll() {
        String queryStr = "SELECT s FROM Song AS s";
        TypedQuery<Song> query = entityManager.createQuery(queryStr, Song.class );
        return query.getResultList();
    }

    @Override
    public void save(Song song) {
        EntityTransaction entityTransaction = entityManager.getTransaction();
        entityTransaction.begin();
        entityManager.persist(song);
        entityTransaction.commit();
    }

    @Override
    public Song findById(int id) {
        return null;
    }

    @Override
    public void update(int id, Song song) {

    }

    @Override
    public void remove(int id) {

    }
}
