package com.followbuyme.building.mongodb.dao;

import java.io.InputStream;
import java.util.List;

import com.mongodb.DBObject;
import com.mongodb.gridfs.GridFSDBFile;

public interface FileStorageDao {

 public String store(InputStream inputStream, String fileName, String contentType, DBObject metaData);
 
 public GridFSDBFile retrive(String fileName);

 public GridFSDBFile getById(String id);

 public GridFSDBFile getByFilename(String filename);

 public List<GridFSDBFile> findAll();
 
 public void delete(String id);

}