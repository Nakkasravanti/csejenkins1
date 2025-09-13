package com.example.data;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

@Service
public class CseSortService {
@Autowired
CseSortRepo repo;
public SortEntity insertdata(SortEntity data) {
	return repo.save(data);
	
}
public Page<SortEntity> csepage(int offset,int pagesize){
	Page<SortEntity> data=repo.findAll(PageRequest.of(offset, pagesize));
	return data;
}
public List<SortEntity> oursort(String field){
	return (List<SortEntity>) repo.findAll(Sort.by(Sort.Direction.ASC,field));
}
}
