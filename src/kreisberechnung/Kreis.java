/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kreisberechnung;

/**
 *
 * @author kilia
 */
/**
 * Die Klasse Kreis hat nur das Attribut r, das zur vollständigen Bestimmung
 * eines Kreises ausreicht. Umfang (U) und Fläche (A) werden von entsprechenden
 * Methoden berechnet.
 */
public class Kreis {

    private double r; // Attribut für den Kreisradius

    /**
     * Spezieller Konstruktor für ein Kreis-Objekt
     *
     * @param r Der gewünschte Kreisradius
     */
    public Kreis(double r) {
        this.r = r;
    }

    /**
     * Der Standardkonstruktor für ein Kreis-Objekt ruft den speziellen
     * Konstruktor mit einem Standardwert für r auf.
     */
    public Kreis() {
        this(0.0);
    }

    /**
     * getR liefert den Wert des privaten Attributs r.
     *
     * @return r den Radius des Kreises
     */
    public double getR() {
        return r;
    }

    /**
     * setR ändert den Wert des Kreisradius, wenn der Parameter r >= 0.0 ist.
     * Anderenfalls bleibt der Attributwert unverändert.
     *
     * @param r Der gewünschte neue Radius des Kreises
     */
    public void setR(double r) {
        if (r >= 0.0) {
            this.r = r;
        }
    }

    /**
     * berechneU berechnet den Umfang des durch r bestimmten Kreises.
     *
     * @return Umfang des Kreises
     */
    public double berechneU() {
        return 2 * Math.PI * r;
    }

    /**
     * berechneA berechnet die Fläche des durch r bestimmten Kreises.
     *
     * @return Fläche des Kreises
     */
    public double berechneA() {
        return Math.PI * r * r;
    }

}
