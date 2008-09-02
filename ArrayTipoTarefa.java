package helius.tipoTarefa;

public class ArrayTipoTarefa implements RepositorioTipoTarefa{
	private TipoTarefa[] tipoTarefa;
	private int indice;
	private final static int tamCache = 100;
	private static ArrayTipoTarefa instance;
	
	public ArrayTipoTarefa() {
		indice = 0;
		tipoTarefa = new TipoTarefa[tamCache];
	}

	public synchronized static ArrayTipoTarefa getInstance() {
		if (instance == null) {
			instance = new ArrayTipoTarefa();
		}
		return instance;
	}
	
	public void atualizar(TipoTarefa tt)
		throws TipoTarefaInexistenteException {
		int i = procurarIndice(tt.getCodTipoTarefa());
		if (i != -1) {
				tipoTarefa[i] = tt;
		} else {
			throw new TipoTarefaException("Tipo de Tarefa não encontrado");
		}
	}
	public boolean existe(String codTipoTarefa) {
		boolean resp = false;

        int i = this.procurarIndice(codTipoTarefa);
        if(i != -1){
              resp = true;
        }

        return resp;
	}
	
    public void inserir(TipoTarefa c) 
    throws TipoTarefaExistenteException {
      if (existe(tt.getCodTipoTarefa())) {
      	throw new ClienteExistenteException("Tipo de tarefa já cadastrada");	
      } else {
      	tipoTarefa[indice] = tt;
          indice = indice + 1;	
      }
  }
    
    public TipoTarefa procurar(String codTipoTarefa) 
    throws TipoTarefaInexistenteException {
    TipoTarefa tt = null;
    if (existe(codTipoTarefa)) {
        int i = this.procurarIndice(codTipoTarefa);
      tt = tipoTarefa[i];
    } else {
  	  throw new TipoTarefaInexistenteException("Tipo de Tarefa não encontrado");
    }

    return tt;
  }

    private int procurarIndice(String codTipoTarefa) {
        int     i = 0;
        int     ind = -1;
        boolean achou = false;

        while ((i < indice) &&!achou) {
          if ((tipoTarefa[i].getCodTipoTarefa()).equals(codTipoTarefa)) {
              ind = i;
              achou = true;
          }
          i = i + 1;
        }
        return ind;
      }

    public void remover(String codTipoTarefa)
    throws TipoTarefaInexistenteException {
    if (existe(codTipoTarefa)) {
        int i = this.procurarIndice(codTipoTarefa);
        tipoTarefa[i] = tipoTarefa[indice - 1];
        tipoTarefa[indice - 1] = null;
        indice = indice - 1;
    } else {
  	  throw new TipoTarefaInexistenteException("Tipo de tarefa não encontrado");
    }
  }
    
}
