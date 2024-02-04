package cz.czechitas.java.ukol01;

import cz.czechitas.java.ukol01.engine.Turtle;
import java.lang.Math;

public class HlavniProgram {
  private Turtle zofka;

  public static void main(String[] args) {
    new HlavniProgram().start();
  }

  public void start() {
    zofka = new Turtle();

    //TODO implementace domácího úkolu

    if (zofka.isPenDrawing()) {
      zofka.penUp();
    }
    nakresliPrasatko();

    zofka.move(150);

    nakresliMnohouhelnik(8);

    zofka.turnRight(90);
    zofka.move(150);
    zofka.turnLeft(90);

    nakresliMnohouhelnik(60);

    zofka.turnRight(90);
    zofka.move(170);
    zofka.turnLeft(90);

    nakresliSlunicko(60);
  }

  public void nakresliPrasatko() {
    zofka.penDown();
    zofka.turnRight(90);
    zofka.move(200);
    zofka.turnLeft(90);

    zofka.turnRight(180);
    zofka.move(130);
    zofka.turnLeft(180);

    nakresliNohy();

    zofka.turnRight(270);
    zofka.move(200);
    zofka.turnLeft(270);

    nakresliNohy();

    zofka.move(130);

    nakresliCumak();

    zofka.move(130);
    zofka.penUp();
  }

  public void nakresliNohy() {
    zofka.turnRight(150);
    zofka.move(45);
    zofka.turnLeft(150);

    zofka.turnRight(330);
    zofka.move(45);
    zofka.turnLeft(330);

    zofka.turnRight(210);
    zofka.move(45);
    zofka.turnLeft(210);

    zofka.turnRight(30);
    zofka.move(45);
    zofka.turnLeft(30);
  }

  public void nakresliCumak() {
    zofka.turnRight(240);
    zofka.move(130);
    zofka.turnLeft(240);

    zofka.turnRight(120);
    zofka.move(130);
    zofka.turnLeft(120);
  }

  public void nakresliMnohouhelnik(double pocetStran) {
    final double polomer = 50;
    double uhelRadiany = Math.PI / pocetStran;
    double uhelStupne = uhelRadiany * 360 / Math.PI;
    double delkaStrany = 2 * polomer * Math.tan(uhelRadiany);

    zofka.penDown();

    for (int i = 0; i < pocetStran; i++) {
      double turnUhelStupne = 90 + i * uhelStupne;
      zofka.turnRight(turnUhelStupne);
      zofka.move(delkaStrany);
      zofka.turnLeft(turnUhelStupne);
    }

    zofka.penUp();
  }

  public void nakresliSlunicko(double pocetStran) {
    final double polomer = 50;
    double uhelRadiany = Math.PI / pocetStran;
    double uhelStupne = uhelRadiany * 360 / Math.PI;
    double delkaStrany = 2 * polomer * Math.tan(uhelRadiany);

    double pocetCarek = 12;
    double delitelnost = pocetStran / pocetCarek;

    zofka.penDown();

    for (int i = 0; i < pocetStran; i++) {
      double turnUhelStupne = 90 + i * uhelStupne;
      zofka.turnRight(turnUhelStupne);

      if (i % delitelnost == 0) {
        zofka.turnLeft(90);
        nakresliCarku(20);
        zofka.turnRight(90);
      }

      zofka.move(delkaStrany);
      zofka.turnLeft(turnUhelStupne);
    }

    zofka.penUp();
  }

  public void nakresliCarku(double delka) {
    zofka.move(delka);
    zofka.turnRight(180);
    zofka.move(delka);
    zofka.turnRight(180);
  }
}
