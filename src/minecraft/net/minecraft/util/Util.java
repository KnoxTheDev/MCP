package net.minecraft.util;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import org.apache.logging.log4j.Logger;

public class Util
{
    public static Util.EnumOS getOSType()
    {
        String s = System.getProperty("os.name").toLowerCase();

        if (s.contains("win"))
        {
            return Util.EnumOS.WINDOWS;
        }
        else if (s.contains("mac"))
        {
            return Util.EnumOS.OSX;
        }
        else if (s.contains("solaris"))
        {
            return Util.EnumOS.SOLARIS;
        }
        else if (s.contains("sunos"))
        {
            return Util.EnumOS.SOLARIS;
        }
        else if (s.contains("linux"))
        {
            return Util.EnumOS.LINUX;
        }
        else
        {
            return s.contains("unix") ? Util.EnumOS.LINUX : Util.EnumOS.UNKNOWN;
        }
    }

    public static <V> V runTask(FutureTask<V> task, Logger logger)
    {
        try
        {
            task.run();
            return task.get();
        }
        catch (ExecutionException executionexception)
        {
            logger.fatal("Error executing task", (Throwable)executionexception);
        }
        catch (InterruptedException interruptedexception)
        {
            logger.fatal("Error executing task", (Throwable)interruptedexception);
        }

        return (V)null;
    }

    public static enum EnumOS
    {
        LINUX,
        SOLARIS,
        WINDOWS,
        OSX,
        UNKNOWN;
    }
}
