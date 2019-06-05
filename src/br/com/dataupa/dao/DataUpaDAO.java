package br.com.dataupa.dao;

import br.com.dataupa.bns.Paciente;
import br.com.dataupa.utl.DbMock;
import java.util.List;

public class DataUpaDAO implements DataUPA {

    List<Paciente> pacientes = DbMock.carregaPacientesIniciais();

    @Override
    public void salvar(Paciente paciente) {
        pacientes.add(paciente);
    }

    @Override
    public List<Paciente> listar() {
        return pacientes;
    }

}
