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
public class Director {
    
    private BuilderDog  builder;
    
    public void setBuilderDog(final BuilderDog builder){
        this.builder = builder;
    }
    
    public Dog getDog(){
        return this.builder.getDog();
    }
    
    public void construirPerro(){
        builder.createDog();
        
        builder.construirRaza();
        builder.construirEdad();
        builder.construirAltura();
        builder.construirNombre();
    }
}
