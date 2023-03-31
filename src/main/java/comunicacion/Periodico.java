package comunicacion;

public class Periodico extends Escrito {
	private String fecha,primicia,interpretacion;

	public Periodico(String origen,String titulo,String autor,int paginas,String fecha, String primicia, String interpretacion) {
		super(origen,titulo,autor,paginas);
		this.fecha = fecha;
		this.primicia = primicia;
		this.interpretacion = interpretacion;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public String getPrimicia() {
		return primicia;
	}

	public void setPrimicia(String primicia) {
		this.primicia = primicia;
	}

	public String interpretacion() {
		return interpretacion;
	}

	public void setInterpretacion(String interpretacion) {
		this.interpretacion = interpretacion;
	}

	@Override
	public String toString() {
		return getOrigen() + "\n" + getTitulo() + "\n" + getAutor() + "\n" + getPaginas() + "\n" + getFecha() + "\n"
				+ getPrimicia();
	}
	public int palabrasTotales(int param) {
		return getPaginas()*param*10;
	}
}
