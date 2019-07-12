/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz;

/**
 *
 * @author Estudiante
 */
public class Main {
    public static void main(String[] args) {
        Director tienda_perros = new Director();
        
        BuilderDog alemanBuilder = new BuilderDogAleman();
        BuilderDog salchichaBuilder = new BuilderDogSalchicha();
        BuilderDog pincherBuilder = new BuilderDogPincher();
        
        
        tienda_perros.setBuilderDog(alemanBuilder);
        tienda_perros.construirPerro();
        Dog perrito_aleman = alemanBuilder.getDog();
        perrito_aleman.setNombre("Pepe");
        
        tienda_perros.setBuilderDog(pincherBuilder);
        tienda_perros.construirPerro();
        Dog perrito_pincher = pincherBuilder.getDog();
        perrito_pincher.setNombre("Dario");
        
        tienda_perros.setBuilderDog(salchichaBuilder);
        tienda_perros.construirPerro();
        Dog perrito_salchicha = salchichaBuilder.getDog();
        perrito_salchicha.setNombre("Mexicano");
        
        
        System.out.println("Los perros que Tuve en mi vida pasada fueron: ");
        System.out.println(perrito_aleman.toString());
        System.out.println(perrito_pincher.toString());
        System.out.println(perrito_salchicha.toString());
        
        System.out.println("Pero ahora se iran para siempre");
        perrito_aleman = null;
        perrito_pincher = null;
        perrito_salchicha = null;
        
        System.out.print("Mi perrito aleman ahora es: ");
        System.out.println(perrito_aleman);
        System.out.print("Mi perrito aleman pincher es: ");
        System.out.println(perrito_pincher);
        System.out.print("Mi perrito aleman salchicha es: ");
        System.out.println(perrito_salchicha);
    }
}
