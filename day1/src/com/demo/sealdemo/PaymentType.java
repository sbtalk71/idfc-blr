package com.demo.sealdemo;

import java.util.logging.Logger;

public sealed class PaymentType permits CardPayment,NetBanking{

	protected Logger logger=Logger.getLogger(this.getClass().getName());
	
	public String makePayment(double amount) {
		logger.info("To be implemented by subclasses");
		return "failed";
	}
}
