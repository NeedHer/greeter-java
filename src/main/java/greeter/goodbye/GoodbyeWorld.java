package greeter.goodbye;

public class GoodbyeWorld {
  private final String name;
  
  public GoodbyeWorld(String user) {
    this.name = user;
  }
  
  public String goodbye() {
    return String.format("Goodbye %s from Java library!", this.name);
  }
  
  public void sayGoodbye() {
    String message = this.goodbye();
    System.out.println(message);
  }
}
