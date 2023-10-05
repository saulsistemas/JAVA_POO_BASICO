
package domain;

import java.time.LocalDateTime;

public class TipoRestaurante {
    private int idTipoRestaurante;
    private String descripcion;
    private LocalDateTime fechaCreacion;
    private LocalDateTime fechaModificacion;
    private boolean estatus;

    public TipoRestaurante() {
    }

    public TipoRestaurante(String descripcion, LocalDateTime fechaCreacion, LocalDateTime fechaModificacion, boolean estatus) {
        this.descripcion = descripcion;
        this.fechaCreacion = fechaCreacion;
        this.fechaModificacion = fechaModificacion;
        this.estatus = estatus;
    }

    public TipoRestaurante(int idTipoRestaurante, String descripcion, LocalDateTime fechaCreacion, LocalDateTime fechaModificacion, boolean estatus) {
        this.idTipoRestaurante = idTipoRestaurante;
        this.descripcion = descripcion;
        this.fechaCreacion = fechaCreacion;
        this.fechaModificacion = fechaModificacion;
        this.estatus = estatus;
    }

    public TipoRestaurante(int idTipoRestaurante) {
        this.idTipoRestaurante = idTipoRestaurante;
    }



    public int getIdTipoRestaurante() {
        return idTipoRestaurante;
    }

    public void setIdTipoRestaurante(int idTipoRestaurante) {
        this.idTipoRestaurante = idTipoRestaurante;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public LocalDateTime getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(LocalDateTime fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public LocalDateTime getFechaModificacion() {
        return fechaModificacion;
    }

    public void setFechaModificacion(LocalDateTime fechaModificacion) {
        this.fechaModificacion = fechaModificacion;
    }

    public boolean isEstatus() {
        return estatus;
    }

    public void setEstatus(boolean estatus) {
        this.estatus = estatus;
    }

    @Override
    public String toString() {
        return "TipoRestaurante{" + "idTipoRestaurante=" + idTipoRestaurante + ", descripcion=" + descripcion + ", fechaCreacion=" + fechaCreacion + ", fechaModificacion=" + fechaModificacion + ", estatus=" + estatus + '}';
    }

}
