package win.log.service;

import org.springframework.data.mongodb.repository.MongoRepository;

import win.log.models.WebModel;

public interface WebModelRepository extends MongoRepository<WebModel, String>{

}
