package kkm.com.core.model.response.tatasky.productlist;

import com.google.gson.annotations.SerializedName;

public class RequestProductList{

	@SerializedName("Type")
	private String type;

	@SerializedName("Amount_All")
	private String amountAll;

	@SerializedName("NUMBER")
	private String nUMBER;

	@SerializedName("Amount")
	private String amount;

	@SerializedName("RegionId")
	private String regionId;

	public void setType(String type){
		this.type = type;
	}

	public String getType(){
		return type;
	}

	public void setAmountAll(String amountAll){
		this.amountAll = amountAll;
	}

	public String getAmountAll(){
		return amountAll;
	}

	public void setNUMBER(String nUMBER){
		this.nUMBER = nUMBER;
	}

	public String getNUMBER(){
		return nUMBER;
	}

	public void setAmount(String amount){
		this.amount = amount;
	}

	public String getAmount(){
		return amount;
	}

	public void setRegionId(String regionId){
		this.regionId = regionId;
	}

	public String getRegionId(){
		return regionId;
	}

	@Override
 	public String toString(){
		return 
			"RequestProductList{" + 
			"type = '" + type + '\'' + 
			",amount_All = '" + amountAll + '\'' + 
			",nUMBER = '" + nUMBER + '\'' + 
			",amount = '" + amount + '\'' + 
			",regionId = '" + regionId + '\'' + 
			"}";
		}
}