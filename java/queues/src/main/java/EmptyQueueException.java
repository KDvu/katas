public class EmptyQueueException extends Exception {
  private static final long serialVersionUID = 1L;

  EmptyQueueException() {}

  public EmptyQueueException(String message) {
    super(message);
  } 
}