package br.com.dataupa.utl;

import br.com.dataupa.bns.Endereco;
import br.com.dataupa.bns.Paciente;
import com.toedter.calendar.JDateChooser;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class DataUpaUtil {

    public static String dataEmString(Date novaData) {
        SimpleDateFormat formataData = new SimpleDateFormat("dd/MM/yyyy");
        String dataFormatada = formataData.format(novaData);
        return dataFormatada;
    }

    public static String dataJDateChooserEmString(JDateChooser novaData) {
        SimpleDateFormat formataData = new SimpleDateFormat("dd/MM/yyyy");
        Date data = novaData.getDate();
        String dataFormatada = formataData.format(data);
        return dataFormatada;
    }

    public static int calculaIdade(java.util.Date dataNasc) {
        Calendar dataNascimento = Calendar.getInstance();
        dataNascimento.setTime(dataNasc);
        Calendar hoje = Calendar.getInstance();

        int idade = hoje.get(Calendar.YEAR) - dataNascimento.get(Calendar.YEAR);

        if (hoje.get(Calendar.MONTH) < dataNascimento.get(Calendar.MONTH)) {
            idade--;
        } else {
            if (hoje.get(Calendar.MONTH) == dataNascimento.get(Calendar.MONTH) && hoje.get(Calendar.DAY_OF_MONTH) < dataNascimento.get(Calendar.DAY_OF_MONTH)) {
                idade--;
            }
        }
        return idade;
    }

    public static String exibeIdade(int idade) {
        String infoIdade = "";
        if (idade < 0) {
            infoIdade = "Data de Nascimento inválida!";
        } else if (idade >= 0 && idade < 1) {
            infoIdade = "meses de idade";
        } else if (idade >= 1 && idade < 2) {
            infoIdade = idade + " ano";
        } else {
            infoIdade = idade + " anos";
        }
        return infoIdade;
    }

    public static String setCaracteristica(int idade) {
        String caracteristica = "";
        if (idade < 0) {
            caracteristica = "Data de Nascimento inválida!";
        } else if (idade < 12) {
            caracteristica = "Paciente Criança";
        } else if (idade >= 12 && idade <= 18) {
            caracteristica = "Paciente Adolescente";
        } else if (idade > 18 && idade <= 60) {
            caracteristica = "Paciente Adulto(a)";
        } else {
            caracteristica = "Paciente Idoso(a)";
        }
        return caracteristica;
    }

    public static boolean validaDadosPaciente(JTextField nome, JComboBox sexo, JDateChooser dataNascTmp, JTextField rg, JTextField cpf,
            JTextField logradouro, JTextField numero, JTextField complemento, JComboBox estado, JTextField cidade, JTextField bairro, JTextField cep) {
        String mensagem = "";
        if (dataNascTmp.getDate().after(new Date())) {
            JOptionPane.showMessageDialog(null, "Data de Nascimento inválida!");
            return false;
        } else {
            if ((!nome.getText().equals("")) && (!sexo.getSelectedItem().toString().equals("")) && (dataNascTmp.getDate() != null)
                    && (!rg.getText().equals("")) && (!cpf.getText().equals(""))
                    && (!logradouro.getText().equals("")) && (!numero.getText().equals("")) && (!complemento.getText().equals(""))
                    && (!estado.getSelectedItem().toString().equals("")) && (!cidade.getText().equals("")) && (!bairro.getText().equals(""))
                    && (!cep.getText().equals(""))) {
                return true;
            } else {
                return false;
            }
        }
    }

    public static Paciente salvarPaciente(JTextField nome, JComboBox sexo, JDateChooser dataNascTmp, JTextField rg, JTextField cpf,
            JTextField logradouro, JTextField numero, JTextField complemento, JComboBox estado, JTextField cidade, JTextField bairro, JTextField cep) {
        String dataNasc = dataJDateChooserEmString(dataNascTmp);
        Endereco endereco = new Endereco(logradouro.getText(), numero.getText(), complemento.getText(), estado.getSelectedItem().toString(),
                cidade.getText(), bairro.getText(), cep.getText());
        Paciente paciente = new Paciente(nome.getText(), sexo.getSelectedItem().toString(), dataNasc, rg.getText(), cpf.getText(), endereco);
        return paciente;
    }

    public static void limpaDadosPaciente(JTextField nome, JComboBox sexo, JDateChooser dataNascTmp, JTextField rg, JTextField cpf,
            JTextField logradouro, JTextField numero, JTextField complemento, JComboBox estado, JTextField cidade, JTextField bairro, JTextField cep) {
        nome.setText("");
        sexo.setSelectedIndex(0);
        dataNascTmp.setDate(new Date());
        rg.setText("");
        cpf.setText("");
        logradouro.setText("");
        numero.setText("");
        estado.setSelectedIndex(0);
        complemento.setText("");
        cidade.setText("");
        bairro.setText("");
        cep.setText("");

    }
}
