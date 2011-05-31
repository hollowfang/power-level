/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hollowfang.powerlevel.hci.mb;

import com.hollowfang.powerlevel.ihc.Band;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author tmachado
 */
@ManagedBean
@RequestScoped
public class MetalBean {
    
    private List<Band> toPick;
    private List<Band> picked;
    private Integer powerLevel = new Integer(0);

    /** Creates a new instance of MetalBean */
    public MetalBean() {
        toPick = new ArrayList<Band>();
        toPick.add(new Band("Amon Amarth", 25));
        toPick.add(new Band("Avantasia", 10));
        toPick.add(new Band("Darkthrone", 15));
        toPick.add(new Band("Behemoth", 30));
        toPick.add(new Band("Ministry", 10));
        toPick.add(new Band("Metallica", 30));
        toPick.add(new Band("Megadeth", 30));
        toPick.add(new Band("Tool", 40));
        toPick.add(new Band("Alice In Chains", 25));
        toPick.add(new Band("Iron Maiden", 30));
        toPick.add(new Band("Stratovarius", 30));
        toPick.add(new Band("Jamiroquai", 20));
        toPick.add(new Band("Hammerfall", 20));
        toPick.add(new Band("Helloween", 25));
        toPick.add(new Band("Dimmu Borgir", 20));
        toPick.add(new Band("Queen", 35));
        
        
        toPick.add(new Band("Exaltasamba", -40));
        toPick.add(new Band("Parangolé", -60));
        toPick.add(new Band("Glória", -20));
        toPick.add(new Band("Restart", -40));
        toPick.add(new Band("Attack Attack", -25));       
        
        picked = new ArrayList<Band>();
    }
    
    public void currentPowerLevel(){
        Integer pl = this.getPowerLevel();
        for(Band b : picked){
            pl += b.getPowerlevel();
        }
        this.setPowerLevel(pl);
    }

    public List<Band> getPicked() {
        return picked;
    }

    public void setPicked(List<Band> picked) {
        this.picked = picked;
    }

    public Integer getPowerLevel() {
        return powerLevel;
    }

    public void setPowerLevel(Integer powerLevel) {
        this.powerLevel = powerLevel;
    }

    public List<Band> getToPick() {
        return toPick;
    }

    public void setToPick(List<Band> toPick) {
        this.toPick = toPick;
    }
    
    
}
