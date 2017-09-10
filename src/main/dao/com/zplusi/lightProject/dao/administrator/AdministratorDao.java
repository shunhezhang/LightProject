package com.zplusi.lightProject.dao.administrator;

import java.util.Map;


import com.zplusi.lightProject.bean.administrator.Administrator;

public interface AdministratorDao {

	int deleteById(Long id);

	int add(Administrator record);

	Administrator getByAccountAndPassword(Map<String, Object> fieldAndValues);
	
	Administrator getById(Long id);

	int updateByPrimaryKeySelective(Administrator record);

	int updateByPrimaryKey(Administrator record);
}
