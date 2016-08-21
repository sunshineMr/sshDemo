package com.likai.sshDemo.bases;

import java.lang.reflect.ParameterizedType;

public class BaseDaoImpl<T> implements IBaseDao<T>{
	
	private Class<T> clazz;
	
	@SuppressWarnings("unchecked")
	public BaseDaoImpl(){
		ParameterizedType ptype = (ParameterizedType) clazz.getClass().getGenericSuperclass();
		this.clazz = (Class<T>) ptype.getActualTypeArguments()[0];
	}
}
