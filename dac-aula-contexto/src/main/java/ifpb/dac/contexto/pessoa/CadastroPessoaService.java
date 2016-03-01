package ifpb.dac.contexto.pessoa;

import java.util.List;

/**
 * @author Ricardo Job
 * @mail ricardo.job@ifpb.edu.br
 * @since 01/03/2016, 07:31:55
 */
public class CadastroPessoaService {

    private ReposistorioDePessoa reposistorio;

    public CadastroPessoaService() {
        this(new ReposistorioDePessoa());
    }

    public CadastroPessoaService(ReposistorioDePessoa reposistorio) {
        this.reposistorio = reposistorio;
    }

    public void salvar(Pessoa pessoa) {
        reposistorio.salvar(pessoa);
    }

    public List<Pessoa> todos() {
        return reposistorio.todos();
    }

    public void excluir(Pessoa pessoa) {
       reposistorio.excluir(pessoa);
    }
}
