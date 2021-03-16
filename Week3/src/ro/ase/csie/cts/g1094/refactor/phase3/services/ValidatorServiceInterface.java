package ro.ase.csie.cts.g1094.refactor.phase3.services;

import ro.ase.csie.cts.g1094.refactor.exception.InvalidAgeException;
import ro.ase.csie.cts.g1094.refactor.exception.InvalidPriceException;

public interface ValidatorServiceInterface {
	public void validatePrice(float price) throws InvalidPriceException;
	public void validateAge(int Age) throws InvalidAgeException;
}
