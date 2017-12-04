package br.com.microsisinformatica.backend;

import java.util.ArrayList;

public interface InterfaceTabela {
	public void inserir(String placa, String tipo, String instrutor);
	public int pesquisar(String placa);
	public void editar(String placa, String tipo, String instrutor, int index);
	public void remover(int index, String placa);
	public void popular(ArrayList<Veiculo> veiculos);
}
