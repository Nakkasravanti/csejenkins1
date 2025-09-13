package com.example.data;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SortController {
	@Autowired
	CseSortService s;
@PostMapping("/cse/insert")
public SortEntity insert(@RequestBody SortEntity data) {
	return s.insertdata(data);
}
@GetMapping("/getall/{offset}/{pagesize}")
public Page<SortEntity> getall(@PathVariable int offset ,@PathVariable int pagesize){
	Page<SortEntity> pagedata=s.csepage(offset, pagesize);
	return pagedata;
}
@GetMapping("/sort/{field}")
public List<SortEntity> getsort(@PathVariable String field){
	return (List<SortEntity>) s.oursort(field);
}
}
