public class EmptyLinkedListException extends Exception {
  private static final long serialVersionUID = 2L;

  EmptyLinkedListException() {}

  public EmptyLinkedListException(String message) {
    super(message);
  } 
}