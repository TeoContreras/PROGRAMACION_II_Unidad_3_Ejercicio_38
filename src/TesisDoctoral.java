public class TesisDoctoral extends PublicacionAcademica {
    private String nombreDirector, universidad;
    public TesisDoctoral(String titulo, String fecha, String[] autores, String director, String universidad) {
        super(titulo, fecha, autores); nombreDirector = director; this.universidad = universidad;
    }
    @Override
    public String generarCitacion() { return "Tesis: " + super.generarCitacion() + " - Director: " + nombreDirector + " - " + universidad; }
}