package helius.tipoTarefa;

import java.sql.SQLException;

public class RepositorioTipoTarefa {

	public void inserir(TipoTarefa tipoTarefa) throws TipoTarefaExistenteException;

	public void remover(String codTipoTarefa) throws TipoTarefaInexistenteException;

	public TipoTarefa procurar(String codTipoTarefa) throws TipoTarefaInexistenteException;

	public void atualizar(TipoTarefa tipoTarefa) throws TipoTarefaInexistenteException;

	public boolean existe(String codTipoTarefa);
}