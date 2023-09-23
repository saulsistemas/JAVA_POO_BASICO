package entity;

import java.time.LocalDateTime;

/**
 *
 * Clase que contiene campos que se utilizan en todas las clases que mapean
 */
public class CommonEntity {
    private LocalDateTime fechaCreacion;
    private LocalDateTime fechaModificacion;
    private boolean estatus;
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
    
}
