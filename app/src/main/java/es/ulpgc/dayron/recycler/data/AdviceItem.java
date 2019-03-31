package es.ulpgc.dayron.recycler.data;

public class AdviceItem {
    public int id;
    public String titulo;
    public String descripcion;

    public AdviceItem(int id, String titulo, String descripcion){
        this.id=id;
        this.titulo=titulo;
        this.descripcion=descripcion;
    }

    public int getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }
}
