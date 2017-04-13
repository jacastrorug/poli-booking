package co.edu.poligran.serviciosalestudiante.service.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.List;

public class EspacioDTO extends BaseDTO {
    private TipoEspacioDTO tipoEspacio;
    private String nombre;
    private int cupos;

    @JsonIgnore
    private List<BloqueDTO> bloques;
    
	public int getCupos() {
		return cupos;
	}

	public void setCupos(int cupos) {
		this.cupos = cupos;
	}
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<BloqueDTO> getBloques() {
        return bloques;
    }

    public void setBloques(List<BloqueDTO> bloques) {
        this.bloques = bloques;
    }

    public TipoEspacioDTO getTipoEspacio() {
        return tipoEspacio;
    }

    public void setTipoEspacio(TipoEspacioDTO tipoEspacio) {
        this.tipoEspacio = tipoEspacio;
    }

}
