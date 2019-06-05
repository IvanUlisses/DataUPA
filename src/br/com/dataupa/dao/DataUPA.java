package br.com.dataupa.dao;

import br.com.dataupa.bns.Paciente;
import java.util.List;

public interface DataUPA {

    public void salvar(Paciente paciente);

    public List<Paciente> listar();
}
