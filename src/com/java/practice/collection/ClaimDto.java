package com.java.practice.collection;

public class ClaimDto {
	String claimId;
    String policyId;
    double claimAmount;
    
    public ClaimDto(String claimId, String policyId, double claimAmount) {
		this.claimId = claimId;
		this.policyId = policyId;
		this.claimAmount = claimAmount;
	}
	
	public String getClaimId() {
		return claimId;
	}
	public void setClaimId(String claimId) {
		this.claimId = claimId;
	}
	public String getPolicyId() {
		return policyId;
	}
	public void setPolicyId(String policyId) {
		this.policyId = policyId;
	}
	public double getClaimAmount() {
		return claimAmount;
	}
	public void setClaimAmount(double claimAmount) {
		this.claimAmount = claimAmount;
	}
    
    

}
