package yycg.base.service.impl;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;

import yycg.base.dao.mapper.SysuserMapper;
import yycg.base.dao.mapper.SysuserMapperCustom;
import yycg.base.dao.mapper.UsergysMapper;
import yycg.base.dao.mapper.UserjdMapper;
import yycg.base.dao.mapper.UseryyMapper;
import yycg.base.pojo.po.Sysuser;
import yycg.base.pojo.po.SysuserExample;
import yycg.base.pojo.po.Usergys;
import yycg.base.pojo.po.SysuserExample.Criteria;
import yycg.base.pojo.po.UsergysExample;
import yycg.base.pojo.po.Userjd;
import yycg.base.pojo.po.UserjdExample;
import yycg.base.pojo.po.Useryy;
import yycg.base.pojo.po.UseryyExample;
import yycg.base.pojo.vo.SysuserCustom;
import yycg.base.pojo.vo.SysuserQueryVo;
import yycg.base.process.context.Config;
import yycg.base.process.result.ExceptionResultInfo;
import yycg.base.process.result.ResultInfo;
import yycg.base.process.result.ResultUtil;
import yycg.base.service.UserService;
import yycg.util.UUIDBuild;

public class UserServiceImpl implements UserService {

	// 注入 mapper
	@Autowired
	private SysuserMapperCustom sysuserMapperCustom;
	
	@Autowired
	private SysuserMapper sysuserMapper;
	
	@Autowired
	private UserjdMapper userjdMapper;
	
	@Autowired
	private UseryyMapper useryyMapper;
	
	@Autowired
	private UsergysMapper usergysMapper;
	

	
	@Override
	public List<SysuserCustom> findSysuserList(SysuserQueryVo sysuserQueryVo)
			throws Exception {
		return sysuserMapperCustom.findSysuserList(sysuserQueryVo);
	}

	@Override
	public int findSysuserCount(SysuserQueryVo sysuserQueryVo) throws Exception {
		return sysuserMapperCustom.findSysuserCount(sysuserQueryVo);
	}
	
	public Sysuser findSysuserByUserid(String userId) throws Exception{
		
		SysuserExample sysuserExample = new SysuserExample();
		Criteria criteria = sysuserExample.createCriteria();
		criteria.andUseridEqualTo(userId);
		List<Sysuser> list = sysuserMapper.selectByExample(sysuserExample);
		if (list != null && list.size() == 1) {
			return list.get(0);
		}
		return null;
	}
	
	public Userjd findUserjdByMc(String symc) throws Exception{
		
		UserjdExample userjdExample = new UserjdExample();
		UserjdExample.Criteria criteria = userjdExample.createCriteria();
		criteria.andMcEqualTo(symc);
		
		List<Userjd> list = userjdMapper.selectByExample(userjdExample);
		
		if (list != null && list.size() == 1) {
			return list.get(0);
		}
		return null;
	}
	
	public Useryy findUseryyByMc(String symc) throws Exception{
		
		UseryyExample useryyExample = new UseryyExample();
		UseryyExample.Criteria criteria = useryyExample.createCriteria();
		criteria.andMcEqualTo(symc);
		
		List<Useryy> list = useryyMapper.selectByExample(useryyExample);
		
		if (list != null && list.size() == 1) {
			return list.get(0);
		}
		return null;
	}
	
	public Usergys findUsergysByMc(String symc) throws Exception{
			
		UsergysExample usergysExample = new UsergysExample();
		UsergysExample.Criteria criteria = usergysExample.createCriteria();
		criteria.andMcEqualTo(symc);
		
		List<Usergys> list = usergysMapper.selectByExample(usergysExample);
		
		if (list != null && list.size() == 1) {
			return list.get(0);
		}
		return null;
	}
	
	@Override
	public void insertSysuser(SysuserCustom sysuserCustom) throws Exception {
		
		Sysuser sysuser = this.findSysuserByUserid(sysuserCustom.getUserid());
		if (sysuser != null) {
//			ResultInfo resultInfo = new ResultInfo();
//			resultInfo.setType(ResultInfo.TYPE_RESULT_FAIL);
//			resultInfo.setMessage("账号重复");
//			throw new ExceptionResultInfo(resultInfo);
			ResultUtil.throwExcepion(ResultUtil.createInfo(Config.MESSAGE, 213, null));
		}
		
		String groupId = sysuserCustom.getGroupid();
		String symc = sysuserCustom.getSysmc();
		String sysId = null;
		if (groupId.equals("1") || groupId.equals("2")) {
			Userjd userjd = this.findUserjdByMc(symc);
			if (userjd == null) {
				throw new Exception("单位名称输入错误");
			}
			sysId = userjd.getId();
		}else if (groupId.equals("3")) {
			Useryy useryy = this.findUseryyByMc(symc);
			if (useryy == null) {
				throw new Exception("单位名称输入错误");
			}
			sysId = useryy.getId();
		}else if (groupId.equals("4")) {
			Usergys usergys = this.findUsergysByMc(symc);
			if (usergys == null) {
				throw new Exception("单位名称输入错误");
			}
			sysId = usergys.getId();
		}
		
		sysuserCustom.setId(UUIDBuild.getUUID());
		sysuserCustom.setSysid(sysId);
		
		System.out.println(sysuserCustom.toString());
		
		sysuserMapper.insert(sysuserCustom);
	}

	
}
