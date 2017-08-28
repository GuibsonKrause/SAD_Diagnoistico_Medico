/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package server;

/**
 *
 * @author gkrause
 */
public class AgenteArquivador {
    private boolean dor;
    private boolean febre;
    private boolean manchas;
    private boolean tosse;
    
    private boolean cansaco;
    private boolean resfriado;
    private boolean dengue;
    private boolean pneumonia;
    private boolean catapora;

    public boolean isDor() {
        return dor;
    }

    public void setDor(boolean dor) {
        this.dor = dor;
    }

    public boolean isFebre() {
        return febre;
    }

    public void setFebre(boolean febre) {
        this.febre = febre;
    }

    public boolean isManchas() {
        return manchas;
    }

    public void setManchas(boolean manchas) {
        this.manchas = manchas;
    }

    public boolean isTosse() {
        return tosse;
    }

    public void setTosse(boolean tosse) {
        this.tosse = tosse;
    }

    public boolean isCansaco() {
        return cansaco;
    }

    public void setCansaco(boolean cansaco) {
        this.cansaco = cansaco;
    }

    public boolean isResfriado() {
        return resfriado;
    }

    public void setResfriado(boolean resfriado) {
        this.resfriado = resfriado;
    }

    public boolean isDengue() {
        return dengue;
    }

    public void setDengue(boolean dengue) {
        this.dengue = dengue;
    }

    public boolean isPneumonia() {
        return pneumonia;
    }

    public void setPneumonia(boolean pneumonia) {
        this.pneumonia = pneumonia;
    }

    public boolean isCatapora() {
        return catapora;
    }

    public void setCatapora(boolean catapora) {
        this.catapora = catapora;
    }  
        
}
