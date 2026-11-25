public class main {
    public static void main(String[] args) {
        String[] autores = {"Ana Perez", "Luis Gomez"};
        PublicacionAcademica[] publicaciones = new PublicacionAcademica[3];
        publicaciones[0] = new ArticuloIndexado("Inteligencia artificial", "2026", autores, 4.5, "Q1");
        publicaciones[1] = new ActaCongreso("Nuevas tecnologias", "2025", autores, "Congreso TIC", "Mendoza");
        publicaciones[2] = new TesisDoctoral("Sistemas distribuidos", "2024", autores, "Dr. Lopez", "UNCuyo");
        for (int i = 0; i < publicaciones.length; i++) System.out.println(publicaciones[i].generarCitacion());
    }
}