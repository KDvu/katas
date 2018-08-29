public class EmptyStackException extends Exception{
  private static final long serialVersionUID = 42L;

  EmptyStackException() {}
  
  public EmptyStackException(String message) {
    super(message);
  }
}