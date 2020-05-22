To run the program please use this commands
ant clean 
ant all
ant run -Darg0=product1.txt -Darg1=product2.txt -Darg2=product3.txt -Darg3=product4.txt -Darg4=input2.txt -Darg5=input3.txt -Darg6=output.txt -Darg7=4

THESE ARE THE FUNCTIONS WHAT EACH DEBUG VALUE PERFORM

  /*DEBUG_VALUE=4 [Print when file proccesor is invoked]
      DEBUG_VALUE=3 [Print everytime Stemming Match is called. ]
      DEBUG_VALUE=2 [Print everytime semantic Match is called.]
      DEBUG_VALUE=1 [Print everytime Exact Match Function is called.]
      DEBUG_VALUE=0 [No output on console but write is performed on output file ]
    */