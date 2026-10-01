package ClassesSecundarias;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class HoraContrato {
	private LocalDate data;
	private Double valorPorHora;
	private Integer horas;
	
	public HoraContrato(LocalDate data, Double valorPorHora, Integer horas) {
		this.data = data;
		this.valorPorHora = valorPorHora;
		this.horas = horas;
	}

	public LocalDate getData() {
		return data;
	}

	public Double getValorPorHora() {
		return valorPorHora;
	}

	public void setValorPorHora(Double valorPorHora) {
		this.valorPorHora = valorPorHora;
	}

	public Integer getHoras() {
		return horas;
	}

	public void setHoras(Integer horas) {
		this.horas = horas;
	}
	
	public Double valorTotal() {
		return valorPorHora * horas;
	}
}
