package com.huiwan.gdata.modules.gdata.Crash.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.huiwan.gdata.common.annotatiions.MenuAnnot;
import com.huiwan.gdata.common.bean.ResultBean;
import com.huiwan.gdata.common.constants.Modules;
import com.huiwan.gdata.common.exception.MessageCode;
import com.huiwan.gdata.modules.sys.vo.UserVo;

@Controller
@RequestMapping("crash/gcrash")
@MenuAnnot(id = "crash:gcrash", name = "游戏蹦溃分析", parentId = Modules.CRASH, href = "/views/modules/gdata/crash/gcrashList", sortNo = 1)
public class CrashReportController extends CrashBaseController {

//	@PermissionAnnot(id = "pro:mer:list",name = "查询列表")
	@RequestMapping(value = { "gcrashList", "" }, method = RequestMethod.GET)
	@ResponseBody
	public ResultBean getList(
			@RequestParam(value = "page", defaultValue = "1") Integer page,
			@RequestParam(value = "pagesize", defaultValue = "20") Integer pagesize,
			UserVo user) {
		ResultBean rb = new ResultBean();
		try {
			// QueryResult<User> result = userService.getUserList(page,
			// pagesize,
			// user);
			rb.setData("");
		} catch (Exception e) {
			e.printStackTrace();
			rb = new ResultBean(false, MessageCode.SYS_ERROR, "异统异常");
		}
		return rb;

	}
}
