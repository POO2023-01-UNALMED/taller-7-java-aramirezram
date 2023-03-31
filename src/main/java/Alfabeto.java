
public class Alfabeto extends Pictograma {
	private String interpretacion;
	private String[] letras;
	public Alfabeto(String origen,String[] letras, String interpretacion) {
		super(origen);
		this.interpretacion=interpretacion;
		this.letras = letras;
	}
	
	public String[] getLetras() {
		return letras;
	}
	public void setLetras(String[] letras) {
		this.letras = letras;
	}
	public String interpretacion() {
		return interpretacion;
	}
	
	public String toString() {
		String cadena="";
		for(int i=0;i<letras.length;i++) {
			if(i==0) cadena=letras[i]+",";
			else if (i==letras.length-1) cadena=cadena+" "+letras[i];
			else cadena=cadena+" "+letras+",";
		}
		return cadena;
	}

	public void setInterpretacion(String interpretacion) {
		this.interpretacion = interpretacion;
	}
	
	public int cantidadLetras() {
		return letras.length;
	}
}
