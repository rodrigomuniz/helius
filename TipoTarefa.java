package helius.tipoTarefa;

public class TipoTarefa {
  private String codTipoTarefa;
  private String nomeTipoTarefa;
	
  	public TipoTarefa(String codTipoTarefa, String nomeTipoTarefa){
  		this.codTipoTarefa = codTipoTarefa;
		this.nomeTipoTarefa = nomeTipoTarefa;
	}

// getters and setters
public String getCodTipoTarefa() {
	return codTipoTarefa;
	}

public void setCodTipoTarefa(String codTipoTarefa) {
	this.codTipoTarefa = codTipoTarefa;
	}

public String getNomeTipoTarefa() {
	return nomeTipoTarefa;
	}

public void setNomeTipoTarefa(String nomeTipoTarefa) {
	this.nomeTipoTarefa = nomeTipoTarefa;
	}

}
