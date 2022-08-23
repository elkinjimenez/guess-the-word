package com.claro.gestionrecursosapi.hallazgo.entity;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDateTime;
import java.util.Date;

@Entity
@Table(name="DF_HALLAZGOS_REPORTADOS")
public class HallazgosReportadosEntity {
    @Id
    @Column(name = "ID_COMPROMISO")
    private Integer idCompromiso;
    private String celula;
    private String codProyecto;
    private String proyecto;
    private String lineaProducto;
    private String brief;
    @Column(name = "ID_CAMBIO")
    private String idCambio;
    @Column(name = "FECHA_DESP_REAL")
    private Date fechaDespReal;
    @Column(name = "TIPO_HALLAZGO")
    private String tipo;
    @Column(name = "FECHA_HALLAZGO")
    private Date fechaHallazgo;
    private String criticidad;
    @Column(name = "DETALLE_HALLAZGO")
    private String detalle;
    @Column(name = "EVIDENCIA_HALLAZGO")
    private String evidencia;
    @Column(name = "CEDULA_REPORTA")
    private String cedulaReporta;
    @Column(name = "NOMBRE_REPORTA")
    private String nombreReporta;
    @Column(name = "CELULAR_REPORTA")
    private String celularReporta;
    @Column(name = "GERENCIA_REPORTA")
    private String gerenciaReporta;
    @Column(name = "CORREO_REPORTA")
    private String correoReporta;
    @Column(name = "ID_HALLAZGO")
    private Integer idHallazgo;

    public Integer getIdCompromiso() {
        return idCompromiso;
    }

    public void setIdCompromiso(Integer idCompromiso) {
        this.idCompromiso = idCompromiso;
    }

    public String getCelula() {
        return celula;
    }

    public void setCelula(String celula) {
        this.celula = celula;
    }

    public String getCodProyecto() {
        return codProyecto;
    }

    public void setCodProyecto(String codProyecto) {
        this.codProyecto = codProyecto;
    }

    public String getProyecto() {
        return proyecto;
    }

    public void setProyecto(String proyecto) {
        this.proyecto = proyecto;
    }

    public String getLineaProducto() {
        return lineaProducto;
    }

    public void setLineaProducto(String lineaProducto) {
        this.lineaProducto = lineaProducto;
    }

    public String getBrief() {
        return brief;
    }

    public void setBrief(String brief) {
        this.brief = brief;
    }

    public String getIdCambio() {
        return idCambio;
    }

    public void setIdCambio(String idCambio) {
        this.idCambio = idCambio;
    }

    public Date getFechaDespReal() {
        return fechaDespReal;
    }

    public void setFechaDespReal(Date fechaDespReal) {
        this.fechaDespReal = fechaDespReal;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Date getFechaHallazgo() {
        return fechaHallazgo;
    }

    public void setFechaHallazgo(Date fechaHallazgo) {
        this.fechaHallazgo = fechaHallazgo;
    }

    public String getCriticidad() {
        return criticidad;
    }

    public void setCriticidad(String criticidad) {
        this.criticidad = criticidad;
    }

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }

    public String getEvidencia() {
        return evidencia;
    }

    public void setEvidencia(String evidencia) {
        this.evidencia = evidencia;
    }

    public String getCedulaReporta() {
        return cedulaReporta;
    }

    public void setCedulaReporta(String cedulaReporta) {
        this.cedulaReporta = cedulaReporta;
    }

    public String getNombreReporta() {
        return nombreReporta;
    }

    public void setNombreReporta(String nombreReporta) {
        this.nombreReporta = nombreReporta;
    }

    public String getCelularReporta() {
        return celularReporta;
    }

    public void setCelularReporta(String celularReporta) {
        this.celularReporta = celularReporta;
    }

    public String getGerenciaReporta() {
        return gerenciaReporta;
    }

    public void setGerenciaReporta(String gerenciaReporta) {
        this.gerenciaReporta = gerenciaReporta;
    }

    public String getCorreoReporta() {
        return correoReporta;
    }

    public void setCorreoReporta(String correoReporta) {
        this.correoReporta = correoReporta;
    }

    public Integer getIdHallazgo() {
        return idHallazgo;
    }

    public void setIdHallazgo(Integer idHallazgo) {
        this.idHallazgo = idHallazgo;
    }
}
