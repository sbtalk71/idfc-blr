package com.demo.sealdemo;

public non-sealed class  CardPayment extends PaymentType {

	@Override
	public String makePayment(double amount) {
		logger.info("Payment processing with Credit Card...");
		return "success";
	}
}
