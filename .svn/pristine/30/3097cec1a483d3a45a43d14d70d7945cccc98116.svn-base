package com.zplusi.lightProject.service.administrator;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.zplusi.lightProject.bean.administrator.Administrator;
import com.zplusi.lightProject.dao.administrator.AdministratorDao;
import com.zplusi.lightProject.service.AbstractBaseService;

/**
 * =========================<br/>
 * 管理员管理业务，包括新增、更新、删除、登录、注销等业务<br/>
 * Date：2016-12-25 22:21:10<br/>
 * Author shunhezhang<br/>
 * =========================<br/>
 * */
@Service
public class AdministratorService extends AbstractBaseService{

	@Resource
	private AdministratorDao administratorDao;
	
	/**
	 * =============================<br/>
	 * 添加管理员<br/>
	 * Date：2016-12-25 22:22:50<br/>
	 * @param administrator 被添加的管理员<br/>
	 * =============================<br/>
	 * */
	public Map<Boolean, String> addAdministrator (Administrator administrator) {
		Map<Boolean, String> result = new HashMap<Boolean, String>();
		administrator.setStatus((short)1);
		administrator.setIsDeleted((short)0);
		int flag = administratorDao.add(administrator);
		
		return result;
	}
}
