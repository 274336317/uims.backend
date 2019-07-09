package com.mackerelpike.uims.backend.dao;

import java.util.List;

import com.mackerelpike.uims.backend.po.Resource_PO;

public interface IResourceDao 
{
	public void add(Resource_PO resource);
	
	public void delete(long id);
	
	public void update(Resource_PO resource);
	
	public List<Resource_PO> getList(int limit, int offset);
}