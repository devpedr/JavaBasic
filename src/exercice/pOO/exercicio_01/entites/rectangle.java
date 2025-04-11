package src.exercice.pOO.exercicio_01.entites;

public class rectangle {
    public double width;
    public double height;

    public double areaRetangulo() {
        return width * height;
    }
    public double perimeterRetangulo(){
        return 2 * (width + height);
    }
    public double diagonalRetangulo(){
        return Math.sqrt(Math.pow(width,2)+Math.pow(height,2));
    }
    public String toString(){
        return "\nAREA = " + areaRetangulo() + "\nPERIMETER = " + perimeterRetangulo() + "\nDIAGONAL = " + diagonalRetangulo();
    }

}

