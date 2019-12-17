package br.edu.ifb.distribuida;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.ejb.EJB;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import br.edu.ifpb.distribuida.VisitasBean;

@ManagedBean
@SessionScoped
public class VisitasMB {
	@EJB
    VisitasBean visitasBean;
     
    private String visitante;

    public void entrouVisita() {
          visitasBean.entrouVisita(visitante);           
    }      
     
    public List<String> getVisitas(){
           return new ArrayList<String>(visitasBean.getListaVisitantes());
    }
     
    public String getVisitante() {
          return visitante;
    }

    public void setVisitante(String visitante) {
          this.visitante = visitante;
    }

}
