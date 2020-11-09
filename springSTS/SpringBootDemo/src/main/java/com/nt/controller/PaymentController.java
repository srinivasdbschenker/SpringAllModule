package com.nt.controller;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.nt.bo.BaseResponse;
import com.nt.bo.PaymentRequest;

@RestController
@RequestMapping("/payment")
public class PaymentController {

	private final String sharedKey ="SHARED_KEY";
	
	private static final String ERROR_STATUS="error";
	private static final String SUCCESS_STATUS="success";
	
	private static final int CODE_SUCCESS =100;
	private static final int AUTH_FAILURE=102;
	
	@RequestMapping(value="/pay", method=RequestMethod.POST)
	public BaseResponse pay(@RequestParam(value="key") String key, @RequestBody PaymentRequest request) {
		BaseResponse response=new BaseResponse();
		if(sharedKey.equalsIgnoreCase(key)){
			int userId=request.getUserId();
			String itemId=request.getItemId();
			double discount=request.getDiscount();
			
			response.setStatus(SUCCESS_STATUS);
			response.setCode(CODE_SUCCESS);
			
			
		}else {
			response.setStatus(ERROR_STATUS);
			response.setCode(AUTH_FAILURE);
		}
		return response;
		
	}
}
