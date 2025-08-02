public class CSVUtil {
    public static List<Pelicula> leerPeliculasDesdeCSV(String archivoRuta) {
        List<Pelicula> peliculas = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(archivoRuta))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] datos = linea.split(",");
                if (datos.length == 3) {
                    String titulo = datos[0];
                    int duracion = Integer.parseInt(datos[1]);
                    String genero = datos[2];
                    peliculas.add(new Pelicula(titulo, duracion, genero));
                }
            }
        } catch (IOException e) {
            System.out.println("Error leyendo archivo: " + e.getMessage());
        }
        return peliculas;
    }
}