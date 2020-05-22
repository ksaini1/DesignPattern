package troubleShootSearch.util;

import troubleShootSearch.util.MyLogger.DebugLevel;

public class MyLogger{

    /*DEBUG_VALUE=4 [Print when file proccesor is invoked]
      DEBUG_VALUE=3 [Print everytime Stemming Match is called. ]
      DEBUG_VALUE=2 [Print everytime semantic Match is called.]
      DEBUG_VALUE=1 [Print everytime Exact Match Function is called.]
      DEBUG_VALUE=0 [No output on console but write is performed on output file ]
    */

    public static enum DebugLevel {RELEASE,EXACT,SEMANTIC,STEMMING,CONSTRUCTOR
                                   };

    private static DebugLevel debugLevel;


    public static void setDebugValue (int levelIn) {
	switch (levelIn) {
	  case 4: debugLevel = DebugLevel.CONSTRUCTOR; break;
	  case 3: debugLevel = DebugLevel.STEMMING; break;
	  case 2: debugLevel = DebugLevel.SEMANTIC; break;
	  case 1: debugLevel = DebugLevel.EXACT; break;
	  case 0: debugLevel = DebugLevel.RELEASE; break;
	}
    }

    public static void setDebugValue (DebugLevel levelIn) {
	debugLevel = levelIn;
    }

    // @return None
    public static void writeMessage (String  message  ,
                                     DebugLevel levelIn ) {
	if (levelIn == debugLevel)
	    System.out.println(message);
    }
    
    public static void Message (String message) {
        System.out.println(message);
    }

    /**
	 * @return String
	 */
    public String toString() {
	return "Debug Level is " + debugLevel;
    }
}
