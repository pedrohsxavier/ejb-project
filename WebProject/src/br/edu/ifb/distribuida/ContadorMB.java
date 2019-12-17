package br.edu.ifb.distribuida;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import br.edu.ifpb.distribuida.ContadorBean;

@ManagedBean
@SessionScoped
public class ContadorMB {
	@EJB
    ContadorBean contadorBean;
     
    public void incrementar() {
          contadorBean.incrementar();
    }
     
    public int getContador() {
          return contadorBean.getContador();
    }

}
