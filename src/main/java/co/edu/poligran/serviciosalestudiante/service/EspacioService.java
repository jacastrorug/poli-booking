package co.edu.poligran.serviciosalestudiante.service;

import co.edu.poligran.serviciosalestudiante.service.dto.EspacioDTO;

import java.util.List;

public interface EspacioService {
	List<EspacioDTO> getCubiculosEstudio();

	List<EspacioDTO> getCubiculosVideo();

	List<EspacioDTO> getCanchaFutbol();

	List<EspacioDTO> getCanchaTenis();

	List<EspacioDTO> getCanchaMultiple();
	
	List<EspacioDTO> getGimnasio();

	EspacioDTO crearEspacio(EspacioDTO cubiculo);
}
