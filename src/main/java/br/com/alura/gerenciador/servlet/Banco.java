package br.com.alura.gerenciador.servlet;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Banco {

	private static List<Empresa> list = new ArrayList<>();
	private static Integer chaveSequencial = 1;

	static {
		Empresa empresa = new Empresa();
		empresa.setId(chaveSequencial++);
		empresa.setNome("Alura");
	}

	public void adiciona(Empresa empresa) {
		empresa.setId(Banco.chaveSequencial++);
		Banco.list.add(empresa);
	}

	public List<Empresa> getEmpresas() {
		return Banco.list;
	}

	public void removeEmpresa(Integer id) {

		Iterator<Empresa> it = list.iterator();

		while (it.hasNext()) {
			Empresa emp = it.next();

			
				if (emp.getId() == id) {
					it.remove();
			}
		}
	}

	public Empresa buscaEmpresaPeloId(Integer id) {
		for (Empresa empresa : list) {
			if(empresa.getId() == id) {
			return empresa;
			}
		}
		return null;
	}
}
