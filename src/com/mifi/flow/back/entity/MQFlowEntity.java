package com.mifi.flow.back.entity;

import com.google.common.base.Strings;
import com.google.gson.Gson;

public class MQFlowEntity {

	private String redisKey;
	private String datas;
	private String apMac;
	private String ntime;
	
	public String getRedisKey() {
		return redisKey;
	}
	public void setRedisKey(String redisKey) {
		this.redisKey = redisKey;
	}
	public String getDatas() {
		return datas;
	}
	public void setDatas(String datas) {
		this.datas = datas;
	}
	public String getApMac() {
		return apMac;
	}
	public void setApMac(String apMac) {
		this.apMac = apMac;
	}
	public String getNtime() {
		return ntime;
	}
	public void setNtime(String ntime) {
		this.ntime = ntime;
	}
	
	
	public MQFlowEntity _obj2Bean(String _jsonObject){
		if(Strings.isNullOrEmpty(_jsonObject))
			return null ;
		Gson gson=new Gson();
		return gson.fromJson(_jsonObject, MQFlowEntity.class);
	}
	
	
}
