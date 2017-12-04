package br.com.microsisinformatica.backend;

import java.io.IOException;
import java.util.ArrayList;

public interface InterfaceOperadorArquivo {
	public ArrayList<Veiculo> listarArquivos() throws IOException, ClassNotFoundException;
	public void gravarArquivo(Veiculo veiculo) throws IOException, ClassNotFoundException;
	public void removerArquivo(String nome) throws IOException, ClassNotFoundException;
	public Veiculo buscarArquivo(String nome) throws IOException, ClassNotFoundException;
}
