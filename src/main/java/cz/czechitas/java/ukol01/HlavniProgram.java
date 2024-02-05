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
    /*nakresliPrasatko();

    zofka.move(150);

    nakresliMnohouhelnik(8);

    zofka.turnRight(90);
    zofka.move(150);
    zofka.turnLeft(90);

    nakresliMnohouhelnik(60);

    zofka.turnRight(90);
    zofka.move(170);
    zofka.turnLeft(90);

    nakresliSlunicko(60);*/

    /////////////////////
    zofka.setX(100);
    zofka.setY(220);

    for (int i = 0; i < 5; i++) {
      nakresliDomecek();

      if (i < (5 - 1)) {
        zofka.turnRight(90);
        zofka.move(150);
        zofka.turnLeft(90);
      }
    }

    zofka.turnRight(180);
    zofka.move(200);
    zofka.turnRight(90);
    zofka.move(600);
    zofka.turnRight(90);

    nakresliDomecek();

    zofka.turnRight(90);
    zofka.move(300);
    zofka.turnLeft(90);

    nakresliPrasatkoDruhe();

    zofka.turnRight(90);
    zofka.move(200);
    zofka.turnLeft(90);

    nakresliDomecek();

    zofka.move(400);
    zofka.turnLeft(90);
    zofka.move(500);
    zofka.turnRight(90);

    nakresliSlunicko(60);

    zofka.turnRight(90);
    zofka.move(300);
    zofka.turnLeft(90);

    podepis();
  }

  public void podepis() {
    zofka.turnRight(180);
    zofka.move(50);
    zofka.turnRight(180);

    pismenoA();
    pismenoN();
    pismenoN();
    pismenoA();
  }

  public void pismenoA() {
    zofka.penDown();
    zofka.turnRight(30);
    zofka.move(50);
    zofka.turnRight(120);
    zofka.move(50);
    zofka.turnRight(180);
    zofka.move(25);
    zofka.turnLeft(60);
    zofka.move(25);
    zofka.turnLeft(60);
    zofka.move(25);
    zofka.penUp();
    zofka.turnLeft(120);
    zofka.move(70);
    zofka.turnLeft(90);
  }

  public void pismenoN() {
    zofka.penDown();
    zofka.move(50);
    zofka.turnRight(150);
    zofka.move(60);
    zofka.turnLeft(150);
    zofka.move(50);
    zofka.penUp();
    zofka.turnRight(180);
    zofka.move(50);
    zofka.turnLeft(90);
    zofka.move(20);
    zofka.turnLeft(90);
  }

  public void nakresliPrasatkoDruhe() {
    zofka.turnRight(180);
    zofka.move(75);
    zofka.turnRight(90);
    nakresliDomecek();
    zofka.turnRight(90);
    nakresliNohyDruhe();
    zofka.turnRight(90);
    zofka.move(100);
    zofka.turnLeft(90);
    nakresliNohyDruhe();
    zofka.move(75);
  }
  /*public void nakresliPrasatko() {
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
  }*/

  public void nakresliNohyDruhe() {
    zofka.penDown();
    zofka.turnRight(150);
    zofka.move(20);
    zofka.turnRight(180);
    zofka.move(20);
    zofka.turnLeft(330);

    zofka.turnRight(210);
    zofka.move(20);
    zofka.turnRight(180);
    zofka.move(20);
    zofka.turnLeft(30);
    zofka.penUp();
  }

  /*public void nakresliNohy() {
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
  }*/

  public void nakresliDomecek() {
    nakresliObdelnik(75, 100);
    nakresliRovnostrannyTrojuhelnik(75);
  }
  public void nakresliObdelnik(int osaX, int osaY) {
    zofka.penDown();
    zofka.turnRight(90);
    zofka.move(osaX);
    zofka.turnRight(90);
    zofka.move(osaY);
    zofka.turnRight(90);
    zofka.move(osaX);
    zofka.turnRight(90);
    zofka.move(osaY);
    zofka.penUp();
  }

  public void nakresliRovnostrannyTrojuhelnik(int delkaStrany) {
    zofka.penDown();
    zofka.turnRight(30);
    zofka.move(delkaStrany);
    zofka.turnRight(120);
    zofka.move(delkaStrany);
    zofka.turnRight(120);
    zofka.move(delkaStrany);
    zofka.turnRight(90);
    zofka.penUp();
  }

  /*public void nakresliMnohouhelnik(double pocetStran) {
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
  }*/

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
