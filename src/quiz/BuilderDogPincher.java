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
public class BuilderDogPincher extends BuilderDog{
    
    @Override
    public void construirRaza() {
        this.dog.setRaza("Pincher");
    }

    @Override
    public void construirEdad() {
        this.dog.setEdad(0);
    }

    @Override
    public void construirAltura() {
        this.dog.setAltura(1.0);
    }

    @Override
    public void construirNombre() {
        this.dog.setNombre("Pincher Recien Nacido");
    }
    
}
