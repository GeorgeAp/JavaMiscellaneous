import java.io.Closeable;
import java.io.IOException;

public class ExceptionsChallenge {

    static String marvelHero = "";

    public static void main(String... marvel) throws Exception{
        Logan logan = new Logan();
        new ExceptionsChallenge().executeAction(new PeterParker(), logan);
        System.out.println(marvelHero + logan.wolverineCloseCount);
    }

    private void executeAction(Closeable spiderMan, AutoCloseable wolverine) throws Exception{
        try(spiderMan; wolverine){
            wolverine.close();
        }
        catch (Exception ignore){
            marvelHero += "?";
            spiderMan.close();
        }
    }

    static class PeterParker implements Closeable{
        public void close(){
            marvelHero += "#";
        }
    }

    static class Logan implements AutoCloseable{
        int wolverineCloseCount = 0;

        public void close() throws IOException{
            marvelHero += ">";
            wolverineCloseCount++;

            if (wolverineCloseCount >= 1){
                throw new IOException();
            }
        }
    }
}
