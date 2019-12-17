package br.edu.ifpb.distribuida;

import javax.ejb.Local;
import javax.ejb.Singleton;

@Singleton
@Local
public class ContadorBean {
	int contador;
	  
    public int getContador() {
          return contador;
    }
     
    public void incrementar(){
          contador++;
    }



}
