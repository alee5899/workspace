package static_study;

public class Acconunt {
  String owner;
  int money;
  static double iyul;//이율

  static {
    iyul = 5.0;
  }

  public Acconunt(String owner){
    this.owner = owner;
    money = 50000;
    iyul = 5.0;
  }
}
