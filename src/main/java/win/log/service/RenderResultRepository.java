package win.log.service;

import org.springframework.data.mongodb.repository.MongoRepository;

import win.log.models.RenderResult;

public interface RenderResultRepository extends MongoRepository<RenderResult,String>{

}
