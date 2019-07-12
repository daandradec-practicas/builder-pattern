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
public abstract class BuilderDog {
    
    protected Dog dog;
    
    public Dog getDog(){
        return this.dog;
    }
    
    public void createDog(){
        this.dog = new Dog();
    }
    
    public abstract void construirRaza();
    public abstract void construirEdad();
    public abstract void construirAltura();
    public abstract void construirNombre();
}
