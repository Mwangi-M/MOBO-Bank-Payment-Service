package com.example.moboBank;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class MoboBankApplication {

	public static void main(String[] args) {

		SpringApplication.run(MoboBankApplication.class, args);
	}

	@PostMapping("/balance")
	public BalanceResponse getBalance(@RequestBody BalanceRequest request) {

		// Retrieve required fields from the request payload
		String transactionReference = request.getTransactionReference();
		String transactionCode = request.getTransactionCode();
		double amount = request.getAmount();
		String narration = request.getNarration();
		String phoneNumber = request.getPhoneNumber();

		// Prepare the response payload
		BalanceResponse response = new BalanceResponse();
		response.setTransactionReference(transactionReference);
		response.setTransactionCode(transactionCode);
		response.setAmount(amount);
		response.setAccountName("John Doe"); // Replace with actual account name
		response.setPhoneNumber(phoneNumber);
		response.setActualBalance(500); // Replace with actual balance
		response.setAvailableBalance(500); // Replace with actual available balance

		return response;
	}
}

class BalanceRequest {
	private String transactionReference;
	private String transactionCode;
	private double amount;
	private String narration;
	private String phoneNumber;

	public String getTransactionReference() {
		return transactionReference;
	}

	public void setTransactionReference(String transactionReference) {
		this.transactionReference = transactionReference;
	}

	public String getTransactionCode() {
		return transactionCode;
	}

	public void setTransactionCode(String transactionCode) {
		this.transactionCode = transactionCode;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public String getNarration() {
		return narration;
	}

	public void setNarration(String narration) {
		this.narration = narration;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
}

class BalanceResponse {
	private String transactionReference;
	private String transactionCode;
	private double amount;
	private String accountName;
	private String phoneNumber;
	private double actualBalance;
	private double availableBalance;

	public String getTransactionReference() {
		return transactionReference;
	}

	public void setTransactionReference(String transactionReference) {
		this.transactionReference = transactionReference;
	}

	public String getTransactionCode() {
		return transactionCode;
	}

	public void setTransactionCode(String transactionCode) {
		this.transactionCode = transactionCode;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public String getAccountName() {
		return accountName;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public double getActualBalance() {
		return actualBalance;
	}

	public void setActualBalance(double actualBalance) {
		this.actualBalance = actualBalance;
	}

	public double getAvailableBalance() {
		return availableBalance;
	}

	public void setAvailableBalance(double availableBalance) {
		this.availableBalance = availableBalance;
	}
}