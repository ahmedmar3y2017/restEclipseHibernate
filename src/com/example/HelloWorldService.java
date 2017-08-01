package com.example;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.hibernate.Session;
import org.hibernate.query.Query;

import Entities.Topics;

@Path("/hello")
public class HelloWorldService {

	@GET
	@Produces(MediaType.TEXT_PLAIN)
	@Path("/topics")
	public String getMsg() {

	    Session session = HibernateUtil.getSessionFactory().openSession();
	    
        session.beginTransaction();
        Query q = session.createQuery("From Topics ");
        
        List<Topics> resultList = q.list();
        System.out.println("num of Topics :" + resultList.size());
        for (Topics next : resultList) {
            System.out.println( next.getUsername());
        }
		
      
        session.getTransaction().commit();
 
   session.close();
		
		
		return resultList.toString();

	}

}