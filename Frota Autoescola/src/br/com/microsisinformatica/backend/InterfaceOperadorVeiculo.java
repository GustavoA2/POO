package br.com.microsisinformatica.backend;

import java.util.ArrayList;

public interface InterfaceOperadorVeiculo {
	public boolean add(Veiculo veiculo);
	public boolean remove(int index, String placa);
	public Veiculo get(int index);
	public ArrayList<Veiculo> listar();
}
