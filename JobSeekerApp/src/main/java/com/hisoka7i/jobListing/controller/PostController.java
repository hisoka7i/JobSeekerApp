package com.hisoka7i.jobListing.controller;

import java.io.IOException;
import java.util.List;

import com.hisoka7i.jobListing.PostRepository;
import com.hisoka7i.jobListing.model.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.servlet.http.HttpServletResponse;
import springfox.documentation.annotations.ApiIgnore;

@RestController
public class PostController {
	@Autowired
	PostRepository repo;
	
	@ApiIgnore
	@RequestMapping(value="/")
	public void Redirect(HttpServletResponse response) throws IOException {
		response.sendRedirect("/");
	}
	
	@GetMapping("/posts")
	public List<Post> getAllPosts(){
		//This the method present in the interface which implements mongorepository
		return repo.findAll();
	}
	@PostMapping("/post")
	public Post adddata(@RequestBody Post post){
		return repo.save(post);
	}
}
