package org.example.oop.enums;

import org.example.oop.abstraction.Color;

import java.time.LocalDate;

public enum Drinks{
    RAKI(2,LocalDate.of(2030,12,30)),
    GIN(5,LocalDate.of(2030,10,10)),
    COLA(30,LocalDate.of(2026,10,10)),
    FANTA(30,LocalDate.of(2020,10,10)),
    RED_BULL(20,LocalDate.of(2025,01,01));

    final int niveliSheqerit;
    final LocalDate expirationDate;

    Drinks(int niveliSheqerit,LocalDate expirationDate) {
        this.niveliSheqerit = niveliSheqerit;
        this.expirationDate = expirationDate;
    }

    boolean isPastExpired(){
        if (this.expirationDate.isBefore(LocalDate.now())){
            return true;
        }
        return false;
    }
}
