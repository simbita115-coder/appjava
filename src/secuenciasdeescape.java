public class secuenciasdeescape {
    public static void main(String[] args){
        String texto = "C:L\\Hola \"Mundo\">"; //escape con comillas dobles
        String text = "Hola \n\t Mundo"; // salto de linea \n y tabulacion \t
        System.out.println(texto);
        System.out.println(text);
    }
}
