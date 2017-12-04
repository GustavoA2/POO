package br.com.microsisinformatica.backend;

import java.io.IOException;
import java.util.ArrayList;

import javax.swing.JOptionPane;

public class OperadorVeiculo implements InterfaceOperadorVeiculo {
	private ArrayList<Veiculo> veiculos = new ArrayList<Veiculo>();
	private OperadorArquivo oa = new OperadorArquivo();

	OperadorVeiculo() {
		try {
			veiculos = oa.listarArquivos();
		} catch (ClassNotFoundException | IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public boolean add(Veiculo veiculo) {
		if (!veiculos.contains(veiculo)) {
			try {
				oa.gravarArquivo(veiculo);
				veiculos.add(veiculo);
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		} else {
			JOptionPane.showMessageDialog(null, "Veículo já cadastrado!");
		}

		return true;
	}

	@Override
	public boolean remove(int index, String placa) {
		try {
			veiculos.remove(index);
			oa.removerArquivo(placa);
		} catch (ClassNotFoundException | IOException e) {
			e.printStackTrace();
		}
		return true;
	}

	@Override
	public Veiculo get(int index) {
		Veiculo veiculo = null;
		try {
			veiculo = oa.buscarArquivo(veiculos.get(index).getPlaca());
		} catch (ClassNotFoundException | IOException e) {
			e.printStackTrace();
		}
		return veiculo;
	}

	@Override
	public ArrayList<Veiculo> listar() {
		return veiculos;
	}

}
