/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CTXH.MODEL;

import java.util.Date;

/**
 *
 * @author Thien
 */
public class Admin {

    private String MAA, TENTK, MATKHAU;
    private Date NGAYTAO;

    public Admin() {
    }

    public String getMAA() {
        return MAA;
    }

    public void setMAA(String MAA) {
        this.MAA = MAA;
    }

    public String getTENTK() {
        return TENTK;
    }

    public void setTENTK(String TENTK) {
        this.TENTK = TENTK;
    }

    public String getMATKHAU() {
        return MATKHAU;
    }

    public void setMATKHAU(String MATKHAU) {
        this.MATKHAU = MATKHAU;
    }

    public Date getNGAYTAO() {
        return NGAYTAO;
    }

    public void setNGAYTAO(Date NGAYTAO) {
        this.NGAYTAO = NGAYTAO;
    }

    public Admin(String MAA, String TENTK, String MATKHAU, Date NGAYTAO) {
        this.MAA = MAA;
        this.TENTK = TENTK;
        this.MATKHAU = MATKHAU;
        this.NGAYTAO = NGAYTAO;
    }
}
