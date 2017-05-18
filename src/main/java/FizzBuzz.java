/**
 * ClassName
 * <p>
 * Created by Alfredo Gil Rubio
 * <p>
 * Date: 15/05/17 15:30
 */
public class FizzBuzz {

    public String sayNumber(int pointedNumber)
    {
        if(pointedNumber%3==0)
        {
            return "Fizz";
        }
        return String.valueOf(pointedNumber);
    }
}
