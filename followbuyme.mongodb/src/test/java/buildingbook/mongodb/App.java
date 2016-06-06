package buildingbook.mongodb;

import java.io.IOException;
import java.io.InputStream;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.Resource;

import com.followbuyme.building.mongodb.dao.FileStorageDao;
import com.mongodb.BasicDBObject;
import com.mongodb.DBObject;
import com.mongodb.gridfs.GridFSDBFile;

public class App {
 public static void main(String[] args) {
  InputStream inputStream = null;
  try {
   ApplicationContext context = new ClassPathXmlApplicationContext("spring-beans.xml");
   FileStorageDao fileStorageDao = (FileStorageDao) context.getBean("fileStorageDao");
   Resource resource = context.getResource("file:c:\\Users\\Yachin\\audi.jpg");

   DBObject metaData = new BasicDBObject();
   metaData.put("brand", "Audi");
   metaData.put("model", "Audi A3");
   metaData.put("description","Audi german automobile manufacturer that designs, engineers, and distributes automobiles");

   String id = fileStorageDao.store(resource.getInputStream(),"audi.jpg", "image/jpeg", metaData);

   System.out.println("Find By Id----------------------");
   GridFSDBFile byId = fileStorageDao.getById(id);
   System.out.println("File Name:- " + byId.getFilename());
   System.out.println("Content Type:- " + byId.getContentType());
   System.out.println("ID :- " + byId.getId());
   
   
   
   System.out.println("Find By Filename----------------------");
   GridFSDBFile byFileName = fileStorageDao.getByFilename("audi.jpg");
   System.out.println("File Name:- " + byFileName.getFilename());
   System.out.println("Content Type:- " + byFileName.getContentType());
   
   
   /*System.out.println("List All Files----------------------");
   for (GridFSDBFile file : fileStorageDao.findAll()) {
    System.out.println("File Name:- " + file.getFilename());
    System.out.println("Content Type:- " + file.getContentType());
    System.out.println("Meta Data Brand:- " + file.getMetaData().get("brand"));
    System.out.println("Meta Data Model:- " + file.getMetaData().get("model"));
    System.out.println("Meta Data Description:- " + file.getMetaData().get("description"));
   }*/
   
   GridFSDBFile retrive = fileStorageDao.retrive("audi.jpg");
   retrive.writeTo("c:\\Users\\Yachin\\newaudi.jpg");
   
  } catch (BeansException e) {
   System.out.println("BeansException:-" + e.getMessage());
  } catch (IOException e) {
   System.out.println("IOException:-" + e.getMessage());
  } finally {
   if (inputStream != null) {
    try {
     inputStream.close();
    } catch (IOException e) {
     System.out.println("IOException Finally:-" + e.getMessage());
    }
   }
  }

 }
}