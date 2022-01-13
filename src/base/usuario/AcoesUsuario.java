package base.usuario;

import base.alunos.Aluno;
import base.documentos.Declaracao;
import base.documentos.Documento;
import base.entidades.Escola;
import base.entidades.Funcionario;
import base.entidades.Usuario;
import java.util.List;

public interface AcoesUsuario {

    public List<Funcionario> listarFuncionario();

    public Funcionario imprimirFichaFuncioanrio(String id);

    public boolean editarFuncionario(String id);

    public void imprimirListaFuncionarios();

    public void imprimirListaFuncionariosUmaCondicao(String condicao);

    public Declaracao crearDeclacao(Funcionario funcionarioBeneficiado, Usuario usuario, String tipoDeclaracao); // tipo de declaraco [de servico, bpc, t servico ....]

    public Documento correspondenciaDocumento(Documento tipoDoc); // o tipo sera referido ao nome fichero

// parte de alunos 
    public List<Aluno> listarTodosAlunos(); // istno no sera necesario

    public List<Aluno> listarAlunosPorUmaCondicao(String condicao);

    public Aluno imprimirFichaAluno(String id);

    // pautas 
    public Aluno consultaPautaDeUmAluno(String id);

    public List<Aluno> listaTotalAlunosMatriculadoPorAnoTodoMunicipio(int ano);

    public List<Aluno> listaTotalAlunosMatriculadoPorAnoTodoMunicipioPorNivelEscola(int ano, Escola escola); // Dentro de escola teremos os Nivel de ensino primario, superior

    public List<Aluno> listaTotalAlunosMatriculadoPorEscolaCondicional(int ano, String condicao); // Escola, Nivel{primario, condicao}, comuna, o municipio

    // desitentes
    public List<Aluno> listaTotalAlunosDesistidoPorCondicao(int ano, String condicao); // Escola, Nivel, comuna, o municipio

    public List<Aluno> listaTotalAlunosDesistidoPorEscola(int ano, String nomEscola);

    // falecidos 
    public List<Aluno> listaTotalAlunosFalecidosPorCondicao(int ano, String condicao); // Escola, Nivel, comuna, o municipio

    public List<Aluno> listaTotalAlunosFalecidosPorEscola(int ano, Escola escola);
    // reprovados 

    public List<Aluno> listaTotalAlunosReprovadosPorCondicao(int ano, String condicao); // Escola, Nivel, comuna, o municipio

    public List<Aluno> listaTotalAlunosReprovadosPorEscola(int ano, Escola escola);
}
