package entity;

public class PremiumCustomer {

	private int premiumCustomerId;
	private int userId;
	private int numberOfMoviesIssued;
	private String subscriptionPlan;
	private String subscriptionFees;
	private String paymentStatus;
	

	public int getPremiumCustomerId() {
		return premiumCustomerId;
	}

	public void setPremiumCustomerId(int premiumCustomerId) {
		this.premiumCustomerId = premiumCustomerId;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public int getNumberOfMoviesIssued() {
		return numberOfMoviesIssued;
	}

	public void setNumberOfMoviesIssued(int numberOfMoviesIssued) {
		this.numberOfMoviesIssued = numberOfMoviesIssued;
	}

	public String getSubscriptionPlan() {
		return subscriptionPlan;
	}

	public void setSubscriptionPlan(String subscriptionPlan) {
		this.subscriptionPlan = subscriptionPlan;
	}

	public String getSubscriptionFees() {
		return subscriptionFees;
	}

	public void setSubscriptionFees(String subscriptionFees) {
		this.subscriptionFees = subscriptionFees;
	}

	public String getPaymentStatus() {
		return paymentStatus;
	}

	public void setPaymentStatus(String paymentStatus) {
		this.paymentStatus = paymentStatus;
	}
}
