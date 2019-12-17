package br.edu.ifpb.distribuida;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

@Stateless
@LocalBean
public class GrausBean {

	 public double converterParaFahrenheit(double c) {
	      return c * 1.8 + 32;
	    }


}
