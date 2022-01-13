package base.admin;

import base.entidades.Contabilidade;
import base.entidades.Funcionario;
import base.entidades.Usuario;

public interface SuperUsuario {

    public boolean eliminarUsuario(Usuario usuario);

    public boolean eliminarFuncionario(Funcionario funcionario);

    public boolean  eliminarAluno(Usuario usuario);

    public boolean recuperarPassWord(String id);

    // contabilidade
    public void consulatSaldoActualInstituicao();
    public void consultarSaldoPorUmaCondicao(String condicao);
    public void pagoDeUmServico(Contabilidade contabilidade);

}
