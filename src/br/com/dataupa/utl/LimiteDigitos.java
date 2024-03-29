package br.com.dataupa.utl;

import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;

public class LimiteDigitos extends PlainDocument {

    private int quantidadeMax;

    public LimiteDigitos(int quantidade) {
        super();
        if (quantidade <= 0) {
            throw new IllegalArgumentException("Especifique a quantidade!");
        }
        quantidadeMax = quantidade;
    }

    @Override
    public void insertString(int offset, String str, AttributeSet attr) throws BadLocationException {
        if ((str == null) || (getLength() == quantidadeMax)) {
            return;
        }
        int totalQuantia = (getLength() + str.length());
        if (totalQuantia <= quantidadeMax) {
            super.insertString(offset, str.replaceAll("[^0-9]", ""), attr);
            return;
        }
        String nova = str.substring(0, getLength() - quantidadeMax);
        super.insertString(offset, nova, attr);
    }

}
