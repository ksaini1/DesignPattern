package multiThreadedHS.util;

public class MyLogger{

    /*DEBUG_VALUE=4 [Print everytime a constructor is invoked]
      DEBUG_VALUE=3 [Print everytime a joining operation is performed. ]
      DEBUG_VALUE=2 [Print everytime sorting is done for each thread.]
      DEBUG_VALUE=1 [Print everytime a Thread is created .]
      DEBUG_VALUE=0 [No output on console but write is performed on output file ]
    */

    public static enum DebugLevel {RELEASE,THREAD_CREATE, SORTING, JOINING, CONSTRUCTOR
                                   };

    private static DebugLevel debugLevel;


    public static void setDebugValue (int levelIn) {
	switch (levelIn) {
	  case 4: debugLevel = DebugLevel.CONSTRUCTOR; break;
	  case 3: debugLevel = DebugLevel.JOINING; break;
	  case 2: debugLevel = DebugLevel.SORTING; break;
	  case 1: debugLevel = DebugLevel.THREAD_CREATE; break;
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
