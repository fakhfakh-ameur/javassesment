/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.infine.kata;

/**
 *
 * @author Ameur.Fakhfakh
 */
public class PlasmaGun extends Weapon{

    public PlasmaGun(String type) {
        super(type);
    }
    public String getAttack() {
        return "Perform plasma gun attack";
    }
}
