package yycg.base.action;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import yycg.base.pojo.vo.PageQuery;
import yycg.base.pojo.vo.SysuserCustom;
import yycg.base.pojo.vo.SysuserQueryVo;
import yycg.base.process.result.DataGridResultInfo;

import yycg.base.process.result.ResultInfo;

import yycg.base.service.UserService;


/**
 * 
 * <p>Title: UserAction</p>
 * <p>Description:系统用户管理 </p>
 * <p>Company: www.itcast.com</p> 
 * @author	苗润土
 * @date	2014年11月26日上午10:56:09
 * @version 1.0
 */
@Controller
@RequestMapping("/user")
public class UserAction {
	
	@Autowired
	private UserService userService;
	
	
	//用户查询页面
	@RequestMapping("/queryuser")
	public String queryuser(Model model)throws Exception{
		//将页面所需要的数据取出，传到页面

		return "/base/user/queryuser";
	}
	
	//用户查询页面的结果集
	//最终DataGridResultInfo通过@ResponseBody将java对象转成json
	@RequestMapping("/queryuser_result")
	public @ResponseBody DataGridResultInfo queryuser_result(
			SysuserQueryVo sysuserQueryVo,
			int page,//页码
			int rows//每页显示个数
			)throws Exception{
		
		//非空校验
		sysuserQueryVo = sysuserQueryVo!=null?sysuserQueryVo:new SysuserQueryVo();
		
		//查询列表的总数
		int total = userService.findSysuserCount(sysuserQueryVo);
		
		PageQuery pageQuery = new PageQuery();
		pageQuery.setPageParams(total, rows, page);
		
		sysuserQueryVo.setPageQuery(pageQuery);
		
		//分页查询，向sysuserQueryVo中传入pageQuery
		List<SysuserCustom> list = userService.findSysuserList(sysuserQueryVo);
		
		DataGridResultInfo dataGridResultInfo = new DataGridResultInfo();
		//填充 total
		dataGridResultInfo.setTotal(total);
		//填充  rows
		dataGridResultInfo.setRows(list);
		
		return dataGridResultInfo;
	}
	
	//添加用户页面
	@RequestMapping("/addsysuser")
	public String addsysuser(Model model)throws Exception{
		
		return "/base/user/addsysuser";
	}
	
	public void test() {
		
	}
	
	
	
}
