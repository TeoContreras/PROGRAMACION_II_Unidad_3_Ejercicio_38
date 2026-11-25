public class ActaCongreso extends PublicacionAcademica {
    private String nombreSimposio, ciudadSede;
    public ActaCongreso(String titulo, String fecha, String[] autores, String simposio, String ciudad) {
        super(titulo, fecha, autores); nombreSimposio = simposio; ciudadSede = ciudad;
    }
    @Override
    public String generarCitacion() { return "Acta (IEEE): " + super.generarCitacion() + " - " + nombreSimposio + ", " + ciudadSede; }
}