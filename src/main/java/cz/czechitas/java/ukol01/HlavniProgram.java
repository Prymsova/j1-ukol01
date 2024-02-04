package cz.czechitas.java.ukol01;

import cz.czechitas.java.ukol01.engine.Turtle;

public class HlavniProgram {
  private Turtle zofka;

  public static void main(String[] args) {
    new HlavniProgram().start();
  }

  public void start() {
    zofka = new Turtle();

    //TODO implementace domácího úkolu

    nakresliPrasatko();
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

}
