package ro.ase.csie.cts.g1094.refactor.phase3;

import ro.ase.csie.cts.g1094.refactor.exception.InvalidAgeException;
import ro.ase.csie.cts.g1094.refactor.exception.InvalidPriceException;
import ro.ase.csie.cts.g1094.refactor.phase3.services.Marketing2021Strategy;
import ro.ase.csie.cts.g1094.refactor.phase3.services.MarketingServiceInterface;

public class Product {
	
	MarketingServiceInterface mkService= null;
	
	
	public Product(MarketingServiceInterface mkService) {
//		if(mkService == null) {
//			throw new NullPointerException();
//		}
//		this.mkService=mkService;
		this.setMarketingService(mkService);
}
	
	//optional based on design specs
	
	public void setMarketingService(MarketingServiceInterface mkService)
	{
		if(mkService == null) {
		throw new NullPointerException();
	}
	this.mkService=mkService;
}


	private static float getDiscountValue(float price, float discount) {
		return discount * price;
	}
	private static float getPriceWithDiscountAndFidelity(float price, float discountValue, float fidelityDiscount) {
		return (price - discountValue) - fidelityDiscount * (price - discountValue);
	}
	
	private static float getFinalPrice(float price, float fidelityDiscount, ProductType type) {
		float discountValue=getDiscountValue(price, type.getDiscount());
		float finalPrice = getPriceWithDiscountAndFidelity(price, discountValue, fidelityDiscount);
		return finalPrice;
	}
		public float computePriceWithDiscount(ProductType productType, float initialPrice, int accountAge) throws InvalidAgeException, InvalidPriceException
		  {
			if(initialPrice<=0) {
				throw new InvalidPriceException();
			}
			if(accountAge<=0) {
				throw new InvalidAgeException();
			}
		    float finalPrice = 0;
		    float fidelityDiscount = (productType==ProductType.NEW) ? 0 : mkService.getFidelityDiscount(accountAge);
		    finalPrice=getFinalPrice(initialPrice,fidelityDiscount, productType );
		    
		    return finalPrice;
		  }
	}