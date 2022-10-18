import java.util.HashMap;
import java.util.Map;

public class Calculations 
{
    private Stack<Character> m_opStack = new Stack<>(20);
    private String m_postfixForm = "";
    private String m_text;
    private HashMap<Character, Integer> m_levels = new HashMap<Character, Integer>() {
        {
            // Highest level Operators (
            put('(', 3);

            // Operators ^
            put('^', 2);

            // Operators / *
            put('/', 1);
            put('*', 1);

            // Lowest level Operators + - 
            put('+', 0);
            put('-', 0);
        }
    };

    public Calculations(String text){
        this.m_text = text;
    }

    // Utilities...
    public void InfixToPostfix()
    {
        boolean isStartingWithAlpha = false;

        for (Character letter : m_text.toCharArray()) {
            Character c = Character.toLowerCase(letter);

            if(m_levels.get(c) == 3){
                if(!m_opStack.isEmpty()){
                    if(m_levels.get(c) < 3){
                        // Should be deleted...
                    }
                }
            }

            if(c > 65 && c < 65+26){
                m_postfixForm += c;
            }
        }
    }

}
