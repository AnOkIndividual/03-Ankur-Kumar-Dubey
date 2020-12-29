/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practical.five;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

/**
 *
 * @author ankur
 */
public class mylogger {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
       Logger l=Logger.getLogger(mylogger.class.getName());
FileHandler fh;
try
{
fh=new FileHandler("c:/users/ankur/desktop/mylogfile.log",true);
l.addHandler(fh);
l.setLevel(Level.ALL);
SimpleFormatter sf=new SimpleFormatter();
fh.setFormatter(sf);
l.info("My first log");
}
catch(SecurityException e)
{
e.printStackTrace();
}

catch(IOException e)
{
e.printStackTrace();
}
l.info("Hi How r u?");
    }
    
}
