package br.com.dataupa.utl;

import br.com.dataupa.bns.Endereco;
import br.com.dataupa.bns.Paciente;
import java.util.List;
import java.util.ArrayList;

public class DbMock {

    static Endereco enderecoSergio = new Endereco("Rua dos operadores", "657", "casa", "Pernambuco", "Recife", "Boa Vista", "51487932");
    static Paciente pacienteSergio = new Paciente("Sergio Oliveira da Silva", "Masculino", "12/09/1985", "3485617", "08465798532", enderecoSergio);

    static Endereco enderecoJoao = new Endereco("Rua Marrocos", "57", "casa", "Pernambuco", "Jaboatão", "Loteamento", "54378447");
    static Paciente pacienteJoao = new Paciente("João Silveira Machado", "Masculino", "24/01/1955", "9754125", "94851324785", enderecoJoao);

    static Endereco enderecoMaria = new Endereco("Rua do Entrocamento", "1362", "Apartamento 3º andar", "Pernambuco", "Recife", "Boa Vista", "54315785");
    static Paciente pacienteMaria = new Paciente("Maria Isabel de Azevedo", "Feminino", "15/03/2000", "9431578", "07513489578", enderecoMaria);

    static Endereco enderecoEduarda = new Endereco("Rua Suassuna de Abreu", "150", "casa", "Pernambuco", "Jaboatão", "Curado I", "54179534");
    static Paciente pacienteEduarda = new Paciente("Eduarda Beatriz de Macedo", "Feminino", "22/06/1992", "6487954", "03245876548", enderecoEduarda);

    static Endereco enderecoMarcos = new Endereco("Rua Dom Ministro", "358", "casa", "Pernambuco", "Recife", "Dantas Barreto", "51542158");
    static Paciente pacienteMarcos = new Paciente("Marcos Silvano Pereira", "Masculino", "30/11/2004", "3147954", "54795421578", enderecoMarcos);

    static Endereco enderecoIsabela = new Endereco("Rua Joaquim Barbosa", "21", "casa", "Pernambuco", "Jaboatão", "Vista Alegre", "54317954");
    static Paciente pacienteIsabela = new Paciente("Isabela Morais Pedrosa", "Feminino", "03/12/2011", "3495217", "04589754213", enderecoIsabela);

    public static List<Paciente> pacientes = carregaPacientesIniciais();

    public static List<Paciente> carregaPacientesIniciais() {
        pacientes = new ArrayList<Paciente>();
        pacientes.add(pacienteSergio);
        pacientes.add(pacienteJoao);
        pacientes.add(pacienteMaria);
        pacientes.add(pacienteEduarda);
        pacientes.add(pacienteMarcos);
        pacientes.add(pacienteIsabela);
        return pacientes;
    }

    public static void atualizaListaPacientes(Paciente novoPaciente) {
        pacientes.add(novoPaciente);
    }

}
