package com.demo.sealdemo;

public final class NetBanking extends PaymentType {

	@Override
	public String makePayment(double amount) {
		logger.info("Payment processing with Net Banking");
		return "success";
	}
}
