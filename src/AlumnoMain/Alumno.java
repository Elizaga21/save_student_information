package AlumnoMain;

public class Alumno {
    private String nombre, ciclo;
    private int curso, NIA;

    public Alumno(String nombre, String ciclo, int curso, int NIA) {
        this.nombre = nombre;
        this.ciclo = ciclo;
        this.curso = curso;
        this.NIA = NIA;
    }
    public Alumno (){

    }
    public String getnombre (){
        return nombre;
    }
    public String getciclo(){
        return ciclo;
    }
    public int getcurso(){
        return curso;
    }
    public int getNIA(){
        return NIA;
    }

}
