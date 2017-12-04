package br.com.microsisinformatica.backend;

import java.io.*;
import java.util.ArrayList;

public class OperadorArquivo implements InterfaceOperadorArquivo {

	@Override
	public ArrayList<Veiculo> listarArquivos() throws IOException,
			ClassNotFoundException {
		ArrayList<Veiculo> veiculos = new ArrayList<Veiculo>();
		File diretorio = new File("veiculos");

		if (!diretorio.exists()) {
			diretorio.mkdirs();
		} else {
			String[] arquivos = diretorio.list();

			for (String arq : arquivos) {
				FileInputStream arquivo = new FileInputStream("veiculos/" + arq);
				ObjectInputStream leitor = new ObjectInputStream(arquivo);
				veiculos.add((Veiculo) leitor.readObject());
				arquivo.close();
			}
		}

		return veiculos;
	}

	@Override
	public void gravarArquivo(Veiculo veiculo) throws IOException,
			ClassNotFoundException {
		FileOutputStream arquivo = new FileOutputStream("veiculos/"
				+ veiculo.getPlaca() + ".dat");
		ObjectOutputStream escritor = new ObjectOutputStream(arquivo);
		escritor.writeObject(veiculo);
		arquivo.flush();
		arquivo.close();
	}

	@Override
	public Veiculo buscarArquivo(String nome) throws IOException,
			ClassNotFoundException {
		FileInputStream arquivo = new FileInputStream("veiculos/" + nome
				+ ".dat");
		ObjectInputStream leitor = new ObjectInputStream(arquivo);
		Veiculo veiculo = (Veiculo) leitor.readObject();
		arquivo.close();
		return veiculo;
	}

	@Override
	public void removerArquivo(String nome) throws IOException,
			ClassNotFoundException {
		File arquivo = new File("veiculos/" + nome + ".dat");
		arquivo.delete();

	}
}
