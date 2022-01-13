package base.entidades;

import base.documentos.Documento;
import base.documentos.Declaracao;
import base.alunos.Aluno;
import base.entidades.Pessoal;
import base.usuario.AcoesUsuario;
import java.util.List;

public class Usuario extends Pessoal implements AcoesUsuario {

    private String accaoRealizada; // aqui constara toda accoa feita pelo usuario
    private String arquivoListaFuncionarios;

    // construtor sem paramentros
    public Usuario() {
        // inicializar todo tipo de arcquivos que se va precisar para esta classe
        this.arquivoListaFuncionarios = "listaFuncionario.txt";
    }

// construtor com paramentos 
    public Usuario(String accaoRealizada, String nome, String apelido, String edade) {
        super(nome, apelido, edade);
        this.accaoRealizada = accaoRealizada;
    }

    // getter and setter
    public String getAccaoRealizada() {
        return accaoRealizada;
    }

    public void setAccaoRealizada(String accaoRealizada) {
        this.accaoRealizada = accaoRealizada;
    }

    // metos heredados 

    @Override
    public List<Funcionario> listarFuncionario() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Funcionario imprimirFichaFuncioanrio(String id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean editarFuncionario(String id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void imprimirListaFuncionarios() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void imprimirListaFuncionariosUmaCondicao(String condicao) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Declaracao crearDeclacao(Funcionario funcionarioBeneficiado, Usuario usuario, String tipoDeclaracao) { // returna un fichero
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Documento correspondenciaDocumento(Documento tipoDoc) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Aluno> listarTodosAlunos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Aluno> listarAlunosPorUmaCondicao(String condicao) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Aluno imprimirFichaAluno(String id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Aluno consultaPautaDeUmAluno(String id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Aluno> listaTotalAlunosMatriculadoPorAnoTodoMunicipio(int ano) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Aluno> listaTotalAlunosMatriculadoPorAnoTodoMunicipioPorNivelEscola(int ano, Escola escola) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Aluno> listaTotalAlunosMatriculadoPorEscolaCondicional(int ano, String condicao) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Aluno> listaTotalAlunosDesistidoPorCondicao(int ano, String condicao) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Aluno> listaTotalAlunosDesistidoPorEscola(int ano, String nomEscola) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Aluno> listaTotalAlunosFalecidosPorCondicao(int ano, String condicao) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Aluno> listaTotalAlunosFalecidosPorEscola(int ano, Escola escola) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Aluno> listaTotalAlunosReprovadosPorCondicao(int ano, String condicao) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Aluno> listaTotalAlunosReprovadosPorEscola(int ano, Escola escola) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    

}
