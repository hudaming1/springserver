package org.hum.springserver.controller.work;

import java.util.Arrays;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSONObject;

@Controller
@RequestMapping("/express")
public class ExpressController {

	private static final Logger logger = LoggerFactory.getLogger(ExpressController.class);

	@RequestMapping("/zto/callback")
	@ResponseBody
	public Object ztoCallback(HttpServletRequest request) {
		logger.info("zto.callback.start");
		if (!request.getParameterMap().isEmpty()) {
			request.getParameterMap().entrySet().forEach(p -> {
				logger.info(p.getKey() + "=" + Arrays.toString(p.getValue()));
			});
		}
		logger.info("zto.callback.end");
		JSONObject result = new JSONObject();
		result.put("status", true);
		return result;
	}

	@RequestMapping("/yt/callback")
	@ResponseBody
	public Object ytCallback(HttpServletRequest request) {
		logger.info("yt.callback.start");
		if (!request.getParameterMap().isEmpty()) {
			request.getParameterMap().entrySet().forEach(p -> {
				logger.info(p.getKey() + "=" + Arrays.toString(p.getValue()));
			});
		}
		logger.info("yt.callback.end");
		JSONObject result = new JSONObject();
		result.put("status", true);
		return result;
	}

	@RequestMapping("/sto/callback")
	@ResponseBody
	public Object stoCallback(HttpServletRequest request) {
		logger.info("sto.callback.start");
		if (!request.getParameterMap().isEmpty()) {
			request.getParameterMap().entrySet().forEach(p -> {
				logger.info(p.getKey() + "=" + Arrays.toString(p.getValue()));
			});
		}
		logger.info("sto.callback.end");
		JSONObject result = new JSONObject();
		result.put("status", true);
		return result;
	}

	@RequestMapping("/zjs/callback")
	@ResponseBody
	public Object zjsCallback(HttpServletRequest request) {
		logger.info("zjs.callback.start");
		if (!request.getParameterMap().isEmpty()) {
			request.getParameterMap().entrySet().forEach(p -> {
				logger.info(p.getKey() + "=" + Arrays.toString(p.getValue()));
			});
		}
		logger.info("zjs.callback.end");
		JSONObject result = new JSONObject();
		result.put("status", true);
		return result;
	}

	@RequestMapping("/bskd/callback")
	@ResponseBody
	public Object bskdCallback(HttpServletRequest request) {
		logger.info("bskd.callback.start");
		if (!request.getParameterMap().isEmpty()) {
			request.getParameterMap().entrySet().forEach(p -> {
				logger.info(p.getKey() + "=" + Arrays.toString(p.getValue()));
			});
		}
		logger.info("bskd.callback.end");
		JSONObject result = new JSONObject();
		result.put("status", true);
		return result;
	}


	@RequestMapping("/kd100/callback")
	@ResponseBody
	public Object kd100Callback(HttpServletRequest request) {
		logger.info("kd100.callback.start");
		if (!request.getParameterMap().isEmpty()) {
			request.getParameterMap().entrySet().forEach(p -> {
				logger.info(p.getKey() + "=" + Arrays.toString(p.getValue()));
			});
		}
		logger.info("kd100.callback.end");
		JSONObject result = new JSONObject();
		result.put("status", true);
		return result;
	}
}
