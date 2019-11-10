package br.com.joseph.algafoodapi.domain.repository;

import java.util.List;

import br.com.joseph.algafoodapi.domain.model.Restaurante;

public interface RestauranteRepository {
	
	List<Restaurante> listar();

	Restaurante buscar(Long id);

	Restaurante salvar(Restaurante restaurante);

	void remover(Restaurante restaurante);
	
}
