package greeter.hello;

public class HelloWorld {
  private final String name;
  
  public HelloWorld(String user) {
    this.name = user;
  }
  
  public String hello() {
    return String.format("Hello %s from Java library!", this.name);
  }
  
  public void sayHello() {
    String message = this.hello();
    System.out.println(message);
  }
}
