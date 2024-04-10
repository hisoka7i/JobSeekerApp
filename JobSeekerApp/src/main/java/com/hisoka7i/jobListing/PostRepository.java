package com.hisoka7i.jobListing;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.hisoka7i.jobListing.model.Post;

//We have added a started data mongodb in the pom.xml 
//here mongorepository will take care of all the crud operations
public interface PostRepository extends MongoRepository<Post, String>{

}
