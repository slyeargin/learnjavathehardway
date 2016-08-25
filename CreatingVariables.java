public class CreatingVariables {
  public static void main( String[] args ) {
    int x, y, age, another;
    double seconds, e, checking, yetAnother;
    String firstName, lastName, title, one, two;

    x = 10;
    y = 400;
    age = 39;
    another = 1;

    seconds = 4.71;
    e = 2.71828182845904523536;
    checking = 1.89;
    yetAnother = 1.00;

    firstName = "Graham";
    lastName = "Mitchell";
    title = "Mr.";
    one = "one";
    two = "two";

    System.out.println( "The variable x contains " + x );
    System.out.println( "The value " + y + " is stored in the variable y." );
    System.out.println( "The experiment took " + seconds + " seconds." );
    System.out.println( "A favorite irrational # is Euler's number: " + e );
    System.out.println( "Hopefully you have more than $" + checking + "!" );
    System.out.println( "My name's " + title + " " + firstName + lastName );
    System.out.println( "Another (" + another + ") and yet another (" + yetAnother + ") and " + one + " and " + two + "!" );
  }
}
