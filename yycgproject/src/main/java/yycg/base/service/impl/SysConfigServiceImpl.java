package yycg.base.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import yycg.base.dao.mapper.DictinfoMapper;
import yycg.base.pojo.po.Dictinfo;
import yycg.base.pojo.po.DictinfoExample;
import yycg.base.pojo.po.DictinfoExample.Criteria;
import yycg.base.service.SysConfigService;

public class SysConfigServiceImpl implements SysConfigService {
	
	@Autowired
	private DictinfoMapper dictInfoMapper;
	
	@Override
	public List<Dictinfo> findSysInfoByType(String type) throws Exception {
		
		DictinfoExample dictinfoExample = new DictinfoExample();
		Criteria criteria = dictinfoExample.createCriteria();
		criteria.andTypecodeEqualTo(type);
		
		return dictInfoMapper.selectByExample(dictinfoExample);
	}
	
}
