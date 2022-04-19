package com.springrest.question4;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerQuestion4 {

	@Autowired
	private Validation validation;
	
	@RequestMapping("/visa/{cardNo}")
	public String checkVisa(@PathVariable String cardNo) {
	 return validation.validateVisa(cardNo);
	}
	@RequestMapping("/mastercard/{cardNo}")
	public String checkMasterCard(@PathVariable String cardNo) {
		return validation.validateMasterCard(cardNo);
	}
	@RequestMapping("/jcb/{cardNo}")
	public String checkJCB(@PathVariable String cardNo) {
		return validation.validateJCB(cardNo);
	}
	@RequestMapping("/enroute/{cardNo}")
	public String checkEnRoute(@PathVariable String cardNo) {
		return validation.validatEnRoute(cardNo);
	}
	
	@RequestMapping("/americanExpress/{cardNo}")
	public String checkAmericanExpress(@PathVariable String cardNo) {
		return validation.validateAmericanExpress(cardNo);
	}
}
