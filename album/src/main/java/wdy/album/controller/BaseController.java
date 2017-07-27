package wdy.album.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
import wdy.album.model.UserInfo;

@EnableSwagger2
@Api("验证接口")
@RestController
public class BaseController {

	@ApiOperation(value = "登录", response = String.class, notes = "登录")
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String Login(@RequestBody UserInfo userInfo,HttpServletRequest request){
		
		
		return "";
	}
	
}