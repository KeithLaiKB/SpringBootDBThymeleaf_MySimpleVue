package com.mytest.testweb_package.mycontroller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

//A convenience annotation that is itself annotated with @Controller and @ResponseBody.
//@RestController 
//@RestController 包含了 @Controller 和 @ResponseBody
//用 @RestController 这杨会导致 return string的时候 直接输出的是 数据
//
//所以我打算用@Controller, 这样我返回 return "/index" 是去到一个页面
//然后 如果我要返回一个数据，只需要在一个方法上面 添加一个@ResponseBody 就可以输出数据了

@Controller
@RequestMapping(value="/")
public class MyEntryController {
	//尝试  页面路径直接来这里 进行获取数据的操作  
	@RequestMapping(value="/myindex", method=RequestMethod.GET)
	public ModelAndView myIndex()
	{
		//
		System.out.println("hi");
		//
		ModelAndView modelAndView1=new ModelAndView();
		modelAndView1.setViewName("/myindex");
		return modelAndView1;
		
	}
	
	/**
	 * 这里的 map 可以不写成参数，这个方法空参数也行, 毕竟 一般index 不需要map携带什么东西
	 * 这里有map 只不过是为了让你看的舒服点罢了
	 * @param map
	 * @return
	 */
    @RequestMapping("/index")
    public String index(Map<String, Object> map) {
        return "myindex";
    }
    
    /**
     * 这样就可以输出数据了, 因为一般输出 数据 ，是有东西传进来然后处理, 然后再输出
     * @param map
     * @return
     */
    @ResponseBody
    @RequestMapping("/index_rsb")
    public String tryAnnotationResponseBody(Map<String, Object> map) {
    	//处理map
        return "myindex";
    }
}
