import java.util.Scanner;

public class RunGame {

    private final Scanner userInput = new Scanner(System.in);

    private static final String THE_KINGS_MESSAGE =
            """
            You pass the Qualifications!
            We needed you for our current quest!
            Your goal is to defeat the Sphinx in the desert!
            It is blocking the entrance to Atlantis!
            We brought together the smartest and strongest people to do it!
            Please defeat it and return to be given any wish that I the king can grant!
            Good luck!
            Type anything to continue 'y'.
            """;

    private static final String MEETING_THE_SPHINX = """
            =========================
            Sphinx: ~)*@!#)$*!@#)!@#*
            The Warlock translates:
            ~Welcome Warrior, I will ask you three questions, and if you get them all right then I will do as you say and move~
            ~If you fail, then you will die many different ways...~ 
            ~Have fun huehuehuehue~
            =========================
            Type anything to continue 'y'.
            """;

    private static final String QUESTION_ONE = """
            =====================================================
            You measure my life in hours
            and i serve you by expiring.
            I'm quick when I'm thin and slow when I'm fat.
            The wind is my enemy. What am I?
            a) a man
            b) a candle
            c) a clock
            d) a match
            =====================================================
            """;

    private static final String DEATH_ONE = """
            ~!)@#()!@(#)!@#(@!)#()@!(#)!(~~)!@*#)!@(*#)!@#*)!@#*()!@#*~)!@*#)!@(*#)!@#*)!@#*()!@#*~)!@*#)!@(*#)!@#*)!@#*()!@#*
            
                    YOU HAVE CHOSEN DEATH! Multiple Meteor's fall from the sky and crush you and your party members.
            
            ~)!@*#)!@(*#)!@#*)!@#*()!@#*~)!@*#)!@(*#)!@#*)!@#*()!@#*~)!@*#)!@(*#)!@#*)!@#*()!@#*~)!@*#)!@(*#)!@#*)!@#*()!@#*!#
            """;

    private static final String SUCCESS_ONE = """
            =====================================================
            You are correct.... The next one won't be as easy..
            Type anything to continue 'y'.
            =====================================================
            """;

    private void printQuestionOne() {
        System.out.println(QUESTION_ONE);
    }

    private void questionOne() {
        String x = userInput.next();
        if(x.equals("a") || x.equals("c") || x.equals("d")) {
            System.out.println(DEATH_ONE);
            System.exit(0);
        }
        if(x.equals("b")) {
            System.out.println(SUCCESS_ONE);
            enter();
        }
    }

    private static final String QUESTION_TWO = """
            =====================================================
            What word in the English language does the following:
            the first two letters signify a male,
            the first three letters signify a female,
            the first four letters signify a great,
            while the entire world signifies a great woman.
            What is the word?
            a) Heroism
            b) Heroic
            c) Heroine
            d) Heron
            =====================================================
            """;

    private static final String DEATH_TWO = """
            ~!)@#()!@(#)!@#(@!)#()@!(#)!(~~)!@*#)!@(*#)!@#*)!@#*()!@#*~)!@*#)!@(*#)!@#*)!@#*()!@#*~)!@*#)!@(*#)!@#*)!@#*()!@#*
                                 HEHEHE, You really thought you could solve it~~ Sorry
                                                 OMAE WA MOU SHINDEIRU
                                                    SHINGGGGGGGG.
            ~)!@*#)!@(*#)!@#*)!@#*()!@#*~)!@*#)!@(*#)!@#*)!@#*()!@#*~)!@*#)!@(*#)!@#*)!@#*()!@#*~)!@*#)!@(*#)!@#*)!@#*()!@#*!#
            """;

    private static final String SUCCESS_TWO = """
            ==========================================================================================================
            WHAT HOW?? Hm well I guess consider yourself lucky... No more multiple choice. You will perish.
            Type anything to continue 'y'.
            ==========================================================================================================
            """;

    private void printQuestionTwo() {
        System.out.println(QUESTION_TWO);
    }

    private void questionTwo() {
        String x = userInput.next();
        if(x.equals("a") || x.equals("b") || x.equals("d")) {
            System.out.println(DEATH_TWO);
            System.exit(0);
        }
        if(x.equals("c")) {
            System.out.println(SUCCESS_TWO);
            enter();
        }
    }

    private static final String QUESTION_THREE = """
            
            ==============================================
            What can go through glass without breaking it?
            ==============================================
            
            """;

    private static final String DEATH_THREE = """
            ~!)@#()!@(#)!@#(@!)#()@!(#)!(~~)!@*#)!@(*#)!@#*)!@#*()!@#*~)!@*#)!@(*#)!@#*)!@#*()!@#*~)!@*#)!@(*#)!@#*)!@#*()!@#*
            
                    Hahahahahah I knew it, No one can beat the Great Sphinx. I REVEAL MY TRAP CARD -> RICARDO MILOS
            
            ~)!@*#)!@(*#)!@#*)!@#*()!@#*~)!@*#)!@(*#)!@#*)!@#*()!@#*~)!@*#)!@(*#)!@#*)!@#*()!@#*~)!@*#)!@(*#)!@#*)!@#*()!@#*!#
            """;

    private static final String SUCCESS_THREE = """
            =====================================================
            NO THIS IS IMPOSSIBLE MY DECK WAS PERFECT... 
            HMPH WELL TOO BAD FOR YOU MY BROTHER IS STILL ALIVE, 
            GOOD LUCK BEATING HIM DOWN THE ROAD HAHAHAHAHAHA~
            Explosions~*!@#)*@)#*!)@#*
            =====================================================
            """;

    private void printQuestionThree() {
        System.out.println(QUESTION_THREE);
    }

    private void questionThree() {
        String x = userInput.next();
        if(x.equals("light")) {
            System.out.println(SUCCESS_THREE);
        } else {
            System.out.println(DEATH_THREE);
            System.exit(0);
        }
    }

    private void enter() {
        userInput.next();
    }

    private void beginningDialogue() {
        // TODO sanitize input
        System.out.println("Hello Warrior, what is your name? ");
        userInput.next();
        System.out.println("What is your class? Warrior, Mage, Cleric, Assassin ");
        userInput.next();
        System.out.println("What is your age? ");
        int x = userInput.nextInt();
        if(x < 18) {
            System.out.println("You are too inexperienced, come back when you are older.");
            System.exit(0);
        }
    }

    private void startingDialogue() {
        System.out.println(THE_KINGS_MESSAGE);
        enter();
        System.out.println(MEETING_THE_SPHINX);
        enter();
    }

    private void startGame() {
        beginningDialogue();
        startingDialogue();
        printQuestionOne();
        questionOne();
        printQuestionTwo();
        questionTwo();
        printQuestionThree();
        questionThree();
    }

    public static void main(String[] args) {
        RunGame g = new RunGame();
        g.startGame();
    }
}
