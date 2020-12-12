package entornos.textos;

public class CadenaTexto {

    public static String texto1 = "";
    public static String texto2 = "";

    public static String union() {
        return texto1 + texto2;
    }

    public static void ensena() {
        System.out.println(texto1);
        System.out.println(texto2);
    }

    // OJO! Hacemos aquí un main
    public static void main(String[] args) {
        CadenaTexto.texto1 = "uno";
        CadenaTexto.texto2 = "dos";
        System.out.println(CadenaTexto.union());
        CadenaTexto.ensena();
    }
}
