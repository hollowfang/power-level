/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hollowfang.powerlevel.entities;

/**
 *
 * @author tmachado
 */
public class Band {
    private String name;
    private Integer powerlevel;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPowerlevel() {
        return powerlevel;
    }

    public void setPowerlevel(Integer powerlevel) {
        this.powerlevel = powerlevel;
    }

    public Band(String name, Integer powerlevel) {
        this.name = name;
        this.powerlevel = powerlevel;
    }
    
    
    
}
