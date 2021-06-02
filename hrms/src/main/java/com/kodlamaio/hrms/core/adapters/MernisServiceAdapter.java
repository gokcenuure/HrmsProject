package com.kodlamaio.hrms.core.adapters;


import org.springframework.stereotype.Component;
import tr.gov.nvi.tckimlik.WS.KPSPublicLocator;


@Component
public class MernisServiceAdapter {

	public boolean isNatIdReal(String identificationNumber, String name, String surname, int birthDate) {

  
    
		  try {
	            return new KPSPublicLocator().getKPSPublicSoap().TCKimlikNoDogrula(Long.parseLong(identificationNumber), name, surname, birthDate);
	     } catch (Exception exception) {
	            exception.printStackTrace();
	            return false;
	     }
}}
