
package Principal;

import java.io.File;

public class Principal {
    public static void main(String[] args) {
        String ruta = "C:/Users/Charly Ponce/Documents/NetBeansProjects/AnalizadorLexico/src/codigo/Lexer.flex";
        generarLexer(ruta);
    }
    public static void generarLexer(String ruta){
        File archivo = new File(ruta);
        JFlex.Main.generate(archivo);
    }
}
