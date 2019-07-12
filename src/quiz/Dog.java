
package quiz;

public class Dog {
    private String raza = "";
    private String nombre = "";
    private int edad = 0;
    private double altura = 0.0;
    

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "Dog{" + "raza=" + raza + ", nombre=" + nombre + ", edad=" + edad + ", altura=" + altura + '}';
    }
    

}
