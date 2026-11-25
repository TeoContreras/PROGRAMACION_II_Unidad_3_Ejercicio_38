public class PublicacionAcademica {
    protected String titulo, fechaPublicacion;
    protected String[] autores;
    public PublicacionAcademica(String titulo, String fecha, String[] autores) {
        this.titulo = titulo; fechaPublicacion = fecha; this.autores = autores;
    }
    public boolean validarIndexacion() { return true; }
    public String generarCitacion() {
        String texto = titulo + ". " + fechaPublicacion + ". Autores: ";
        for (int i = 0; i < autores.length; i++) texto += autores[i] + (i < autores.length - 1 ? ", " : "");
        return texto;
    }
}