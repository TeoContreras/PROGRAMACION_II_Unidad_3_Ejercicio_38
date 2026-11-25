public class ArticuloIndexado extends PublicacionAcademica {
    private double factorImpacto;
    private String cuartil;
    public ArticuloIndexado(String titulo, String fecha, String[] autores, double factor, String cuartil) {
        super(titulo, fecha, autores); factorImpacto = factor; this.cuartil = cuartil;
    }
    @Override
    public String generarCitacion() { return "Articulo (APA): " + super.generarCitacion() + " - Factor: " + factorImpacto + " - " + cuartil; }
}