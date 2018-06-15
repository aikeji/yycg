package yycg.base.service;

import java.util.List;

import yycg.base.pojo.po.Dictinfo;

public interface SysConfigService {
	
	public List<Dictinfo> findSysInfoByType(String type) throws Exception;
	
}
