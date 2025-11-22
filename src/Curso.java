public class Curso {
    public static void main(String[] args){
        String text = "Chao Mundo";
       int ancho = text.length();
        System.out.println(ancho);
        String texto = text.replace("Hola", "Caho");
        System.out.println(text); //texto y text son string completamente diferentes

        System.out.println(texto.endsWith("undo"));
        System.out.println(texto.startsWith("Ch"));
        System.out.println(texto.contains("und"));
        System.out.println(texto.indexOf("Mund"));

        System.out.println(texto.toUpperCase()) ; //este metodo lo pasa a mayuscula
        System.out.println(texto.toLowerCase());

        String malo = "      cahito feliz    ";
        System.out.println(malo.trim()); // quita los espacios que el usuario ingrese
        System.out.println(malo);

    }
}
