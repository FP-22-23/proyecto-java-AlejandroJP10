package fp.partidos;
import java.time.Duration;

import fp.utiles.Checkers;

	public class PartidosResultados {
		private Integer id;
		private Integer temporada;
		private String ciudad;
		private LocalDateTime fecha;
		private String equipo1;
		private String equipo2;
		private String ganadorSorteo;
		private String resultadoSorteo;
		private String ganadorPartido;
		private Integer puntosRuns;
		private Integer puntosWickets;
		
		//Constructores 
	    public PartidosResultados(Integer id,Integer temporada,String ciudad,LocalDateTime fecha, String equipo1,String equipo2,
				String ganadorSorteo,String resultadoSorteo,String ganadorPartido,Integer puntosRuns,Integer puntosWickets) {
			this.id=id;
			this.temporada=temporada;
			this.ciudad=ciudad;
			checkCiudad(ciudad);
			this.fecha=fecha;
			this.equipo1=equipo1;
			this.equipo2=equipo2;
			this.ganadorSorteo=ganadorSorteo;
			this.ganadorPartido=ganadorPartido;
			this.puntosRuns=puntosRuns;
			checkPuntosRuns(puntosRuns);
			this.puntosWickets=puntosWickets;
			
		}
		//Checkers
		
		private void checkCiudad(String ciudad) {
			//El valor almacenado en ciudad no debe estar vacío
			Checkers.check("El nombre de la ciudad no puede estar vacío",ciudad!=null);
			
		}
		private void checkPuntosRuns(Integer puntosRuns) {
			//Los puntos no pueden ser negativos 
			Checkers.check("El valor de los puntos no puede ser negativo", puntosRuns>=0);
		}
		
		
}
