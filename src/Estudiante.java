
public class Estudiante {
    private int numeroInscripcion, patrimonio, matricula;
    private byte estratoSocial;
    private String nombre;
    public Estudiante( int numeroInscripcion, String nombre, int patrimonio, byte estratoSocial ){
        this.nombre = nombre;
        this.numeroInscripcion = numeroInscripcion;
        this.patrimonio = patrimonio;
        this.estratoSocial = estratoSocial;
        liquidacionMatricula();
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setEstratoSocial(byte estratoSocial){
        this.estratoSocial = estratoSocial;
        liquidacionMatricula();
    }
    public void setPatrimonio(int patrimonio){
        this.patrimonio = patrimonio;
        liquidacionMatricula();
    }
    public void setNumeroInscripcion(int numeroInscripcion){
        this.numeroInscripcion = numeroInscripcion;
    }

    private void liquidacionMatricula(){
        this.matricula = 50000;
        if (patrimonio > 2_000_000 && estratoSocial > 3){
            matricula += patrimonio * 0.3;
        }
    }
    public int getMatricula(){
        return matricula;
    }

    public String getNombre() {
        return nombre;
    }

    public int getNumeroInscripcion() {
        return numeroInscripcion;
    }
    public byte getEstratoSocial(){
        return estratoSocial;
    }
    public int getPatrimonio(){
        return patrimonio;
    }
}
